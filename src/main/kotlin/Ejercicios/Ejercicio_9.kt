package Ejercicios

fun main() {
    var num: Int
    print("Cuantos puntos desea ingresar?  ")
    num = readln()!!.toInt()
    var lista_puntos: MutableList<Pair<Double, Double>> = mutableListOf()
    var x: Double
    var y: Double
    repeat(num) {
        print("Ingrese la coordenada x del punto ${it + 1}:  ")
        x = readln()!!.toDouble()
        print("Ingrese la coordenada y del punto ${it + 1}:  ")
        y = readln()!!.toDouble()
        lista_puntos.add(Pair(x, y))
    }
    var (punto, distancia, cuadrante) = punto_mayor_distancia(lista_puntos)
    println("Las coordenadas del punto de mayor distancia es $punto, con una distancia de $distancia y esta ubicado en el cuadrante $cuadrante")
}

fun distancia_origen(punto: Pair<Double, Double>): Double {
    return Math.sqrt(Math.pow(punto.first, 2.0) + Math.pow(punto.second, 2.0))
}

fun cuadrante(punto: Pair<Double, Double>): String =
    when {
        punto.first > 0.0 && punto.second == 0.0 -> "1-4"
        punto.first > 0.0 && punto.second > 0.0 -> "1"
        punto.first == 0.0 && punto.second > 0.0 -> "1-2"
        punto.first < 0.0 && punto.second > 0.0 -> "2"
        punto.first < 0.0 && punto.second == 0.0 -> "2-3"
        punto.first < 0.0 && punto.second < 0.0 -> "3"
        punto.first == 0.0 && punto.second < 0.0 -> "3-4"
        punto.first > 0.0 && punto.second < 0.0 -> "4"
        else -> "0"
    }

fun punto_mayor_distancia(lista_puntos: List<Pair<Double, Double>>): Triple<Pair<Double, Double>, Double, String> {
    var punto_mayor = lista_puntos[0]
    var distancia_mayor = distancia_origen(punto_mayor)
    var distancia_temp: Double
    for (i in 1 .. lista_puntos.size - 1) {
        distancia_temp = distancia_origen(lista_puntos[i])
        if (distancia_mayor < distancia_temp) {
            punto_mayor = lista_puntos[i]
            distancia_mayor = distancia_temp
        }
    }
    return Triple(punto_mayor, distancia_mayor, cuadrante(punto_mayor))
}
