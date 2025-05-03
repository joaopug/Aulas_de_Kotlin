package mes_3_marco.exercicios.ex2


var listaPessoas = mutableListOf<String>()
val nomePessoaRegex = Regex("^[a-zA-Z]+$")
val decisaoRegex = Regex("^[SN]$")

fun main() {
    var i = 1
    println(
        "Lista de pessoas" +
                "\n\nPara adicionar alguém, digite o nome da pessoa e pressione \"Enter\""
    )

    do {
        println("Nome da pessoa:")
        val pessoa = readln()
        if (nomePessoaRegex.matches(pessoa)) {
            listaPessoas.add(pessoa)
        } else {
            println("Caractere inválido.")
        }

        var decisao: String
        do {
            println(
                "Quer adicionar mais alguém?" +
                        "\n S - Sim || N - Não"
            )
            decisao = readln().uppercase()
            if (!decisaoRegex.matches(decisao)) {
                println("Caractere Inválido.")
            }
        } while (!decisaoRegex.matches(decisao))

    } while (decisao != "N")

    if (listaPessoas.isNotEmpty()) {
        println("\nLista de pessoas:")
        listaPessoas.forEach { nome ->
            println(
                "\nPessoa: $i:" +
                        "\nNome: $nome"
            )
            i++
        }
    }
}