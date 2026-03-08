package semestre_3_2025.bizarriceNaoFuncional

fun main() {
    var conta = "10+1.0+2.0*1.0+5.0*3"
    println(conta)
    var valorIndiceOpSegundoPonto: Int
    var operacaoAFazer: String
    var num1 = 0.0
    var num2 = 0.0
    var operacaoFeita: Double
    //val op = readln().replace(" ", "")
    val valorIndiceOp = conta.indexOf("+")
    valorIndiceOpSegundoPonto = conta.indexOf(".", valorIndiceOp)
    val segundoNumeroEOperadores = conta.substring(valorIndiceOp, valorIndiceOpSegundoPonto)
    val verQuantosOperadoresTem = segundoNumeroEOperadores.count { it == '+' }
    if (verQuantosOperadoresTem > 1) {
        valorIndiceOpSegundoPonto = 0
    }
    if (conta.substring(
            valorIndiceOp + 2,
            valorIndiceOp + 3
        ).contains(".")
    ) {
        var numeros = 0
        var parada: Int
        do {
            //var numero = conta.substring(valorIndiceOp - (numeros + 1), valorIndiceOp)
            parada = valorIndiceOp - 1
            numeros++
        } while (parada != 0)
        //Serve para quando o primeiro número é Inteiro e o segundo é Real
        //1+1.0
        operacaoAFazer = conta.substring(valorIndiceOp - numeros, valorIndiceOpSegundoPonto + 2)
        num1 = conta.substring(valorIndiceOp + numeros, valorIndiceOp).toDouble()
        num2 = conta.substring(valorIndiceOp + 1, valorIndiceOpSegundoPonto + 2).toDouble()
    }
}

//val op = readln().replace(" ", "")
//    var valorIndiceOp: Int
//    var valorIndiceOpPrimeiroPonto: Int
//    var valorIndiceOpSegundoPonto: Int
//    var primeiroNumeroEOperadores: String
//    var segundoNumeroEOperadores: String
//    var verQuantosOperadoresTem: Int
//    var operacaoAFazer = ""
//    var num1 = 0.0
//    var num2 = 0.0
//    var operacaoFeita: Double

