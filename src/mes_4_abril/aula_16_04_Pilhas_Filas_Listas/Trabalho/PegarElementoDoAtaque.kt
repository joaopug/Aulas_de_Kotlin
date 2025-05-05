package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.Trabalho
//
//Aproveita a aberração "GerarAtaque" e pega o tipo do ataque também
//
//Explicação do que acontece:
//-> Chave "ATAQUES" (um map novo que criei) ->
//-> Chave ataque escolhido (1 a 4) ->
//-> Valor "tipo" (indíce 2)

fun pegarElementoDoAtq(pokemon: Map<String, Any>?, chave: String, ataque: Int, elementoAtq: Int): String {

    val ataques = pokemon?.get(chave) as? Map<*, *>

    val ataqueSelecionado = ataques?.get(ataque) as? List<*>

    val elementoDoAtaque = ataqueSelecionado?.get(elementoAtq) as String

    return elementoDoAtaque
}
