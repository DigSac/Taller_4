package Ejercicios

fun main() {
    var lista_alturas: MutableList<Int> = mutableListOf()
    print("Ingrese la altura: ")
    var altura = readln()!!.toInt()
    while (altura >= 0 && altura > 3) {
        lista_alturas.add(altura)
        print("Ingrese la altura: ")
        altura = readln()!!.toInt()
    }
    var promedio = promedio_alturas(lista_alturas)
    println("El promedio de alturas es $promedio")
    println("Hay ${alturas_por_debajo(lista_alturas, promedio)} alturas por debajo del promedio ")
}

fun promedio_alturas(lista_alturas: MutableList<Int>): Double {
    var suma = 0
    for(altura in lista_alturas) {
        suma += altura
    }
    return (suma / lista_alturas.size).toDouble()
}

fun alturas_por_debajo(lista_alturas: MutableList<Int>, limite: Double): Int {
    var count = 0
    for(altura in lista_alturas) {
        if (altura < limite) {
            count +=1
        }
    }
    return count
}