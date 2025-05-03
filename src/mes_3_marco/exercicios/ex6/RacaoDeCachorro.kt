package mes_3_marco.exercicios.ex6

class RacaoDeCachorro : Racao() {
    var comFortalecimentoDePelos: Boolean = false
    var comPedacosDeCarne: Boolean = false

    override fun desconto() {
        preco *= if (comFortalecimentoDePelos) 0.95 else 0.75
    }
}