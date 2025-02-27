fun main() {
    var n1 = 1
    var n2 = 2
    var aux: Int


    val jorge: Int = readln().toInt()


    for (i in 4..jorge) {
        aux = n2
        n2 = n2 + n1
        n1 = aux
    }

    println(n2)
}