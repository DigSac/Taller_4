package Ejercicios

fun main() {
    var lista_edades: MutableList<Int> = mutableListOf()
    print("Ingrese la edad: ")
    var edad = readln()!!.toInt()
    while (edad > 0) {
        lista_edades.add(edad)
        print("Ingrese la edad: ")
        edad = readln()!!.toInt()
    }
    var (siglo_pasado, promedio) = edades(lista_edades)
    println("Hay $siglo_pasado estudiantes del siglo pasado")
    println("El promedio de edad de la Universidad es $promedio")
}

fun edades(lista_edades: MutableList<Int>): Pair<Int, Double> {
    var siglo_pasado = 0
    var suma = 0
    for(edad in lista_edades) {
        if (edad >= 22) {
            siglo_pasado += 1
        }
        suma += edad
    }
    var promedio = suma / lista_edades.size
    return Pair(siglo_pasado, promedio.toDouble())
}