package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.Trabalho
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
    time: Map<Int, Map<String, Any>?>,
    danoDoAtaque: Double,
    vidaPkmnInimigo: Double,
    nomePlayer: String
): Double {
    var danoFinal: Double
    var vidaPkmnInimigo1 = vidaPkmnInimigo
    if (vrfcFraqueza) {
        danoFinal = danoDoAtaque * 2
        println(
            "\nO ataque foi super efetivo!" +
                    "\n${time[0]?.get("NOME")} de $nomePlayer levou $danoFinal de dano!"
        )
        vidaPkmnInimigo1 = vidaPkmnInimigo1 - danoFinal
        if (vidaPkmnInimigo1 < 0.0) {
            vidaPkmnInimigo1 = 0.0
        }
        println("\nVida restante do ${time[0]?.get("NOME")} de $nomePlayer: $vidaPkmnInimigo1")
    } else {
        println("O \n${time[0]?.get("NOME")} de $nomePlayer levou $danoDoAtaque de dano.")
        vidaPkmnInimigo1 = vidaPkmnInimigo1 - danoDoAtaque
        if (vidaPkmnInimigo1 < 0.0) {
            vidaPkmnInimigo1 = 0.0
        }
        println("\nVida restante do ${time[0]?.get("NOME")} de $nomePlayer: $vidaPkmnInimigo1")
    }
    return vidaPkmnInimigo1
}