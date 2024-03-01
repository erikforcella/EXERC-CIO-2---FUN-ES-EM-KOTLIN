package org.example

import kotlin.math.sqrt

fun main() {
    var diagonalMaior: Double? = null
    var diagonalMenor: Double? = null

    do {
        print("Insira a diagonal menor do losango: ")
        diagonalMenor = readLine()!!.toDoubleOrNull()

        if (diagonalMenor == null) {
            println("Dado não inserido ou inválido. Insira novamente a diagonal menor do losango.")
        }
    } while (diagonalMenor == null)

    do {
        print("Insira a diagonal maior do losango: ")
        diagonalMaior = readLine()!!.toDoubleOrNull()

        if (diagonalMaior == null) {
            println("Dado não inserido ou inválido. Insira novamente a diagonal maior do losango.")
        }
    } while (diagonalMaior == null)

    val area = calcularArea(diagonalMaior, diagonalMenor)

    print("A área do losango é: $area")
}

fun calcularArea(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}