package marco.exercicios.ex6

val decisaoRegex = Regex("^[SN]$")

val menuRegex = Regex("[1-2]")

fun main() {
    print(
        "Verificador do preço de rações" +
                "\n\nQual é o animal?" +
                "\n1 - Gato" +
                "\n2 - Cachorro"
    )

    do {
        val tipoDeRacao = readln()

        if (menuRegex.matches(tipoDeRacao)) {
            when (tipoDeRacao.toInt()) {
                1 -> deGato()
                2 -> deCachorro()

            }
        } else {
            println("\nCaractere inválido.")
        }
    } while (!menuRegex.matches(tipoDeRacao))
}

fun deGato() {
    val racao = RacaoDeGato()
    racao.peso = 1.0
    racao.preco = 15.00

    println(
        "\nVocê vai querer a ração para gatos castrados?" +
                "\n(S - sim || N - não)"
    )

    do {
        val castradoOuNao = readln().uppercase()

        if (decisaoRegex.matches(castradoOuNao)) {
            if (castradoOuNao == "S") {
                racao.paraCastrado = true
                racao.ricaEmFerro = true
                racao.desconto()
            } else {
                racao.desconto()
            }
        } else {
            println("\nCaractere inválido.")
        }
    } while (!decisaoRegex.matches(castradoOuNao))

    println("\nSua ração de gato irá custar R$ ${"%.2f".format(racao.preco)}.")
}

fun deCachorro() {
    val racao = RacaoDeCachorro()
    racao.peso = 1.0
    racao.preco = 17.00

    println(
        "\nVocê vai querer a ração fortalecedora de pelos?" +
                "\n(S - sim || N - não)"
    )

    do {
        val fortalecedoraOuNao = readln().uppercase()

        if (decisaoRegex.matches(fortalecedoraOuNao)) {
            if (fortalecedoraOuNao == "S") {
                racao.comPedacosDeCarne = true
                racao.comFortalecimentoDePelos = true
                racao.desconto()
            } else {
                racao.desconto()
            }
        } else {
            println("\nCaractere inválido.")
        }
    } while (!decisaoRegex.matches(fortalecedoraOuNao))

    println("\nSua ração de cachorro irá custar R$ ${"%.2f".format(racao.preco)}.")
}