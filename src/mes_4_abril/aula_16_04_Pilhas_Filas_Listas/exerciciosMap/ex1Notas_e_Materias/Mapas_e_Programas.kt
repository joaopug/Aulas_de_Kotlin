package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.exerciciosMap.ex1Notas_e_Materias

fun main() {
    programa()
}

fun programa() {
    val ciencias = mapOf(
        6.0 to "Jorge",
        8.2 to "João",
        8.0 to "Gabriel"
    )

    val matematica = mapOf(
        7.8 to "João",
        7.5 to "Gabriel",
        5.0 to "Jorge"
    )

    val portugues = mapOf(
        9.0 to "João",
        6.5 to "Jorge",
        8.5 to "Gabriel"
    )

    val educacaoFisica = mapOf(
        10.0 to "Gabriel",
        9.5 to "João",
        8.0 to "Jorge"
    )

    val geografia = mapOf(
        7.0 to "Jorge",
        8.5 to "João",
        6.5 to "Gabriel"
    )

    val historia = mapOf(
        7.5 to "Gabriel",
        6.0 to "João",
        5.5 to "Jorge"
    )

    val materias: Map<String, Map<Double, String>> = mapOf(
        "ciencias" to ciencias,
        "matematica" to matematica,
        "portugues" to portugues,
        "educacaoFisica" to educacaoFisica,
        "geografia" to geografia,
        "historia" to historia
    )

    materias.forEach { (nomeMateria, mapaMateria) ->
        mapaMateria.forEach { (nota, nome) ->
            if (nota > 7.0) {
                println("$nome está aprovado em $nomeMateria com nota $nota")
            }
        }

    }
}