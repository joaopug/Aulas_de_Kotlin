package marco.exercicios.ex3

val expressaoRegularMenu = Regex("[0-3]")

fun main() {
    menu()
}

fun menu() {
    do {
        println(
            "\nMega App de Programas Paia" +
                    "\n\n---Menu---" +
                    "\n1 - Somador de números reais" +
                    "\n2 - Gerador de número aleatório" +
                    "\n3 - Armazenador de números reais" +
                    "\n0 - Sair"
        )


        val opcao = readln()

        if (expressaoRegularMenu.matches(opcao)) {
            when (opcao.toInt()) {
                1 -> {
                    somador()
                }

                2 -> {
                    gerador()
                }

                3 -> {
                    armazenador()
                }

                0 -> {
                    println("Saindo...")
                }

            }

        } else {
            println("\n\n\nOpcão inválida!")
        }
    } while (opcao != "0")
}

private fun somador() {
    println("Diga quantos números quer somar:")
    val qtdN = readln().toInt()
    var resposta = 0.0
    for (i in 1..qtdN) {
        println("Qual é o ${i}º que deseja somar?")
        resposta += readln().toDouble()
    }
    println("Resultado da soma: $resposta")
}

private fun gerador() {
    println("Qual é intervalo do número aleatória")
}
private fun armazenador() {}