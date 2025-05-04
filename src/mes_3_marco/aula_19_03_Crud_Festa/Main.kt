package mes_3_marco.aula_19_03_Crud_Festa

//Variável Global
var listaConvidados: MutableList<Convidado> = mutableListOf()

val regexSomenteLetras = Regex("^[A-Za-z]+$")

val regexSomenteNro1A5 = Regex("[0-5]")

val regexSomenteNros = Regex("\\d")

val regexDecisaoSN = Regex("^[SN]$")


fun main() {
    menu()
}

// QUESTÃO 1 - Valida para que o usuário
// somente digite LETRAS
private fun menu() {
    do {
        println(
            "--- MENU ---\n" +
                    "1- CADASTRAR\n" +
                    "2- LISTAR\n" +
                    "3- EDITAR\n" +
                    "4- EXCLUIR\n" +
                    "5- BUSCAR\n" +
                    "0- SAIR"
        )

        val opcao = readln()

        if (regexSomenteNro1A5.matches(opcao)) {
            when (opcao.toInt()) {
                1 -> {
                    println("\nCadastrando...")
                    cadastrar()
                }

                2 -> {
                    println("\nListando...")
                    listar()
                }

                3 -> {
                    println("\nEditando...")
                    editar()
                }

                4 -> {
                    println("\nExcluindo...")
                    excluir()
                }

                5 -> {
                    println("\nPesquisar será então...")
                    busca()
                }

                0 -> println("Saindo...")
            }
        } else {
            println("\n\n\nOpção inválida. Tente novamente.")
        }


    } while (opcao != "0")
}

private fun cadastrar() {
    //Instância
    val convidado = Convidado()

    println(
        "Qual é o seu nome?" +
                "\n(Somente letras)"
    )
    //val nome = readln()
    do {
        convidado.nome = readln()

        if (!regexSomenteLetras.matches(convidado.nome)) {
            println("\nSó dá para digitar letras!")
        }
    } while (!regexSomenteLetras.matches(convidado.nome))
    println("Qual vai ser o presente?")
    //val presente = readln()
    convidado.presente = readln()

    println("Qual é sua retrição alimentar?")
    //val alimento = readln()
    convidado.alimento = readln()

    listaConvidados.add(convidado)

}

/*fun algumaCoisa() : tipo
esperasse que
 */
private fun listar(): String {
    var i = 0
    if (validar()) {
        listaConvidados.forEach { convidado ->
            println(
                "\nPosição: ${i++}\n" +
                        "Nome: ${convidado.nome}\n" +
                        "Presente: ${convidado.presente}\n" +
                        "Restrição: ${convidado.alimento}\n" +
                        "Vai ir na festa: ${convidado.presenca}"
            ) //Fim do PRINT
        } //Fim do ForEach
    }//Fim do if
    return "\n Listagem feita com sucesso."
}

//QUESTÃO 2 - Validar para a variável só aceitar números
private fun editar(): Boolean {
    if (validar()) {

        listar()

        println(
            "\nQual posição deseja editar?" +
                    "\n(Somente números)"
        )

        do {
            val posicao = readln()

            if (regexSomenteNros.matches(posicao)) {

                println("\nO convidado vai? S/N")

                do {
                    val resposta = readln().uppercase()

                    if (regexDecisaoSN.matches(resposta)) {
                        when (resposta) {
                            "S" -> listaConvidados[posicao.toInt()].presenca = true
                            "N" -> listaConvidados[posicao.toInt()].presenca = false
                        }
                        println("Edição realizada com sucesso!")
                    } else {
                        println("\nResposta inválida.")
                    }
                } while (!regexDecisaoSN.matches(resposta))
            } else {
                println("\nIsso não é um número cara.")
            }

        } while (!regexSomenteNros.matches(posicao))
    }
    return true
}

//QUESTÃO 3 - Validar para a variável só aceitar números
private fun excluir(): Boolean {
    if (validar()) {
        listar()

        println(
            "Qual posição deseja exluir?" +
                    "\n(Somente números)"
        )

        do {

            val posicao = readln()

            if (regexSomenteNros.matches(posicao)) {

                listaConvidados.removeAt(posicao.toInt())
                /*listaConvidados.
                convidado.nome = ""
                convidado.alimento = ""
                convidado.presente = ""
                convidado.presenca = false*/
                print("Convidado exluido.")
            } else {
                println("\nIsso não é um número cara.")
            }
        } while (!regexSomenteNros.matches(posicao))
    }
    return true
}

//QUESTÃO 4 - Validar para a variável (busca) só aceitar números
private fun busca() {
    var i = 0//indice da lista
    println(
        "Digite o nome da pessoa que você busca: " +
                "\n(Somente letras)"
    )

    do {
        val busca = readln().uppercase()

        if (regexSomenteLetras.matches(busca)) {
            listaConvidados.forEach { convidado ->
                //O contains busca por uma string dentro de uma outra string
                if (convidado.nome.uppercase().contains(busca)) {
                    println(
                        "\nPosição: ${i++}\n" +
                                "Nome: ${convidado.nome}\n" +
                                "Presente: ${convidado.presente}\n" +
                                "Restrição: ${convidado.alimento}\n" +
                                "Vai ir na festa: ${convidado.presenca}"
                    )
                }
                i++
            }
        } else {
            println("Isso aí não é letra.")
        }
    } while (!regexSomenteLetras.matches(busca))
}

private fun validar(): Boolean {
    if (listaConvidados.isEmpty()) {
        println("Lista vazia.")
        return false
    }
    return true
}