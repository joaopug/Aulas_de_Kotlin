package marco.aula_31_03_Jokenpo_Versao_Prof

var pontos: Int = 0

fun main() {
    do {
        println("1-JOGAR")
        println("2-PLACAR")
        println("3-SAIR")

        val opcao = readln()//USUÁRIO DIGITA A

        when (opcao.toInt()) {
            1 -> jogar() //A SETINHA SE CHAMA LAMBDA
            2 -> print("placar")
            3 -> print("saindo...")
        }
    } while (opcao != "0")
}

fun jogar() {
    println("Digite seu apelido: ")
    val nickname = readln() //O USUÁRIO DIGITA SEU NICK

    println(
        "Apelido: $nickname" +
                "\nQUE OS JOGOS COMECEM"
    )

    var rodadas = 1
    do {
        println(
            "Que você quer jogar?" +
                    "\nPedra, papel outesoura?!"
        )
        var jogada = readln().uppercase()
        var pedra = Pedra()
        var tesoura = Tesoura()
        var papel = Papel()

        var movimentoPC = jogadaComputador()
        when (jogada) {
            "PEDRA" -> {
                pontos = pedra.luta(movimentoPC)
            }

            "PAPEL" -> {
                pontos = papel.luta(movimentoPC)
            }

            "TESOURA" -> {
                pontos = tesoura.luta(movimentoPC)
            }
        }
        println("Você tem: $pontos pontos!" +
                "\nPróxima rodada!")
        rodadas++ //no final da rodada incrementa
    } while (rodadas <= 3)
}

fun placar() {

}

fun jogadaComputador(): String {
    /**
     * Aqui temos um RANGE que é determinado por (1..3)
     * um "range" é um intervalo númerico, neste caso de 1 a 3,
     * a função ".random" irá gerar um número aleatório dentro
     * desse intervalo que determinamos
     */
    val movimento = (1..3).random()
    when (movimento) {
        1 -> return "TESOURA"
        2 -> return "PEDRA"
        3 -> return "PAPEL"
        else -> return ""
    }
}