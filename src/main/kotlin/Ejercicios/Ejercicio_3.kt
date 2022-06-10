package Ejercicios

fun main() {
    var num: Int
    print("Cuantas palabras desea ingresar?  ")
    num = readln()!!.toInt()
    var lista_palabras: MutableList<String> = mutableListOf()
    repeat(num) {
        print("Ingrese una palabra:  ")
        lista_palabras.add(readln()!!.toString())
    }
    println("Hay ${verbos(lista_palabras)} verbos en la lista")
}

fun verbos(lista_palabras: MutableList<String>): Int {
    var count =0
    for (palabra in lista_palabras) {
        if (palabra.uppercase().endsWith("AR") ||
            palabra.uppercase().endsWith("ER") ||
            palabra.uppercase().endsWith("IR")
        ){
            count +=1
        }
    }
    return count
}