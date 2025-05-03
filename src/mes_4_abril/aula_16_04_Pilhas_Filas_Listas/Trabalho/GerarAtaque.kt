package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.Trabalho
//Aberração
//
//Explicação do que acontece:
//   Map do primeiro Poke do player ->
//-> Chave "ATAQUES" (um map novo que criei) ->
//-> Chave ataque escolhido (1 a 4) ->
//-> Valor "dano" (indíce 1)
//
//Essa explicação é só lógica, se quer saber que cada coisa faz, melhor pedir pro Home
fun gerarDanoAtaque(pokemon: Map<String, Any>?, chave: String, ataque: Int, valorAtq: Int): Double {

    val ataques = pokemon?.get(chave) as? Map<*, *>

    val ataqueSelecionado = ataques?.get(ataque) as? List<*>

    val danoDoAtaque = ataqueSelecionado?.get(valorAtq) as Double

    return danoDoAtaque

}