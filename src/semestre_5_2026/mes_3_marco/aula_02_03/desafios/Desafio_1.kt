package semestre_5_2026.mes_3_marco.aula_02_03.desafios

fun main(){
    println("Digite a conta quer fazer. (Somente uma operação):")
    val operacao = readln().trim()

    val num1 = operacao.substring(0,1).toDouble()
    val operador = operacao.substring(1,2)
    val num2 = operacao.substring(2,3).toDouble()

    println(num1)
    println(num2)
    println(operador)

    var operacaoFeita = 0.0

    if (operador == "+"){
        operacaoFeita = num1+num2
    } else if (operador == "-"){
        operacaoFeita = num1 - num2
    } else if (operador == "*"){
        operacaoFeita = num1 * num2
    } else if (operador == "/") {
        operacaoFeita = num1 / num2
    }

    println(operacaoFeita)
    }