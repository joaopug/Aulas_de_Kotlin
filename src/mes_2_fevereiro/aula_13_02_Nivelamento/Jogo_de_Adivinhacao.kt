package mes_2_fevereiro.aula_13_02_Nivelamento

import kotlin.random.Random
fun main() {

    val numeroSecreto = Random.nextInt(1, 101)
    var tentativa = 0
    var tentativas = 0

    println("Tente adivinhar o número entre 1 e 100!")

    while (true) {
        print("Digite seu palpite: ")
        tentativa = readlnOrNull()?.toIntOrNull() ?: 0
        tentativas++
        if (tentativa == numeroSecreto) {
            println("Parabéns! Você acertou em $tentativas tentativas.")
            break
        } else if (tentativa < numeroSecreto) {
            println("Tente um número maior.")
        } else {
            println("Tente um número menor.")
        }
    }

}