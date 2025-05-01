package mes_4_Abril.aula_16_04_Pilhas_Filas_Listas.Trabalho

fun pegarTipoDoAtaque(pokemon: Map<String, Any>?, chave: String, ataque: Int, tipoAtq: Int): String {

    val ataques = pokemon?.get(chave) as? Map<*, *>

    val ataqueSelecionado = ataques?.get(ataque) as? List<*>

    val tipoDoAtaque = ataqueSelecionado?.get(tipoAtq) as String

    return tipoDoAtaque
}
