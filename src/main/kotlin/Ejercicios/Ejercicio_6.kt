package Ejercicios

fun main() {
    var num: Int
    print("Cuantos estudiantes desea ingresar?  ")
    num = readln()!!.toInt()
    var lista_estudiantes: MutableList<Pair<String, Int>> = mutableListOf()
    var nacimiento: Int
    var nombre: String
    repeat(num) {
        print("Ingrese el nombre del estudiante ${it + 1}:  ")
        nombre = readln()!!.toString()
        print("Ingrese el ano de nacimiento del estudiante ${it + 1}:  ")
        nacimiento = readln()!!.toInt()
        lista_estudiantes.add(Pair(nombre, nacimiento))
    }
    println("El estudiante mas viejo de la clase es ${estudiante_viejo(lista_estudiantes)}")
}

fun estudiante_viejo(lista_estudiantes: MutableList<Pair<String, Int>>): String {
    var estudiante_viejo = lista_estudiantes[0]
    for (i in 1 .. lista_estudiantes.size - 1) {
        if (estudiante_viejo.second > lista_estudiantes[i].second){
            estudiante_viejo = lista_estudiantes[i]
        }
    }
    return estudiante_viejo.first
}