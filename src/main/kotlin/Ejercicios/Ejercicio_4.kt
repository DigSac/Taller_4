package Ejercicios

fun main() {
    var N: Int
    print("Ingrese el numero de estudiamtes del curso: ")
    N = readln()!!.toInt()
    var lista_notas: MutableList<Double> = mutableListOf()
    repeat(N) {
        print("Ingrese la nota del curso entre 0.0 y 5.0:  ")
        lista_notas.add(readln()!!.toDouble())
    }
    var (perdieron, promedio) = promedio(lista_notas)
    println("${(N - perdieron)} estudiantes pasaron el curso")
    println("$perdieron estudiantes perdieron el curso")
    println("El promedio del curso es $promedio")
}

fun promedio(lista_notas: MutableList<Double>): Pair<Int, Double> {
    var suma = 0.0
    var perdieron = 0
    for (nota in lista_notas) {
        if (nota < 3.0) {
            perdieron += 1
        }
        suma += nota
    }
    return Pair(perdieron, suma / lista_notas.size)
}