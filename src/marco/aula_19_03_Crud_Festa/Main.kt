package marco.aula_19_03_Crud_Festa

//Variável Global
var listaConvidados: MutableList<Convidado> = mutableListOf<Convidado>()

val expressaoRegular = Regex("[0-4]")

fun main() {
    menu()
}

private fun menu() {
    do {
        println(
            "--- MENU ---\n" +
                    "1- CADASTRAR\n" +
                    "2- LISTAR\n" +
                    "3- EDITAR\n" +
                    "4- EXCLUIR\n" +
                    "0- SAIR"
        )

        val opcao = readln()

        if (expressaoRegular.matches(opcao)) {
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

                0 -> println("Saindo...")
            }
        } else {
            println("\n\n\nOpção inválida. Tente novamente.")
        }


    } while (opcao.toInt() != 0)
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
    if (listaConvidados.isEmpty()) {
        println("Não há convidados")
    } else {
        listaConvidados.forEach { convidado ->
            println(
                "\nPosição: ${i++}\n" +
                        "Nome: ${convidado.nome}\n" +
                        "Presente: ${convidado.presente}\n" +
                        "Restrição: ${convidado.alimento}\n" +
                        "Vai ir na festa: ${convidado.presenca}"
            )
        }
    }
    return listaConvidados.toString()
}

private fun editar(): Boolean {

    if (listaConvidados.isEmpty()) {
        println("\nA lista está vazia.")
        return false
    }

    listar()

    println("\nQual posição deseja editar?")
    val posicao = readln().toInt()

    println("O convidado vai? S/N")
    val resposta = readln().trim().uppercase()
    when (resposta) {
        "S" -> listaConvidados[posicao].presenca = true
        "N" -> listaConvidados[posicao].presenca = false
    }
    println("Edição realizada com sucesso!")
    return true
}


private fun excluir(): Boolean {

    if (listaConvidados.isEmpty()) {
        println("A lista está vazia.")
        return false
    }
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
    return true
}