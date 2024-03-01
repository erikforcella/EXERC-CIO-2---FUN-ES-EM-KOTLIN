package org.example

import kotlin.math.sqrt

fun main() {
    var base: Double? = null
    var altura: Double? = null

    do {
        print("Insira a altura do retângulo: ")
        altura = readLine()!!.toDoubleOrNull()

        if (altura == null) {
            println("Dado não inserido ou inválido. Insira novamente a altura do retângulo.")
        }
    } while (altura == null)

    do {
        print("Insira a base do retângulo: ")
        base = readLine()!!.toDoubleOrNull()

        if (base == null) {
            println("Dado não inserido ou inválido. Insira novamente a base do retângulo.")
        }
    } while (base == null)

    val area = calcularArea(altura, base)

    print("A área do retângulo é: $area")
}

fun calcularArea(altura: Double, base: Double): Double {
    return altura * base
}