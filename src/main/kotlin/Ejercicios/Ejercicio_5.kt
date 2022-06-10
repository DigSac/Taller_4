package Ejercicios

fun main() {
    var lista_ciudades: MutableList<String> = mutableListOf()
    print("Ingrese una ciudad para ser agregada a la lista: ")
    var ciudad = readln()!!.toString()
    while (!ciudad.isEmpty()) {
        lista_ciudades.add(ciudad)
        print("Ingrese una ciudad para ser agregada a la lista: ")
        ciudad = readln()!!.toString()
    }
    print("Ingrese la ciudad a buscar dentro de la lista: ")
    var ciudad_a_buscar = readln()
    if (existe_ciudad(lista_ciudades, ciudad_a_buscar)) {
        println("La ciudad si existe en la lista")
    }
    else {
        println("La ciudad no existe en la lista")
    }
}

fun existe_ciudad(lista_ciudades: MutableList<String>, ciudad_a_buscar: String): Boolean {
    for (c in lista_ciudades) {
        if (c.uppercase().equals(ciudad_a_buscar.uppercase())){
            return true
        }
    }
    return false
}