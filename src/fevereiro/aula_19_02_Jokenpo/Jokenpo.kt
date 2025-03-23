package fevereiro.aula_19_02_Jokenpo

data class Estatisticas(
    var vitoriasSolo: Int = 0,
    var derrotasSolo: Int = 0,
    var empatesSolo: Int = 0,
    var vitoriasJ1: Int = 0,
    var vitoriasJ2: Int = 0,
    var empatesMultijogador: Int = 0
)

fun main() {
    val estatisticas = Estatisticas()
    menu(estatisticas)
    println("\uD83C\uDFAE Obrigado por jogar!")
}

private fun menu(estatisticas: Estatisticas) {
    while (true) {
        println(
            "Rocha-Pergaminho-Podadereira Max Version" +
                    "\n\n---Menu---" +
                    "\n1 - 1 Jogador" +
                    "\n2 - 2 Jogadores" +
                    "\n3 - Estatísticas" +
                    "\n0 - Sair"
        )

        when (readln().toIntOrNull()) {
            1 -> {
                println("Jogar solo então...")
                jogoSolo(estatisticas)
            }

            2 -> {
                println("Em dois, boa...")
                jogoEmDupla(estatisticas)
            }

            3 -> {
                println("Tu é nerd...")
                verEstatisticas(estatisticas)
            }

            0 -> {
                println("Faloooooouu...")
                return
            }

            else -> println("Caractere inválido.")
        }
    }
}

private fun jogoSolo(estatisticas: Estatisticas) {
    println("\nBem-vindo ao mega modo Solo!!!")
    val opcoes = listOf("Rocha", "Pergaminho", "Podadeira")
    do {
        val escolhaComputador = opcoes.random()
        val escolhaUsuario = conversao(1)

        println("\n\uD83D\uDD37 Escolha do usuário: $escolhaUsuario")
        println("\uD83D\uDD36 Escolha do computador: $escolhaComputador")

        val resultado = analiseDasRespostas(escolhaUsuario, escolhaComputador, "solo")
        println("\nResultado: $resultado")

        when (resultado) {
            "Vitória" -> estatisticas.vitoriasSolo++
            "Derrota" -> estatisticas.derrotasSolo++
            "Empate" -> estatisticas.empatesSolo++
        }

    } while (verificarRepeticao("\nQuer jogar de novo? (S - Sim || N - Não)"))

    if (verificarRepeticao("Quer voltar ao menu? (S - Sim || N - Não)")) menu(estatisticas)
}

private fun jogoEmDupla(estatisticas: Estatisticas) {
    println("\nBem-vindo ao super divertido modo Matchmaking!!!")

    do {
        val movimentoJ1 = conversao(1)
        val movimentoJ2 = conversao(2)

        println("Escolha do Jogador 1: $movimentoJ1")
        println("Escolha do Jogador 2: $movimentoJ2")

        val resultado = analiseDasRespostas(movimentoJ1, movimentoJ2, "dupla")
        println("\nResultado: $resultado")

        when (resultado) {
            "Jogador 1 venceu" -> estatisticas.vitoriasJ1++
            "Jogador 2 venceu" -> estatisticas.vitoriasJ2++
            "Empate" -> estatisticas.empatesMultijogador++
        }

    } while (verificarRepeticao("\nQuer jogar de novo? (S - Sim || N - Não)"))

    if (verificarRepeticao("Quer voltar ao menu? (S - Sim || N - Não)")) menu(estatisticas)
}

private fun verificarRepeticao(mensagem: String): Boolean {
    println(mensagem)
    while (true) {
        when (readln().trim().uppercase()) {
            "S" -> return true
            "N" -> return false
            else -> println("Caractere inválido.")
        }
    }
}

private fun analiseDasRespostas(
    escolhaJ1: String,
    escolhaJ2: String,
    modo: String
): String {

    return when {
        escolhaJ1 == escolhaJ2 -> "Empate"
        (escolhaJ1 == "Rocha" && escolhaJ2 == "Podadeira") ||
                (escolhaJ1 == "Pergaminho" && escolhaJ2 == "Rocha") ||
                (escolhaJ1 == "Podadeira" && escolhaJ2 == "Pergaminho") ->
            if (modo == "solo") "Vitória" else "Jogador 1 venceu"

        else -> if (modo == "solo") "Derrota" else "Jogador 2 venceu"
    }
}

private fun conversao(jogador: Int): String {
    println(
        "\nJogador $jogador, escolha um dos movimentos:" +
                "\n(1 Rocha || 2 - Pergaminho || 3 - Podadeira)"
    )

    while (true) {
        try {
            val movimento = readln().trim().toInt()


            return when (movimento) {
                1 -> "Rocha"
                2 -> "Pergaminho"
                3 -> "Podadeira"
                else -> {
                    println("Dá um número entre 1 e 3, bro.")
                    continue
                }
            }
        } catch (e: NumberFormatException) {
            println("Dá um número válido, bro.")
        }
    }

}

private fun verEstatisticas(estatisticas: Estatisticas) {
    println(
        "\n---Modo solo---" +
                "\nVitórias: ${estatisticas.vitoriasSolo}" +
                "\nDerrotas: ${estatisticas.derrotasSolo}" +
                "\nEmpates: ${estatisticas.empatesSolo}" +
                "\n\n---Modo Multijogador---" +
                "\nVitórias do Jogador 1: ${estatisticas.vitoriasJ1}" +
                "\nVitórias do Jogador 2: ${estatisticas.vitoriasJ2}" +
                "\nEmpates: ${estatisticas.empatesMultijogador}"
    )
    if (verificarRepeticao("\nQuer voltar ao menu? (S - Sim || N - Não)")) menu(estatisticas)
}