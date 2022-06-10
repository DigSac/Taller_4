package Ejercicios

fun main() {
    var lista_carros: MutableList<Pair<String, Double>> = mutableListOf()
    print("Ingrese la placa del vehiculo a ser agregado a la lista: ")
    var placa = readln()!!.toString()
    print("Ingrese el precio del vehiculo: ")
    var precio = readln()!!.toDouble()
    while (!placa.isEmpty() && precio > 0) {
        lista_carros.add(Pair(placa, precio))
        print("Ingrese la placa del vehiculo a ser agregado a la lista: ")
        placa = readln()!!.toString()
        print("Ingrese el precio del vehiculo: ")
        precio = readln()!!.toDouble()
    }
    print("Ingrese la placa del vehiculo del cual quiere consultar el precio: ")
    var placa_a_buscar = readln()
    var precio_encontrado = buscar_precio(lista_carros, placa_a_buscar)
    if (precio_encontrado > 0) {
        println("El precio del vehiculo de placas $placa_a_buscar es $precio_encontrado")
    }
    else {
        println("El vehiculo de placas $placa_a_buscar no se encuentra en el listado")
    }
}

fun buscar_precio(lista_carros: MutableList<Pair<String, Double>>, placa_a_buscar: String): Double {
    for (carro in lista_carros) {
        if (carro.first.equals(placa_a_buscar)){
            return carro.second
        }
    }
    return -1.0
}