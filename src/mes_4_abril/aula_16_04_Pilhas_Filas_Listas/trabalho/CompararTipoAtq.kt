package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.trabalho
//Aberração parte 2
//
//Tem como objetivo determinar se o tipo do ataque está nas fraquezas do Pokémon
//Tudo por causa da nova chave que eu criei: "DESVANTAGENS"
//
//Explicação do que acontece:
//   Map do Poke sendo atacado ->
//-> Chave "DESVANTAGENS" (chave nova) ->
//-> Verifica se na lista dentro de "DESVANTAGENS"
//   há o elemento do ataque sendo usado ->
//-> Se tiver o elemento, retorna "true", senão retorna "false"
//
fun verSeTemFraqueza(pokemon: Map<String, Any>?, chave: String, tipoAtq: String): Boolean {

    val fraquezasPkmn = pokemon?.get(chave) as? List<*>

    val tipo = fraquezasPkmn?.contains(tipoAtq) == true

    return tipo
}

fun verSeTemResistencia(pokemon: Map<String, Any>?, chave: String, tipoAtq: String): Boolean {

    val resistenciasPkmn = pokemon?.get(chave) as? List<*>

    val tipo = resistenciasPkmn?.contains(tipoAtq) == true

    return tipo
}