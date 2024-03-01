package org.example

import kotlin.math.sqrt

fun main() {
    var raio: Double? = null

    do {
        print("Insira o raio da circunferência: ")
        raio = readLine()!!.toDoubleOrNull()

        if (raio == null) {
            println("Dado não inserido ou inválido. Insira novamente o raio da circunferência.")
        }
    } while (raio == null)

    val area = calcularArea(raio)

    print("A área do raio da circunferência é: $area")
}

fun calcularArea(raio: Double): Double {
    return Math.PI * raio * raio
}