package semestre_5_2026.mes_2_fevereiro.recapitulacao_kotlin

fun main(){
    println("Calculadora de dois números" +
            "\nDiga o primeiro número:")
    val n1 = readln().toDouble();
    println("O segundo agora:")
    val n2 = readln().toDouble();

    println("Escolha uma operação:" +
            "\n1 - Adição || 2 - Substração || 3 - Multiplicação || 4 - Divisão")
    val escolha = readln();
    var resultado = 0.0
    when (escolha) {
        "1" -> resultado = (n1 + n2);
        "2" -> resultado = (n1 - n2);
        "3" -> resultado = (n1 * n2);
        "4" -> resultado = (n1 / n2);
        else -> println("Esse caractere dá não")
    }

    println("O resultado da operação: $resultado")
}