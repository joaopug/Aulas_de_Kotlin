package semestre_3_2025.mes_4_abril.aula_16_04_Pilhas_Filas_Listas.exerciciosMap.ex2partidaLoL

fun main() {
    programa()
}

fun programa() {
    val jogador1 = mapOf(
        "DanoTotal" to 35000.0,
        "DanoMedio" to 1500.0,
        "DanoSofridoMedio" to 800.0,
        "DistanciaPercorrida" to 12000.0,
        "Mortes" to 4.0,
        "Abatimentos" to 9.0
    )

    val jogador2 = mapOf(
        "DanoTotal" to 28000.0,
        "DanoMedio" to 1300.0,
        "DanoSofridoMedio" to 1000.0,
        "DistanciaPercorrida" to 10500.0,
        "Mortes" to 5.0,
        "Abatimentos" to 7.0
    )

    val jogador3 = mapOf(
        "DanoTotal" to 15000.0,
        "DanoMedio" to 600.0,
        "DanoSofridoMedio" to 2000.0,
        "DistanciaPercorrida" to 11000.0,
        "Mortes" to 3.0,
        "Abatimentos" to 2.0
    )

    val jogador4 = mapOf(
        "DanoTotal" to 32000.0,
        "DanoMedio" to 1800.0,
        "DanoSofridoMedio" to 900.0,
        "DistanciaPercorrida" to 13500.0,
        "Mortes" to 6.0,
        "Abatimentos" to 12.0
    )

    val time = mapOf(
        1 to jogador1,
        2 to jogador2,
        3 to jogador3,
        4 to jogador4
    )

    var dnTotalTime = 0.0
    var dnMedioTime = 0.0
    var dnSfrdoMedTime = 0.0
    var dstnciaPrcrrdaTime = 0.0
    var mortesTime = 0.0
    var abatimentosTime = 0.0

    time.values.forEach { jogador ->
        val dnTotal = jogador["DanoTotal"] as Double
        val dnMedio = jogador["DanoMedio"] as Double
        val dnSfrdoMed = jogador["DanoSofridoMedio"] as Double
        val dstnciaPrcrrda = jogador["DistanciaPercorrida"] as Double
        val mortes = jogador["Mortes"] as Double
        val abatimentos = jogador["Abatimentos"] as Double

        dnTotalTime += dnTotal
        dnMedioTime += dnMedio
        dnSfrdoMedTime += dnSfrdoMed
        dstnciaPrcrrdaTime += dstnciaPrcrrda
        mortesTime += mortes
        abatimentosTime += abatimentos
    }

    val medDnTotalTime: Double = (dnTotalTime / 4)
    val medDnMedio = (dnMedioTime / 4)
    val medDnSfrdoMed = (dnSfrdoMedTime / 4)
    val medDstnciaPrcrrda = (dstnciaPrcrrdaTime / 4)
    val medMortes = (mortesTime / 4)
    val medAbatimentos = (abatimentosTime / 4)

    println(
        "Dano médio total do time: ${medDnTotalTime.toInt()}\n" +
                "Dano médio do dano médio do time: ${medDnMedio.toInt()}\n" +
                "Dano médio sofrido médio do time: ${medDnSfrdoMed.toInt()}\n" +
                "Distância média percorrida pelo time: ${medDstnciaPrcrrda.toInt()}\n" +
                "Morte média do time: $medMortes\n" +
                "Abatimento médio do time: $medAbatimentos"
    )
}