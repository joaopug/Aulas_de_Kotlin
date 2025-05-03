package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.exercicios.ex1PilhaDeProdutos

import java.util.*

val pilha = LinkedList<Produto>()

fun main() {
    do {
        val tomate = Produto("Tomate", 6000, 20)
        pilha.push(tomate)
        println("O item ${tomate.nome} foi adicionado na pilha\n")
        Thread.sleep(4000)

        val pastaDeDente = Produto("Pasta de dente", 6000, 20)
        pilha.push(pastaDeDente)
        println("O item ${pastaDeDente.nome} foi adicionado na pilha\n")
        Thread.sleep(4000)

        val cocacola = (Produto("Coca-cola", 1000, 60))
        pilha.push(cocacola)
        println("O item ${cocacola.nome} foi adicionado na pilha\n")
        Thread.sleep(4000)

        val carneMoida = (Produto("Carne moída", 8000, 10))
        pilha.push(carneMoida)
        println("O item ${carneMoida.nome} foi adicionado na pilha\n")
        Thread.sleep(4000)

        while (pilha.isNotEmpty()) {
            tirarDaPrateleira()
        }

    } while (pilha.isEmpty())
}

fun tirarDaPrateleira() {
    val produto = pilha.pop()
    println(
        "Validade do produto ${produto.nome}: ${produto.validade / 1000} segundos\n" +
                "${produto.nome} disponível:\n"
    )
    do {
        if (produto.quantidade != 1) {
            println("Quantidade: ${produto.quantidade} unidades")
        } else {
            println("Quantidade: ${produto.quantidade} unidade\n")
        }
        Thread.sleep(produto.validade)
        produto.quantidade = produto.quantidade - 1
    } while (produto.quantidade != 0)

    println(
        "O produto ${produto.nome} está esgotado\n"
    )
    if (pilha.isNotEmpty()) {
        println("Itens ainda restantes na pilha: ${pilha.size}\n")

    } else {
        println(
            "\nNão há mais itens na pilha." +
                    "\nHora de adicionar mais heheheh\n"
        )
    }
}