package semestre_5.mes_2_fevereiro.recapitulacao_kotlin

import semestre_3.mes_4_abril.aula_16_04_Pilhas_Filas_Listas.trabalho.regexDecisaoSN
import java.math.BigDecimal

val regexDecisaoSN = Regex("^[SN]$")

fun main() {
    menu()
}

val precoProdutos: Map<String, BigDecimal> = mapOf(
    "banana" to BigDecimal("3.31"),
    "uva" to BigDecimal("6.99"),
    "abacate" to BigDecimal("5.50"),
    "abacaxi" to BigDecimal("10.01")
)

val estoqueProdutos: MutableMap<String, Int> = mutableMapOf(
    "banana" to 0,
    "uva" to 0,
    "abacate" to 0,
    "abacaxi" to 0
)

fun menu() {
    println(
        "MENU" +
                "\n 1 - Comprar produto" +
                "\n 2 - Vender produto" +
                "\n 3 - Ver caixa" +
                "\n 4 - Ver estoque" +
                "\n 5 - Sair"
    )
    val opcao = readln().toInt()
    when (opcao) {
        1 -> {
            println("Comprando...")
            Compra().comprar()
            menu()
        }

        2 -> {
            println("Vendendo...")
            Venda().vender()
            menu()
        }

        3 -> {
            println("Vendo...")
            Financeiro.mostrarValorNoCaixa()
            menu()
        }

        4 -> {
            println("Vendo parte 2...")
            Estoque(estoqueProdutos).mostrarEstoque()
            menu()
        }

        5 -> println("Saindo...")
    }
}

open class Produto(
    var nome: String,
    var preco: BigDecimal
)

class Estoque(
    estoqueProdutos: MutableMap<String, Int>
) {
    fun mostrarEstoque() {
        println("\n====== Produtos ======")
        estoqueProdutos.forEach { (nomeProduto, quantidade) ->
            println(
                "Nome: $nomeProduto" +
                        "\nQuantidade: $quantidade\n"
            )
        }
    }

    fun aumentarEstoque(produto: Produto, quantidade: Int) {
        val quantidadeAtual = estoqueProdutos[produto.nome] ?: 0
        estoqueProdutos[produto.nome] = quantidadeAtual + quantidade
    }

    fun diminuirEstoque(produto: Produto, quantidade: Int) {
        val quantidadeAtual = estoqueProdutos[produto.nome] ?: 0
        estoqueProdutos[produto.nome] = quantidadeAtual - quantidade
    }
}

class Compra() {
    fun comprar() {
        var produto: Produto? = null
        println("O que você quer comprar?")
        Estoque(estoqueProdutos).mostrarEstoque()
        do {
            println("Digite o nome de um dos produtos acima:")
            val produtoAComprar = readln()
            if (precoProdutos.containsKey(produtoAComprar)) {
                val preco = precoProdutos[produtoAComprar]!!
                produto = Produto(produtoAComprar, preco)
            } else {
                println("Produto Indisponível ou Resposta Inválida")
            }
        } while (produto == null)
        do {
            println("Vai levar quanto?")
            val quantidadeAComprar = readln().toInt()
            val valorTotalCompra = produto.preco.multiply(BigDecimal.valueOf(quantidadeAComprar.toLong()))
            do {
                println(
                    "Saldo Disponível: ${Financeiro.caixa}" +
                            "\nVai ficar R$ $valorTotalCompra, vai querer levar mesmo?" +
                            "\nS - Sim || N - Não"
                )
                val comprarSN = readln().uppercase()
                if (!regexDecisaoSN.matches(comprarSN)) {
                    println("Caractere inválido")
                }
                if (comprarSN == "N") {
                    menu()
                }
            } while (!regexDecisaoSN.matches(comprarSN))
            val compraFeita = Financeiro.diminuirValorNoCaixa(valorTotalCompra)
            if (compraFeita) {
                Estoque(estoqueProdutos).aumentarEstoque(produto, quantidadeAComprar)
            }
        } while (!compraFeita)
    }
}

class Venda(
) {
    fun vender() {
        var produto: Produto? = null
        println("O que você quer vender?")
        Estoque(estoqueProdutos).mostrarEstoque()
        do {
            println("Digite o nome de um dos produtos acima:")
            val produtoAVender = readln()
            if (precoProdutos.containsKey(produtoAVender)) {
                val preco = precoProdutos[produtoAVender]!!
                produto = Produto(produtoAVender, preco)
            } else {
                println("Produto Indisponível ou Resposta Inválida")
            }
        } while (produto == null)
        do {
            println("Vai vender quanto?")
            val quantidadeAVender = readln().toInt()
            val valorTotalVenda = produto.preco.multiply(BigDecimal.valueOf(quantidadeAVender.toLong()))
            do {
                println(
                    "Disponível no estoque: ${estoqueProdutos[produto.nome]}" +
                            "\nVocê vai vender $quantidadeAVender unidade(s)." +
                            "\nVai ficar R$ $valorTotalVenda no total, vai vender mesmo?" +
                            "\nS - Sim || N - Não"
                )
                val comprarSN = readln().uppercase()
                if (!regexDecisaoSN.matches(comprarSN)) {
                    println("Caractere inválido")
                }
                if (comprarSN == "N") {
                    menu()
                }
            } while (!regexDecisaoSN.matches(comprarSN))
            val vendaFeita = Financeiro.aumentarValorNoCaixa(valorTotalVenda, produto, quantidadeAVender)
            if (vendaFeita) {
                Estoque(estoqueProdutos).diminuirEstoque(produto, quantidadeAVender)
            }
        } while (!vendaFeita)
    }
}

object Financeiro {
    var caixa: BigDecimal = "100.0".toBigDecimal()

    fun mostrarValorNoCaixa() {
        println("O valor no caixa é R$ $caixa\n")
    }

    fun diminuirValorNoCaixa(valorCompra: BigDecimal): Boolean {
        if (valorCompra <= caixa) {
            caixa -= valorCompra
            println("Compra feita!")
            return true
        } else {
            println("Saldo Indisponível")
            return false
        }
    }

    fun aumentarValorNoCaixa(valorVenda: BigDecimal, produto: Produto, quantidadeProduto: Int): Boolean {
        if (quantidadeProduto >= estoqueProdutos[produto.nome]!!) {
            caixa += valorVenda
            println("Venda feita!")
            return true
        } else {
            println("Saldo Indisponível")
            return false
        }
    }
}