//Variável Global
var convidado: Convidado = Convidado()
fun main() {
    menu()
}

private fun menu() {
    var opcao: Int
    do {
        println(
            "--- MENU ---\n" +
                    "1- CADASTRAR\n" +
                    "2- LISTAR\n" +
                    "3- EDITAR\n" +
                    "4- EXCLUIR\n" +
                    "0- SAIR"
        )

        opcao = readln().toInt()//Validar

        when (opcao) {
            1 -> {
                println("Cadastrando...")
                convidado = cadastrar()
            }

            2 -> {
                println("Listando...")
                listar(convidado)
            }

            3 -> {
                println("Editar...")
                editar()
            }
            4 -> {
                println("Excluindo...")
                excluir()
            }
            0 -> println("Saindo...")
            else -> println("Opção inválida. Tente novamente.")
        }
    } while (opcao != 0)
}

private fun cadastrar(): Convidado {
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

    return convidado
}

private fun listar(convidado: Convidado) {
    println(
        "Nome: ${convidado.nome}\n" +
                "Presente: ${convidado.presente}\n" +
                "Restrição: ${convidado.alimento}\n" +
                "Vai ir na festa: ${convidado.presenca}"
    )
}

private fun editar() {
    println("O convidado vai? S/N")
    val resposta = readln()
    when (resposta) {
        "S"-> convidado.presenca = true
        "N"-> convidado.presenca = false
    }
}

private fun excluir(){
    convidado.nome = ""
    convidado.alimento = ""
    convidado.presente = ""
    convidado.presenca = false
    print("Convidado exluido")
}