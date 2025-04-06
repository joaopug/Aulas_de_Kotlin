package marco.exercicios.ex6

open class Racao {
    var preco: Double = 0.0
    var peso: Double = 0.0
    val sabor: String = ""

    open fun desconto() {
        preco *= 0.90
    }
}