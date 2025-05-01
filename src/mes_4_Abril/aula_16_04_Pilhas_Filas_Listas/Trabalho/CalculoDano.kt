package mes_4_Abril.aula_16_04_Pilhas_Filas_Listas.Trabalho

fun calculoDano(
    vrfcFraqueza: Boolean,
    time: Map<Int, Map<String, Any>>,
    danoDoAtaque: Double,
    vidaPkmnCpu: Double
) {
    var danoFinal : Double
    var vidaPkmnCpu1 = vidaPkmnCpu
    if (vrfcFraqueza) {
        danoFinal = danoDoAtaque * 2
        println(
            "\nO ataque foi super efetivo!" +
                    "\n${time[1]?.get("NOME")} levou $danoFinal de dano!"
        )
        vidaPkmnCpu1 = vidaPkmnCpu1 - danoFinal
        println("\nVida restante do ${time[1]?.get("NOME")}: $vidaPkmnCpu1")
    } else {
        println("\n${time[1]?.get("NOME")} levou $danoDoAtaque de dano.")
        vidaPkmnCpu1 = vidaPkmnCpu1 - danoDoAtaque
        println("\nVida restante do ${time[1]?.get("NOME")}: $vidaPkmnCpu1")
    }
}