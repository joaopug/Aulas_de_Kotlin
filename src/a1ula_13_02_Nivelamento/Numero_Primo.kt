package a1ula_13_02_Nivelamento

fun main() {
    var soma = 0.0
    var qtdNotas = 3
    for (i in 1..qtdNotas) {
        print("Digite a nota $i: ")
        val nota = readLine()?.toDoubleOrNull() ?: 0.0
        soma += nota
    }

    var media = soma / qtdNotas
    println("Media: $media")

    if (media >= 7) {
        println("Aprovado")
    } else if (media >= 5) {
        println("Recuperação")
    } else {
        println("Reprovado")
    }

}