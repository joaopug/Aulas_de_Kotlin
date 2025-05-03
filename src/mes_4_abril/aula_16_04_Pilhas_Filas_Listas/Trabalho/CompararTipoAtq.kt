package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.Trabalho

fun compararTipoDoAtq(pokemon: Map<String, Any>?, chave: String, tipoAtq: String): Boolean {

    val fraquezasPkmn = pokemon?.get(chave) as? List<*>

    val tipo = fraquezasPkmn?.contains(tipoAtq) == true

    return tipo
}