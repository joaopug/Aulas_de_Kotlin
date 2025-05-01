package mes_4_Abril.aula_16_04_Pilhas_Filas_Listas.Trabalho

fun gerarDanoAtaque(pokemon: Map<String, Any>?, chave: String, ataque: Int, valorAtq: Int): Double {

    val ataques = pokemon?.get(chave) as? Map<*, *>

    val ataqueSelecionado = ataques?.get(ataque) as? List<*>

    val danoDoAtaque = ataqueSelecionado?.get(valorAtq) as Double

    return danoDoAtaque

}