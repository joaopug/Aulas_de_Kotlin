package marco.exercicios.ex6

class RacaoDeGato : Racao() {
    var paraCastrado: Boolean = false
    var ricaEmFerro: Boolean = false

    override fun desconto() {
        preco *= if (paraCastrado) 0.85 else 0.80
    }
}
