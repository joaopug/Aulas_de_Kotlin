package mes_3_marco.exercicios.ex3

import kotlin.random.Random

var i = 1
val expressaoRegularMenu = Regex("[0-3]")
val decisaoRegex = Regex("^[SN]$")
val Regexnumeros = Regex("-?\\d+")
var listaDeNumeros = mutableListOf<Int>()


fun main() {
    menu()
}

fun menu() {
    do {
        println(
            "\n\n\nMega App de Programas Paia" +
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
    println(
        "Bem vindo ao gerador de números." +
                "\n\nPrimeiro você deve escolher o número inicial" +
                "\ne depois o número final." +
                "\n\nApós, isso um número aleatório entre esses dois números será gerado."
    )

    println("\nNúmero inicial:")
    val n1 = readln().toInt()
    println("\nNúmero final:")
    val n2 = readln().toInt()

    val numeroSorteado = Random.nextInt(n1, n2)

    println("\nO número aleatório gerado entre $n1 e $n2 foi $numeroSorteado")
}

private fun armazenador() {
    println(
        "Armazene quantos números quiser," +
                "\no programa irá ordená-los em ordem crescente."
    )

    do {
        println("\nQual é o ${i}º número que deseja armazenar?")
        do {
            val numArmazenado = readln()
            if (Regexnumeros.matches(numArmazenado)){
                listaDeNumeros.add(numArmazenado.toInt())
                i++
            } else {
                println("Caractere inválido.")
            }
        } while (!Regexnumeros.matches(numArmazenado))

        var decisao: String

        println(
            "\n\nDeseja adicionar mais algum?" +
                    "\nS - sim || N - não"
        )

        do {
            decisao = readln().uppercase()
            if (!decisaoRegex.matches(decisao)) {
                println("Caractere Inválido.")
            }
        } while (!decisaoRegex.matches(decisao))

    } while (decisao != "N")

    listaDeNumeros.sort()
    println("Aqui está a lista ordenada:")
    println(listaDeNumeros.joinToString())
    i = 0
}