//    while (conta.contains("*")) {
//        valorIndiceOp = conta.indexOf("*")
//
//        //Localizar o ponto do primeiro número, o ponto que indica decimal.
//        //Ele sempre pega o primeiro ponto, portanto eu tive que tratar isso.
//        //Caso na montagem da string ele encontre algum operador,
//        //é reduzido duas casas no valor da casa do Operador.
//        //
//        //Talvez nem seja necessário fazer todo o processo de remoção,
//        // eu poderia só remover duas casas logo de cara, tenho verificar depois
//        valorIndiceOpPrimeiroPonto = conta.indexOf(".")
//        primeiroNumeroEOperadores = conta.substring(valorIndiceOpPrimeiroPonto, valorIndiceOp)
//        verQuantosOperadoresTem = primeiroNumeroEOperadores.count { it == '*' || it == '+' || it == '-' || it == '/' }
//        if (verQuantosOperadoresTem > 1) {
//            valorIndiceOpPrimeiroPonto = valorIndiceOp - 2
//        }
//
//        valorIndiceOpSegundoPonto = conta.indexOf(".", valorIndiceOp)
//        segundoNumeroEOperadores = conta.substring(valorIndiceOp, valorIndiceOpSegundoPonto)
//        verQuantosOperadoresTem = segundoNumeroEOperadores.count { it == '*' }
//        if (verQuantosOperadoresTem > 1) {
//            valorIndiceOpSegundoPonto = 0
//        }
//        try {
//            if (
//                conta.substring(
//                    valorIndiceOp + -2,
//                    valorIndiceOp + -1
//                ).contains(".")
//                && (valorIndiceOpSegundoPonto > 0)
//            ) {
//                var numeros = 0
//                var parada: Int
//                do {
//                    numeros++
//                    parada = valorIndiceOpPrimeiroPonto - numeros
//                    val numero = conta.substring(valorIndiceOpPrimeiroPonto - (numeros + 1), valorIndiceOpPrimeiroPonto)
//                    if (numero.contains("*") ||
//                        numero.contains("+") ||
//                        numero.contains("/") ||
//                        numero.contains("-")
//                    ) {
//                        break
//                    }
//                } while (parada != 0)
//                operacaoAFazer = conta.substring(valorIndiceOpPrimeiroPonto - numeros, valorIndiceOpSegundoPonto + 2)
//                num1 = conta.substring(valorIndiceOpPrimeiroPonto - numeros, valorIndiceOp).toDouble()
//                num2 = conta.substring(valorIndiceOp + 1, valorIndiceOpSegundoPonto + 2).toDouble()
//            } else if (conta.substring(
//                    valorIndiceOp + -2,
//                    valorIndiceOp + -1
//                ).contains(".")
//            ) {
//                operacaoAFazer = conta.substring(valorIndiceOp + -3, valorIndiceOp + 2)
//                num1 = conta.substring(valorIndiceOp + -3, valorIndiceOp).toDouble()
//                num2 = conta.substring(valorIndiceOp + 1, valorIndiceOp + 2).toDouble()
//            } else {
//                operacaoAFazer = conta.substring(valorIndiceOp + -3, valorIndiceOp + 2)
//                num1 = conta.substring(valorIndiceOp + -3, valorIndiceOp).toDouble()
//                num2 = conta.substring(valorIndiceOp + 1, valorIndiceOp + 2).toDouble()
//            }
//        } catch (_: IndexOutOfBoundsException) {
//            operacaoAFazer = conta.substring(valorIndiceOp + -1, valorIndiceOp + 2)
//            num1 = conta.substring(valorIndiceOp + -1, valorIndiceOp).toDouble()
//            num2 = conta.substring(valorIndiceOp + 1, valorIndiceOp + 2).toDouble()
//        } finally {
//            operacaoFeita = num1 * num2
//            conta = conta.replace(operacaoAFazer, operacaoFeita.toString())
//            println(valorIndiceOp)
//            println(operacaoAFazer)
//            println(num1)
//            println(num2)
//            println(operacaoFeita)
//            println(conta)
//        }
//    }
//    //var c = 0
//    while (
//    //c != 3
//        conta.contains("+")
//    ) {
//        //op = "4.0+15.0"
//        valorIndiceOp = conta.indexOf("+")
//        valorIndiceOpPrimeiroPonto = conta.indexOf(".")
//        valorIndiceOpSegundoPonto = conta.indexOf(".", valorIndiceOp)
//        segundoNumeroEOperadores = conta.substring(valorIndiceOp, valorIndiceOpSegundoPonto)
//        verQuantosOperadoresTem = segundoNumeroEOperadores.count { it == '+' }
//        if (verQuantosOperadoresTem > 1) {
//            valorIndiceOpSegundoPonto = 0
//        }
//        try {
//            //Serve para quando ambos os números são Reais
//            //1.0+1.0
//            if (
//                conta.substring(
//                    valorIndiceOp + -2,
//                    valorIndiceOp + -1
//                ).contains(".")
//                && (valorIndiceOpSegundoPonto > 0)
//            ) {
//                //Verificar quantos inteiros o número possui para poder cortar certo
//                var numeros = 0
//                var parada: Int
//                do {
//                    //var numero = conta.substring(valorIndiceOpPrimeiroPonto - (numeros + 1), valorIndiceOpPrimeiroPonto)
//                    numeros++
//                    parada = valorIndiceOpPrimeiroPonto - numeros
//                } while (parada != 0)
//                operacaoAFazer = conta.substring(valorIndiceOpPrimeiroPonto - numeros, valorIndiceOpSegundoPonto + 2)
//                num1 = conta.substring(valorIndiceOpPrimeiroPonto - numeros, valorIndiceOp).toDouble()
//                num2 = conta.substring(valorIndiceOp + 1, valorIndiceOpSegundoPonto + 2).toDouble()
//            } else {
//                //Funciona quando o primeiro número é Real e o segundo Inteiro
//                //1.0+1
//                operacaoAFazer = conta.substring(valorIndiceOp + -3, valorIndiceOp + 2)
//                num1 = conta.substring(valorIndiceOp + -3, valorIndiceOp).toDouble()
//                num2 = conta.substring(valorIndiceOp + 1, valorIndiceOp + 2).toDouble()
//            }
//        } catch (_: IndexOutOfBoundsException) {
//            if (conta.substring(
//                    valorIndiceOp + 2,
//                    valorIndiceOp + 3
//                ).contains(".")
//            ) {
//                var numeros = 0
//                var parada: Int
//                do {
//                    // numero = conta.substring(valorIndiceOp - (numeros + 1), valorIndiceOp)
//                    numeros++
//                    parada = valorIndiceOp - numeros
//                } while (parada != 0)
//                //Serve para quando o primeiro número é Inteiro e o segundo é Real
//                //1+1.0
//                operacaoAFazer = conta.substring(valorIndiceOp - numeros, valorIndiceOpSegundoPonto + 2)
//                num1 = conta.substring(valorIndiceOp - numeros, valorIndiceOp).toDouble()
//                num2 = conta.substring(valorIndiceOp + 1, valorIndiceOpSegundoPonto + 1).toDouble()
//            } else {
//                //Serve para quando ambos os números são Inteiros
//                //1+1
//                operacaoAFazer = conta.substring(valorIndiceOp + -1, valorIndiceOp + 2)
//                num1 = conta.substring(valorIndiceOp + -1, valorIndiceOp).toDouble()
//                num2 = conta.substring(valorIndiceOp + 1, valorIndiceOp + 2).toDouble()
//            }
//        } finally {
//            operacaoFeita = num1 + num2
//            conta = conta.replace(operacaoAFazer, operacaoFeita.toString())
//            println(valorIndiceOp)
//            println(operacaoAFazer)
//            println(num1)
//            println(num2)
//            println(operacaoFeita)
//            println(conta)
//        }
//        //c++
//
//    }
//