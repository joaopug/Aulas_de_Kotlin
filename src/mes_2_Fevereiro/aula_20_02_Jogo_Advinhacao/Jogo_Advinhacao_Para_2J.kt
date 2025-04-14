package mes_2_Fevereiro.aula_20_02_Jogo_Advinhacao

import kotlin.random.Random

fun main() {
    val nomesJogadores = arrayOfNulls<String>(2)
    var tentativasP1 = 0
    var tentativasP2 = 0
    var tentativa: String

    for (i in nomesJogadores.indices) {
        print("Qual é o nome do jogador ${i + 1}? \nNome: ")
        nomesJogadores[i] = readln()
    }

    println("Jogadores: ${nomesJogadores[0]}, ${nomesJogadores[1]}")

    val numeroAleatorio = Random.nextInt(1, 101)

    println("Qual é o número secreto, ${nomesJogadores[0]}?")
    while (true) {
        println("Número: ")
        tentativa = readln()
        tentativasP1++

        println("Jogador 1: \"Tentei o número $tentativa!\"")

        if (numeroAleatorio < tentativa.toInt()) {
            println("Sistema: \"⬆ O número secreto é menor!\"")
        } else if (numeroAleatorio > tentativa.toInt()) {
            println("Sistema: \"⬇ O número secreto é maior!\"")
        } else {
            println("Sistema: \"🎉 Você acertou o número secreto!\"")
            break
        }
    }

    println("Qual é o número secreto, Jogador 2?")
    while (true) {
        println("Número: ")
        tentativa = readln()
        tentativasP2++

        println("Jogador 2: \"Tentei o número $tentativa!\"")

        if (numeroAleatorio < tentativa.toInt()) {
            println("Sistema: \"⬇ O número secreto é menor!\"")
        } else if (numeroAleatorio > tentativa.toInt()) {
            println("Sistema: \"⬆ O número secreto é maior!\"")
        } else {
            println("Sistema: \"🎉 Você acertou o número secreto!\"")
            break
        }
    }
    if (tentativasP1 < tentativasP2) {
        println("\n🏆 Parabéns, ${nomesJogadores[0]}! Você acertou o número secreto em $tentativasP1 tentativa(s)!\"")
    } else if (tentativasP1 > tentativasP2) {
        println("\n🏆 Parabéns, ${nomesJogadores[1]}! Você acertou o número secreto em $tentativasP2 tentativa(s)!\"")
    } else {
        println("\n🤝 Empate! Ambos acertaram com o mesmo número de tentativas.\"")
    }

    println("\"O ${nomesJogadores[0]} fez $tentativasP1 tentativa(s)\"\n\"O ${nomesJogadores[1]} fez $tentativasP2 tentativa(s)\"")
}