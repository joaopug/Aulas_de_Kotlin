package mes_3_marco.aula_19_03_Crud_Festa

//Variável Global
var listaConvidados: MutableList<Convidado> = mutableListOf<Convidado>()

val expressaoRegularMenu = Regex("[0-5]")

val expressaoRegularFun = Regex("\\d]")


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

        if (expressaoRegularMenu.matches(opcao)) {
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

    println("Qual é o seu nome?")
    //val nome = readln()
    convidado.nome = readln()

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

        println("\nQual posição deseja editar?")
        val posicao = readln().toInt()
        if (expressaoRegularFun.matches(posicao.toString())) {
            println("O convidado vai? S/N")
            val resposta = readln().trim().uppercase()
            when (resposta) {
                "S" -> listaConvidados[posicao].presenca = true
                "N" -> listaConvidados[posicao].presenca = false
            }
            println("Edição realizada com sucesso!")
        }
    }
    return true
}

//QUESTÃO 3 - Validar para a variável só aceitar números
private fun excluir(): Boolean {
    if (validar()) {
        listar()

        println("Qual posição deseja exluir?")
        val posicao = readln().toInt()

        listaConvidados.removeAt(posicao)
        /*listaConvidados.
        convidado.nome = ""
        convidado.alimento = ""
        convidado.presente = ""
        convidado.presenca = false*/
        print("Convidado exluido.")
    }
    return true
}

//QUESTÃO 4 - Validar para a variável (busca) só aceitar números
private fun busca() {
    var i = 0//indice da lista
    println("Digite o nome da pessoa que você busca: ")
    val busca = readln()
    listaConvidados.forEach { convidado ->
        //O contains busca por uma string dentro de uma outra string
        if (convidado.nome.contains(busca)) {
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
}

private fun validar(): Boolean {
    if (listaConvidados.isEmpty()) {
        println("Lista vazia.")
        return false
    }
    return true
}