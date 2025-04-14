package mes_3_Marco.exercicios.ex7

class Cliente(val nome: String) {
    fun darNota(restaurante: InformacoesDoRestaurante, nota: Int) {
        restaurante.nota.adicionarNota(nota)
        println("$nome avaliou o '${restaurante.nome}' com nota $nota")
    }
}