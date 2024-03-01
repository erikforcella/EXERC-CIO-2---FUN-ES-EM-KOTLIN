package org.example

import kotlin.math.sqrt

fun main() {
    var lado: Double? = null

    do {
        print("Insira o lado do triângulo equilátero: ")
        lado = readLine()!!.toDoubleOrNull()

        if (lado == null) {
            println("Dado não inserido ou inválido. Insira novamente o lado do triângulo equilátero.")
        }
    } while (lado == null)

    val area = calcularArea(lado)

    print("A área do triângulo equilátero é: $area")
}

fun calcularArea(lado: Double): Double {
    return (lado * lado) * sqrt(3.0) / 4
}