package semestre_3_2025.bizarriceNaoFuncional

import kotlin.math.round

fun main() {
    println("Escreva a equação:")
    //var conta = "100.5-1.6+22.0*100.6-52.0*3.5/2"
    //var conta = "1.0*1+((2+2)*3)"
    //var conta = "100.5-1.6+2213.2"
    var conta = "((2+2)*3)"
    //var conta = "2+2"
    println(conta)
    var temOperador = true

    while (conta.contains("(")) {
        val contaNova = fazerConta("(", conta)
        conta = contaNova
        println(conta)
    }
    while (conta.contains("*")) {
        val contaNova = fazerConta("*", conta)
        conta = contaNova
        println(conta)
    }
    while (conta.contains("/")) {
        val contaNova = fazerConta("/", conta)
        conta = contaNova
        println(conta)
    }
    while (conta.contains("+")) {
        val contaNova = fazerConta("+", conta)
        conta = contaNova
        println(conta)
    }
    while (conta.contains("-") && temOperador) {
        val contaNova = fazerConta("-", conta)
        conta = contaNova
        println(conta)
        val temOperadorAinda = verSeTemOperador(conta)
        temOperador = temOperadorAinda
    }

}

fun fazerConta(operador: String, conta: String): String {
    var valorIndiceOpPrimeiroPonto: Int
    var valorIndiceOpSegundoPonto: Int
    var primeiroNumeroEOperadoresEPontos: String
    var segundoNumeroEOperadores: String
    var numeros: Int
    var operacaoAFazer = ""
    var num1 = 0.0
    var num2 = 0.0
    var contaNova: String

    val valorIndiceOp: Int = conta.indexOf(operador)


    valorIndiceOpPrimeiroPonto = conta.indexOf(".")
    primeiroNumeroEOperadoresEPontos = try {
        conta.substring(valorIndiceOpPrimeiroPonto, valorIndiceOp)
    } catch (_: StringIndexOutOfBoundsException) {
        ""
    }
    val verQuantosPontosTem: Int =
        primeiroNumeroEOperadoresEPontos.count { it == '.' }
    var verQuantosOperadoresTem: Int =
        primeiroNumeroEOperadoresEPontos.count { it == '*' || it == '+' || it == '-' || it == '/' }
    if (verQuantosOperadoresTem > 1) {
        valorIndiceOpPrimeiroPonto = valorIndiceOp - 2
    } else if (verQuantosPontosTem > 1) {
        valorIndiceOpPrimeiroPonto = valorIndiceOp - 2
    }

    valorIndiceOpSegundoPonto = conta.indexOf(".", valorIndiceOp)
    if (valorIndiceOpSegundoPonto > 0) {
        segundoNumeroEOperadores = conta.substring(valorIndiceOp, valorIndiceOpSegundoPonto)
        verQuantosOperadoresTem = segundoNumeroEOperadores.count { it == '*' || it == '+' || it == '-' || it == '/' }
        if (verQuantosOperadoresTem > 1) {
            valorIndiceOpSegundoPonto = 0
        }
    } else {
        valorIndiceOpSegundoPonto = 0
    }

    try {
        if (operador == "(") {
            var numeroParentesesAbertos = 1
            var numeroParentesesFechados = 0
            var caractereAtual: String
            var qtdeMoverDireita = 1
            var qtdeDefinirFinal = 2
            var indiceParenteseFechado = valorIndiceOp
            var operacaoParentese: String
            do {
                caractereAtual = conta.substring(valorIndiceOp + qtdeMoverDireita, valorIndiceOp + qtdeDefinirFinal)
                if (caractereAtual == "(") {
                    numeroParentesesAbertos++
                } else if (caractereAtual == ")") {
                    numeroParentesesFechados++
                }
                qtdeMoverDireita++
                qtdeDefinirFinal++
                indiceParenteseFechado++
            } while (numeroParentesesAbertos != numeroParentesesFechados)
            operacaoParentese = conta.substring(valorIndiceOp + 1, indiceParenteseFechado)
            println(operacaoParentese)
            var contaSemParentese: String
            var contaNova: String
            if (operacaoParentese.contains("(")) {
                contaSemParentese = fazerConta("(", operacaoParentese)
                conta.replace(conta, contaSemParentese)
                println(conta)
            } else {
                if (operacaoParentese.contains("*")) {
                    contaSemParentese = fazerConta("*", operacaoParentese)
                    conta.replace(conta, contaSemParentese)
                } else if (operacaoParentese.contains("/")) {
                    contaSemParentese = fazerConta("/", operacaoParentese)
                    conta.replace(conta, contaSemParentese)
                } else if (operacaoParentese.contains("+")) {
                    contaSemParentese = fazerConta("+", operacaoParentese)
                    conta.replace(conta, contaSemParentese)
                } else if (operacaoParentese.contains("-")) {
                    contaSemParentese = fazerConta("-", operacaoParentese)
                    conta.replace(conta, contaSemParentese)
                }
            }
        }

        //Serve para quando ambos os números são Reais
        //1.0+1.0
        if (
            conta.substring(
                valorIndiceOp + -2,
                valorIndiceOp + -1
            ).contains(".")
            && (valorIndiceOpSegundoPonto > 0)
        ) {
            numeros = contarQtdNumeros(conta, valorIndiceOpPrimeiroPonto)
            operacaoAFazer = conta.substring(valorIndiceOpPrimeiroPonto - numeros, valorIndiceOpSegundoPonto + 2)
            num1 = conta.substring(valorIndiceOpPrimeiroPonto - numeros, valorIndiceOp).toDouble()
            num2 = conta.substring(valorIndiceOp + 1, valorIndiceOpSegundoPonto + 2).toDouble()
        } else if (conta.substring(
                valorIndiceOp + -2,
                valorIndiceOp + -1
            ).contains(".")
        ) {
            //Verificar quantos inteiros o número possui para poder cortar certo
            numeros = contarQtdNumeros(conta, valorIndiceOpPrimeiroPonto)

            //Funciona quando o primeiro número é Real e o segundo Inteiro
            //1.0+1
            operacaoAFazer = conta.substring(valorIndiceOpPrimeiroPonto - numeros, valorIndiceOp + 2)
            num1 = conta.substring(valorIndiceOpPrimeiroPonto - numeros, valorIndiceOp).toDouble()
            num2 = conta.substring(valorIndiceOp + 1, valorIndiceOp + 2).toDouble()
        } else {
            numeros = contarQtdNumeros(conta, valorIndiceOpPrimeiroPonto)

            //Funciona quando o primeiro número é Inteiro e o segundo Real?
            //1+1.0
            operacaoAFazer = conta.substring(valorIndiceOp + numeros, valorIndiceOpSegundoPonto + 2)
            num1 = conta.substring(valorIndiceOp + numeros, valorIndiceOp).toDouble()
            num2 = conta.substring(valorIndiceOp + 1, valorIndiceOp + 2).toDouble()
        }
    } catch (_: IndexOutOfBoundsException) {
        try {
            if (conta.substring(
                    valorIndiceOp + 2,
                    valorIndiceOp + 3
                ).contains(".")
            ) {
                var numeros = 0
                var parada: Int
                do {
                    // numero = conta.substring(valorIndiceOp - (numeros + 1), valorIndiceOp)
                    numeros++
                    parada = valorIndiceOp - numeros
                } while (parada != 0)
                //Serve para quando o primeiro número é Inteiro e o segundo é Real
                //1+1.0
                operacaoAFazer = conta.substring(valorIndiceOp - numeros, valorIndiceOpSegundoPonto + 2)
                num1 = conta.substring(valorIndiceOp - numeros, valorIndiceOp).toDouble()
                num2 = conta.substring(valorIndiceOp + 1, valorIndiceOpSegundoPonto + 1).toDouble()
            }
        } catch (_: IndexOutOfBoundsException) {
            //Serve para quando ambos os números são Inteiros
            //1+1
            operacaoAFazer = conta.substring(valorIndiceOp + -1, valorIndiceOp + 2)
            num1 = conta.substring(valorIndiceOp + -1, valorIndiceOp).toDouble()
            num2 = conta.substring(valorIndiceOp + 1, valorIndiceOp + 2).toDouble()
        }
    } finally {
        val operacaoFeita = when (operador) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> 0.0
        }
        val operacaoFormatada = round((operacaoFeita) * 10) / 10
        contaNova = conta.replace(operacaoAFazer, operacaoFormatada.toString())
        println(valorIndiceOp)
        println(operacaoAFazer)
        println(num1)
        println(num2)
        println(operacaoFormatada)
        println(conta)
    }
    return contaNova
}

fun contarQtdNumeros(conta: String, valorIndcP1: Int): Int {
    var numeros = 0
    var parada: Int
    do {
        val numero = conta.substring(valorIndcP1 - (numeros + 1), valorIndcP1)
        if (numero.contains("*") ||
            numero.contains("+") ||
            numero.contains("/") ||
            numero.contains("-")
        ) {
            break
        }
        numeros++
        parada = valorIndcP1 - numeros
    } while (parada != 0)
    return numeros
}

fun verSeTemOperador(conta: String): Boolean {
    var temOperador = true
    val indiceDoPrimeiroSinal = conta.indexOf("-")
    val indiceSegundoSinal = conta.lastIndexOf('-')
    if (indiceDoPrimeiroSinal == 0 && indiceDoPrimeiroSinal == indiceSegundoSinal) {
        temOperador = false
    }
    return temOperador
}