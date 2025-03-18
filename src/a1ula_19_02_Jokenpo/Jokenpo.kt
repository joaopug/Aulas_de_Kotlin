package a1ula_19_02_Jokenpo

fun main() {
    val opcoes = listOf("Rocha", "Pergaminho", "Tesoura")
    val opcaoRandomizada = opcoes.random()

    println("\nBem-vindo ao mega jogo Rocha-Pergaminho-Podadereira Max Version!!!" + "\nDigite os seguintes comandos para jogar:" + "\n1 Rocha || 2 - Pergaminho || 3 - Podadeira")

    val escolha = readLine()!!

    val escolhaConvertida = when (escolha) {
        "1" -> "Rocha"
        "2" -> "Pergaminho"
        "3" -> "Podadeira"
        else -> {
            println("Daí não né cara?")
            return
        }
    }

    println("Escolha do usuário: $escolhaConvertida")
    println("Escolha do computador: $opcaoRandomizada")


    if (opcaoRandomizada == escolhaConvertida) {
        println("Empate")
    } else if (opcaoRandomizada == "Pergaminho" && escolha == "1" || opcaoRandomizada == "Rocha" && escolha == "3" || opcaoRandomizada == "Podadeira" && escolha == "2") {
        println("Perdeu")
    }  else if (opcaoRandomizada == "Tesoura" && escolha == "1" || opcaoRandomizada == "Rocha" && escolha == "2" || opcaoRandomizada == "Podadeira" && escolha == "1") {
        println("Venceu")
    }
}