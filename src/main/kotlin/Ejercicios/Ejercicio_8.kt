package Ejercicios

fun main() {
    var num: Int
    print("Cuantos triangulos desea ingresar?  ")
    num = readln()!!.toInt()
    var lista_triangulos: MutableList<Triple<String, Double, Double>> = mutableListOf()
    var nombre: String
    var base: Double
    var altura: Double
    repeat(num) {
        print("Ingrese el nombre del triangulo ${it + 1}:  ")
        nombre = readln()!!.toString()
        print("Ingrese la base del triangulo ${it + 1}:  ")
        base = readln()!!.toDouble()
        print("Ingrese la altura del triangulo ${it + 1}:  ")
        altura = readln()!!.toDouble()
        lista_triangulos.add(Triple(nombre, base, altura))
    }
    var triangulo_mayor_area = mayor_area(lista_triangulos)
    println("El triangulo de mayor area es $triangulo_mayor_area")
    println("El area del triangulo $triangulo_mayor_area es ${encontrar_area_triangulo(lista_triangulos, triangulo_mayor_area)}")
}

fun area_triangulo(base: Double, altura: Double): Double {
    return base * altura / 2
}

fun mayor_area(lista_triangulos: List<Triple<String, Double, Double>>): String {
    var triangulo_mayor_area = lista_triangulos[0]
    var area_mayor = area_triangulo(lista_triangulos[0].second, lista_triangulos[0].third)
    var area_temp: Double
    for (i in 1 .. lista_triangulos.size - 1) {
        area_temp = area_triangulo(lista_triangulos[i].second, lista_triangulos[i].third)
        if (area_mayor < area_temp) {
            triangulo_mayor_area = lista_triangulos[i]
            area_mayor = area_temp
        }
    }
    return triangulo_mayor_area.first
}

fun encontrar_area_triangulo(lista_triangulos: List<Triple<String, Double, Double>>, triangulo_a_buscar: String): Double {
    for (triangulo in lista_triangulos) {
        if (triangulo.first.equals(triangulo_a_buscar)){
            return area_triangulo(triangulo.second, triangulo.third)
        }
    }
    return -1.0
}