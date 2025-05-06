package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.trabalho
//
//Função que calcula o dano que o Pokémon irá dar
//
//1° parâmetro (vfrcFraqueza):
//Esse parâmetro está ligado com a função "compararTipoDoAtq"
//O valor dele só pode ser true ou false
//É assim, pois é verificado se o tipo do ataque está na chave "DESVANTAGENS"
//do pokémon adversário
//
//2° parâmetro (time):
//Ele recebe o mapa do time do player que está sendo atacado
//Portanto, o seu valor só pode ser um map
//Puramente estético
//
//3° parâmetro (danoDoAtaque)
//Quantidade de dano calculada na função "gerarDanoAtaque"
//Apenas receberá o valor Double contido na variável que armazenou
//o return da função "gerarDanoAtaque"
//
//4° parâmetro (vidaPkmnInimigo)
//Recebe o Double que contém a quantidade de HP do Pokémon
//da rodada atual que está sendo atacado
//
//5° parâmetro (nomePlayer)
//Nome do player que está sendo atacado
//Estético

fun calculoDano(
    vrfcFraqueza: Boolean,
    vrfcResistencia: Boolean,
    vrfcNulo: Boolean,
    timeAtacando: Map<Int, Map<String, Any>?>,
    timeDefendendo: Map<Int, Map<String, Any>?>,
    rodada: Int,
    forcaDoAtaque: Int,
    tipoDoAtaque: String,
    vidaPkmnInimigo: Double,
    nomePlayer: String
): Double {
    var danoFinal: Double
    var vidaPkmnInimigo1 = vidaPkmnInimigo
    val nivel = 100
    var ataque: Double
    var defesa: Double
    val nomePokemon = timeDefendendo[rodada]?.get("NOME")

    if (tipoDoAtaque == "FÍSICO") {
        ataque = (timeAtacando[rodada]?.get("STATUS") as Map<*, *>)["ATAQUE"] as Double
        defesa = (timeDefendendo[rodada]?.get("STATUS") as Map<*, *>)["DEFESA"] as Double

    } else {
        ataque = (timeAtacando[rodada]?.get("STATUS") as Map<*, *>)["ATAQUE_ESPECIAL"] as Double
        defesa = (timeDefendendo[rodada]?.get("STATUS") as Map<*, *>)["DEFESA_ESPECIAL"] as Double
    }

    val dano = (((2 * nivel / 5 + 2) * forcaDoAtaque * (ataque / defesa)) / 50) + 2


    if (vrfcFraqueza) {
        danoFinal = dano * 2
        println("\nO ataque foi super efetivo!")
    } else if (vrfcResistencia) {
        danoFinal = dano * 0.5
        println("\nNão é muito efetivo...")
    } else if (vrfcNulo) {
        danoFinal = dano * 0.0
        println("\nO ataque não tem efeito.")
    } else {
        danoFinal = dano
    }

    vidaPkmnInimigo1 = vidaPkmnInimigo1 - danoFinal

    if (vidaPkmnInimigo1 < 0.0) {
        vidaPkmnInimigo1 = 0.0
    }

    println(
        "\n$nomePokemon de $nomePlayer levou ${danoFinal.toInt()} de dano!" +
                "\nVida restante do $nomePokemon de $nomePlayer: ${vidaPkmnInimigo1.toInt()}"
    )
    return vidaPkmnInimigo1
}