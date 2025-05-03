package mes_2_fevereiro.aula_13_02_Nivelamento

fun main() {
    println("Digite um número: ")
    var numero = readLine()?.toIntOrNull() ?: 0

    var ehPrimo = true
    if (numero <= 1) {
        ehPrimo = false
    } else {
        for (i in 2 until numero) {
            if (numero % i == 0) {
                ehPrimo = false
                break
            }
        }
    }

    if (ehPrimo) {
        println("$numero é um número primo.")
    } else {
        println("$numero não é um número primo.")
    }
}