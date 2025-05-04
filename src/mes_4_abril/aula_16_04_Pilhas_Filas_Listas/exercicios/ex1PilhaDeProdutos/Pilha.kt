package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.exercicios.ex1PilhaDeProdutos

import java.util.*

val pilha = LinkedList<Produto>()

/*fun main() {
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
*/

fun main() {
    carregarPilha()


    while (true) {
        if (pilha.isNotEmpty()) {

            println("=====================================")
            println("Iniciando ciclo de remoção (máximo de 2 unidades)")
            println("=====================================")
            repeat(2) {
                if (pilha.isNotEmpty()) {
                    processarUnidade()
                } else {
                    println("Pilha esvaziou durante o ciclo.")
                    println("-------------------------------------\n")
                }
            }

            println("Ciclo concluído. Aguardando 5 segundos para o próximo ciclo...")
            println("=====================================\n")
            Thread.sleep(5000)
        } else {
            println("Pilha vazia! Carregando mais produtos...\n")
            carregarPilha()
            Thread.sleep(2000)
        }
    }
}

fun processarUnidade() {
    val produto = pilha.peek()
    val tempoAtual = System.currentTimeMillis()

    if (produto.taVencido(tempoAtual)) {
        println("Produto ${produto.nome} está vencido! Descartado.")
        pilha.pop()
        println("Itens restantes na pilha: ${pilha.size}")
        println("-------------------------------------\n")
        return
    }

    val diffMs = produto.validade - tempoAtual
    val minutosRestantes = diffMs / 60000
    val segundosRestantes = (diffMs % 60000) / 1000
    println("Produto: ${produto.nome}")
    println("Quantidade atual: ${produto.quantidade} unidades")
    println("Validade: $minutosRestantes minutos e $segundosRestantes segundos restantes")
    println("Removendo 1 unidade...")

    val atraso = produto.quantidade * 200L
    println("Aguardando ${atraso}ms devido à quantidade (${produto.quantidade} unidades)...")
    Thread.sleep(atraso)

    produto.quantidade -= 1
    println("1 unidade de ${produto.nome} removida.")
    println("Quantidade restante: ${produto.quantidade} unidades")

    if (produto.quantidade == 0) {
        pilha.pop()
        println("Produto ${produto.nome} esgotado e completamente removido da pilha!")
    }

    println("Itens restantes na pilha: ${pilha.size}")
    println("-------------------------------------\n")
}

fun carregarPilha() {
    println("=====================================")
    println("Carregando novos produtos na pilha...")

    // Adiciona 4 novos produtos com validade de 5 minutos a partir de agora
    val produtos = listOf(
        Produto("Tomate", System.currentTimeMillis() + (5 * 60 * 1000L), Random().nextInt(10, 21)),
        Produto("Pasta de dente", System.currentTimeMillis() + (4 * 60 * 1000L), Random().nextInt(10, 21)),
        Produto("Coca-cola", System.currentTimeMillis() + (6 * 60 * 1000L), Random().nextInt(10, 21)),
        Produto("Carne moída", System.currentTimeMillis() + (3 * 60 * 1000L), Random().nextInt(10, 21))
    )

    produtos.forEach { produto ->
        pilha.push(produto)
        println("➕ Adicionado: ${produto.nome}, Quantidade: ${produto.quantidade} unidades, " +
                "Validade: 5 minutos (Timestamp: ${produto.validade})")
    }
    println("Pilha carregada com ${pilha.size} produtos.")
    println("=====================================\n")
}