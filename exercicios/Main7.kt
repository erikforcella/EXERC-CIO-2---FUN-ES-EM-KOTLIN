package org.example

import kotlin.math.sqrt

fun main() {
    var baseMaior: Double? = null
    var baseMenor: Double? = null
    var altura: Double? = null

    do {
        print("Insira a base menor do trapézio: ")
        baseMenor = readLine()!!.toDoubleOrNull()

        if (baseMenor == null) {
            println("Dado não inserido ou inválido. Insira novamente a base menor do trapézio.")
        }
    } while (baseMenor == null)

    do {
        print("Insira a base maior do trapézio: ")
        baseMaior = readLine()!!.toDoubleOrNull()

        if (baseMaior == null) {
            println("Dado não inserido ou inválido. Insira novamente a base maior do trapézio.")
        }
    } while (baseMaior == null)

    do {
        print("Insira a altura do trapézio: ")
        altura = readLine()!!.toDoubleOrNull()

        if (altura == null) {
            println("Dado não inserido ou inválido. Insira novamente a altura do trapézio.")
        }
    } while (altura == null)

    val area = calcularArea(baseMaior, baseMenor, altura)

    print("A área do trapézio é: $area")
}

fun calcularArea(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return (baseMenor + baseMaior) * altura / 2
}