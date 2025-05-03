package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.Trabalho

val regexCadastro = Regex("[1-2]")

val regexPokemonBatalha = Regex("[1-3]")

val regexEscolhaPokemon = Regex("^(?:[1-9]|[1-9][0-9]|1[0-4][0-9]|150|151)\$")

val regexDecisaoSN = Regex("^[SN]$")

fun main() {
    var duracaoDelay: Long = 2000
    var duracaoDelay2: Long = 6000
    var nomeP1 = "Red"
    var nomeP2 = "Blue"
    var generoP1 = "Menino"
    var generoP2 = "Menino"

    println(
        "Este programa possui uma introdução" +
                "\nQuer pulá-la?" +
                "\nS - sim || N - não"
    )
    var semIntroducao: String

    do {

        semIntroducao = readln().uppercase()

        if (!regexDecisaoSN.matches(semIntroducao)) {
            println("Caractere inválido")
        }

    } while (!regexDecisaoSN.matches(semIntroducao))

    if (semIntroducao == "N") {

        println(
            "Este programa possui delays de ${(duracaoDelay / 1000)} segundos entre prints\npara tornar a experiência mais imersiva." +
                    "\nGostaria de desativá-los?" +
                    "\nS - sim || N - não"
        )

        var semDelay: String

        do {

            semDelay = readln().uppercase()

            if (!regexCadastro.matches(semDelay)) {
                println("Caractere inválido")
            }

        } while (!regexDecisaoSN.matches(semDelay))

        if (semDelay.uppercase() == "S") {
            duracaoDelay = 0
            duracaoDelay2 = 0
        }

        println(
            "Você é um menino ou uma menina?" +
                    "\n1 - Menino || 2 - Menina"
        )

        do {

            generoP1 = readln()

            if (!regexCadastro.matches(generoP1)) {
                println("Caractere inválido")
            }

        } while (!regexCadastro.matches(generoP1))

        Thread.sleep(duracaoDelay)

        if (generoP1.toInt() == 1) {
            println("Entendi. Um menino.")
        } else {
            println("Entendi. Uma menina.")
        }

        Thread.sleep(duracaoDelay)

        println("Como você quer ser chamado?")
        nomeP1 = readln()

        Thread.sleep(duracaoDelay)

        println("$nomeP1 é? Que interessante.")

        Thread.sleep(duracaoDelay)

        println("$nomeP1, vejo que há alguém do seu lado.")

        Thread.sleep(duracaoDelay)

        println(
            "\nEssa pessoa também é um garoto?" +
                    "\nS - sim || N - não"
        )

        do {

            generoP2 = readln().uppercase()

            if (!regexCadastro.matches(generoP2)) {
                println("Caractere inválido")
            }

        } while (!regexDecisaoSN.matches(generoP2))
        Thread.sleep(duracaoDelay)

        if (generoP2.uppercase() == "S") {
            println(
                "Bem que eu estava reconhecendo, é o meu neto!" +
                        "\nPor mais que não nos pareçemos."
            )

            Thread.sleep(duracaoDelay)

            println("Hmm. Estou tentando lembrar o nome dele...")

            Thread.sleep(duracaoDelay)

            println("Vocês sempre foram rivais.")

            Thread.sleep(duracaoDelay)

            println("Pode me ajudar?")

            Thread.sleep(duracaoDelay)

            println("Qual era o nome do meu neto?")
        } else {
            println(
                "Bem que eu estava reconhecendo, é a minha neta." +
                        "\nPor mais que não nos pareçemos."
            )

            Thread.sleep(duracaoDelay)

            println("Hmm. Estou tentando lembrar o nome dela...")

            Thread.sleep(duracaoDelay)

            println("Vocês sempre foram rivais.")

            Thread.sleep(duracaoDelay)

            println("Pode me ajudar?")

            Thread.sleep(duracaoDelay)

            println("Qual era o nome da minha neta?")
        }
        nomeP2 = readln()

        Thread.sleep(duracaoDelay)

        println("Verdade! $nomeP2! Isso mesmo.")

        Thread.sleep(duracaoDelay)
    } else {
        duracaoDelay = 0
        duracaoDelay2 = 0

        println("Qual será o nome do Player 1?")
        nomeP1 = readln()

        println(
            "Você é um menino ou uma menina, $nomeP1?" +
                    "\n1 - Menino || 2 - Menina"
        )
        do {

            generoP1 = readln()

            if (!regexCadastro.matches(generoP1)) {
                println("Caractere inválido")
            }

        } while (!regexCadastro.matches(generoP1))

        println("Qual será o nome do Player 2?")
        nomeP2 = readln()

        println(
            "Você é um menino ou uma menina, $nomeP2?" +
                    "\n1 - Menino || 2 - Menina"
        )
        do {

            generoP1 = readln()

            if (!regexCadastro.matches(generoP1)) {
                println("Caractere inválido")
            }

        } while (!regexCadastro.matches(generoP1))
    }

    println(
        "Pelo que vejo, vocês estão aqui para batalhar." +
                "\nHora de iniciar os preparativos então."
    )

    Thread.sleep(duracaoDelay)

    var qtdePokemonLuta: String

    do {
        println(
            "\nQuantos Pokémon batalharão?" +
                    "\nEscolha:" +
                    "\n1 - Um" +
                    "\n2 - Dois" +
                    "\n3 - Três"
        )

        qtdePokemonLuta = readln()

        if (regexPokemonBatalha.matches(qtdePokemonLuta)) {
            when (qtdePokemonLuta.toInt()) {
                1 -> {
                    Thread.sleep(duracaoDelay)
                    println("\nUm Pokémon será então.\n")
                }

                2 -> {
                    Thread.sleep(duracaoDelay)
                    println("\nDois Pokémon será então.\n")
                }

                3 -> {
                    Thread.sleep(duracaoDelay)
                    println("\nTrês Pokémon será então.")
                }
            }
        } else {
            println("Caractere inválido")
        }

    } while (!regexPokemonBatalha.matches(qtdePokemonLuta))

    Thread.sleep(duracaoDelay2)

    val timePlayer1: MutableMap<Int, Map<String, Any>?> = mutableMapOf()
    val timePlayer2: MutableMap<Int, Map<String, Any>?> = mutableMapOf()
    var p1 = true
    do {

        var repeticao = 0

        if (p1) {
            println(
                "\nQuais dos 151 Pokémon vai querer usar, $nomeP1?" +
                        "\nSelecione:"
            )
        } else {
            println(
                "\nQuais dos 151 Pokémon vai querer usar, $nomeP2?" +
                        "\nSelecione:"
            )
        }

        Thread.sleep(duracaoDelay2)

        mostrarPokemon(mapaTodosPokemon)

        do {
            var escolha: String

            do {

                escolha = readln()

                if (!regexEscolhaPokemon.matches(escolha)) {
                    println(
                        "\nPokémon indisponível ou caractere inválido" +
                                "\nTente novamente."
                    )
                }

            } while (!regexEscolhaPokemon.matches(escolha))

            val pokemonEscolhido = mapaTodosPokemon[escolha.toInt()]

            if (p1) {

                timePlayer1[repeticao] = pokemonEscolhido

            } else {

                timePlayer2[repeticao] = pokemonEscolhido

            }

            println("${pokemonEscolhido?.get("NOME")} escolhido.")

            repeticao++

        } while (repeticao != qtdePokemonLuta.toInt())

        p1 = false

    } while (timePlayer2.isEmpty())
    //Thread.sleep(2000)

    p1 = true
    var nomePlyr = ""
    var timePlyr: Map<Int, Map<String, Any>?>

    for (i in 1..2){
        if (p1) {
            nomePlyr = nomeP1
            timePlyr = timePlayer1
        } else {
            nomePlyr = nomeP2
            timePlyr = timePlayer2
        }

        println("\nTime de $nomePlyr:")
        for ((chave, valor) in timePlyr) {
            val pokemon = valor as? Map<*, *>
            val nomePokemon = pokemon?.get("NOME")
            println("${chave + 1}: $nomePokemon")
        }

        p1 = false
    }

    var rodada = 0

    var vitoriasP1 = 0
    var vitoriasP2 = 0

    p1 = true
    var vidaPkmnP1 = timePlayer1[rodada]?.get("VIDA") as Double
    var vidaPkmnP2 = timePlayer2[rodada]?.get("VIDA") as Double


    do {
        do {
            var playerAtual: Map<Int, Map<String, Any>?>
            var nomePlayerAtual: String

            if (p1) {
                playerAtual = timePlayer1
                nomePlayerAtual = nomeP1
            } else {
                playerAtual = timePlayer2
                nomePlayerAtual = nomeP2
            }

            val atqsPokemon = playerAtual[rodada]?.get("ATAQUES") as? Map<*, *>

            print(
                "\nÉ vez de: $nomePlayerAtual" +
                        "\nQual ataque seu ${playerAtual[rodada]?.get("NOME")} usará?\n\n"
            )

            atqsPokemon?.values?.withIndex()?.forEach { (index, ataque) ->
                val atributo = ataque as? List<*>
                val nomeAtaque = atributo?.get(0)
                val danoAtaque = atributo?.get(1)
                val tipoAtaque = atributo?.get(2)

                println(
                    "Ataque ${index + 1}:" +
                            "\nNome: $nomeAtaque" +
                            "\nDano: $danoAtaque" +
                            "\nTipo: $tipoAtaque\n"
                )
            }

            println(
                "Opções:" +
                        "\n1 || 2 || 3 || 4"
            )

            val escolhaAtq = readln().toInt()

            val atqPlyr = gerarDanoAtaque(playerAtual[rodada], "ATAQUES", escolhaAtq, 1)

            val tipoDoAtaque = pegarTipoDoAtaque(playerAtual[rodada], "ATAQUES", escolhaAtq, 2)

            val pkmnInimigoTemFrqz = compararTipoDoAtq(playerAtual[rodada], "DESVANTAGENS", tipoDoAtaque)


            if (p1) {
                val vidaDoPkmnP2 = calculoDano(pkmnInimigoTemFrqz, timePlayer2, atqPlyr, vidaPkmnP2, nomeP2)
                vidaPkmnP2 = vidaDoPkmnP2
                if (vidaDoPkmnP2 <= 0.0) {
                    vitoriasP1++
                    println("$nomeP1 venceu a rodada $rodada")
                }
                p1 = false
            } else {
                val vidaDoPkmnP1 = calculoDano(pkmnInimigoTemFrqz, timePlayer1, atqPlyr, vidaPkmnP1, nomeP1)
                vidaPkmnP1 = vidaDoPkmnP1
                if (vidaDoPkmnP1 <= 0.0) {
                    vitoriasP2++
                    println("\n$nomeP2 venceu a rodada $rodada!")
                }
                p1 = true
            }
        } while (vidaPkmnP1 > 0.0 && vidaPkmnP2 > 0.0)

        rodada++

        if (rodada < 2) {
            vidaPkmnP1 = timePlayer1[rodada]?.get("VIDA") as Double
            vidaPkmnP2 = timePlayer2[rodada]?.get("VIDA") as Double
        }
    } while (rodada < qtdePokemonLuta.toInt())

    val msgmVtriaM = "é o grande vencedor!"
    val msgmVtriaF = "é a grande vencedora!"
    if (vitoriasP1 > vitoriasP2) {
        if (generoP1.toInt() == 1) {
            println(
                "$nomeP1 $msgmVtriaM" +
                        "\nEle venceu $vitoriasP1 combates."
            )
        } else {
            println(
                "$nomeP1 $msgmVtriaF" +
                        "\nEla venceu $vitoriasP1 combates."
            )
        }
    } else {
        if (generoP2.toInt() == 1) {
            println(
                "$nomeP1 $msgmVtriaM" +
                        "\nEle venceu $vitoriasP1 combates."
            )
        } else {
            println(
                "$nomeP1 $msgmVtriaF" +
                        "\nEla venceu $vitoriasP1 combates."
            )
        }
    }






    //Uma aberração baseada na primeira
    //Tem como objetivo determinar se o tipo do ataque está nas fraquezas do Pokémon
    //Tudo por causa da nova chave que eu criei: "DESVANTAGENS"
    //Não funciona (por enquanto)


}