fun main() {
    var n1 = 2
    var n2 = 1
    var aux = 0
    var jorge = 0


    jorge = readln().toInt()


    if (n1 > 3) {
        while (true) {
            aux = jorge
            n2 = n1 + n2
            aux = aux + n2
            break
        }
    }

    print(jorge)
}