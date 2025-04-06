package marco.exercicios.ex7

class Notas {
    private val listaDeNotas = mutableListOf<Int>()

    fun adicionarNota(nota: Int) {
        if (nota in 1..5) {
            listaDeNotas.add(nota)
        }
    }

    fun mediaDasNotas(): Double {
        return if (listaDeNotas.isNotEmpty()) {
            listaDeNotas.sum().toDouble() / listaDeNotas.size
        } else 0.0
    }

    override fun toString(): String {
        return "%.2f".format(mediaDasNotas())
    }
}