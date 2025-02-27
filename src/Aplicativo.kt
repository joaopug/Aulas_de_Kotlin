fun main() {
    var n1 = 1
    var n2 = 2
    var aux: Int

    print("Escolha qual casa de Fibonacci deseja saber o valor (acima da 3ª): ")
    val jorge: Int = readln().toInt()
    println("Casa escolhida: $jorge")

    for (i in 4..jorge) {
        aux = n2
        n2 = n2 + n1
        n1 = aux
    }

    println("Valor: $n2")
}