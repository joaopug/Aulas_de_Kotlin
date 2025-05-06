package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.trabalho

val regexCadastro = Regex("[1-2]")

val regexNome = Regex("^[a-zA-ZÀ-ÿ ]+$")

val regexNroPokemon = Regex("[1-3]")

val regexEscolhaAtq = Regex("[1-4]")

val regexEscolhaPokemon = Regex("^(?:[1-9]|[1-9][0-9]|1[0-4][0-9]|150|151)$")

val regexDecisaoSN = Regex("^[SN]$")

fun main() {
    var duracaoDelay: Long = 2000
    var duracaoDelay2: Long = 6000
    var duracaoDelay3: Long = 1000
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

            if (!regexDecisaoSN.matches(semDelay)) {
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
        do {
            nomeP1 = readln()
            if (!regexNome.matches(nomeP1)) {
                println("Digite algo.")
            }
        } while (!regexNome.matches(nomeP1))

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

            if (!regexDecisaoSN.matches(generoP2)) {
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

            generoP2 = readln()

            if (!regexCadastro.matches(generoP2)) {
                println("Caractere inválido")
            }

        } while (!regexCadastro.matches(generoP2))
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

        if (regexNroPokemon.matches(qtdePokemonLuta)) {
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

    } while (!regexNroPokemon.matches(qtdePokemonLuta))

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

    p1 = true
    var nomePlyr: String
    var timePlyr: Map<Int, Map<String, Any>?>

    for (i in 1..2) {
        Thread.sleep(duracaoDelay)
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
    Thread.sleep(duracaoDelay)

    var rodada = 0

    var vitoriasP1 = 0
    var vitoriasP2 = 0

    var vidaPkmnP1 = (timePlayer1[rodada]?.get("STATUS") as Map<*, *>)["VIDA"] as Double
    var vidaPkmnP2 = (timePlayer2[rodada]?.get("STATUS") as Map<*, *>)["VIDA"] as Double

    var velocidadePkmnP1 = (timePlayer1[rodada]?.get("STATUS") as Map<*, *>)["VELOCIDADE"] as Double
    var velocidadePkmnP2 = (timePlayer2[rodada]?.get("STATUS") as Map<*, *>)["VELOCIDADE"] as Double


    do {
        println("\nRodada ${rodada + 1}: iniciar!")
        Thread.sleep(duracaoDelay)
        p1 = if (velocidadePkmnP2 > velocidadePkmnP1) {
            false
        } else {
            true
        }
        do {
            var playerAtacando: Map<Int, Map<String, Any>?>
            var playerDefendendo: Map<Int, Map<String, Any>?>
            var nomePlayerAtacando: String
            var nomePlayerDefendendo: String
            var nomePokemonAtacando: String
            var nomePokemonDefendendo: String
            var vidaPokemonAtacando: Double
            var vidaPokemonDefendendo: Double


            if (p1) {
                playerAtacando = timePlayer1
                playerDefendendo = timePlayer2
                nomePlayerAtacando = nomeP1
                nomePlayerDefendendo = nomeP2
                vidaPokemonAtacando = vidaPkmnP1
                vidaPokemonDefendendo = vidaPkmnP2
                nomePokemonAtacando = playerAtacando[rodada]?.get("NOME") as String
                nomePokemonDefendendo = playerDefendendo[rodada]?.get("NOME") as String
            } else {
                playerAtacando = timePlayer2
                playerDefendendo = timePlayer1
                nomePlayerAtacando = nomeP2
                nomePlayerDefendendo = nomeP1
                vidaPokemonAtacando = vidaPkmnP2
                vidaPokemonDefendendo = vidaPkmnP1
                nomePokemonAtacando = playerAtacando[rodada]?.get("NOME") as String
                nomePokemonDefendendo = playerDefendendo[rodada]?.get("NOME") as String
            }

            val atqsPokemon = playerAtacando[rodada]?.get("ATAQUES") as? Map<*, *>

            print(
                "\nO $nomePokemonAtacando de $nomePlayerAtacando é mais veloz!" +
                        "\n$nomePokemonAtacando começa atacando."
            )

            Thread.sleep(duracaoDelay)

            println(
                "\nQual ataque $nomePokemonAtacando usará, $nomePlayerAtacando?" +
                        "\nVida do seu $nomePokemonAtacando: $vidaPokemonAtacando" +
                        "\n\nVida do $nomePokemonDefendendo de $nomePlayerDefendendo: $vidaPokemonDefendendo\n\n"
            )

            atqsPokemon?.values?.withIndex()?.forEach { (index, ataque) ->
                val atributo = ataque as? List<*>
                val nomeAtaque = atributo?.get(0)
                val forcaAtaque = atributo?.get(1)
                val elementoAtaque = atributo?.get(2)
                val tipoAtaque = atributo?.get(3)

                Thread.sleep(duracaoDelay3)

                println(
                    "Ataque ${index + 1}" +
                            "\nNome: $nomeAtaque" +
                            "\nForça: $forcaAtaque" +
                            "\nElemento: $elementoAtaque" +
                            "\nTipo: $tipoAtaque\n"
                )
            }

            println(
                "Opções:" +
                        "\n[ 1 || 2 || 3 || 4 ]"
            )
            var escolhaAtq: String

            do {

                escolhaAtq = readln()

                if (!regexEscolhaAtq.matches(escolhaAtq)) {
                    println("Somente números de 1 a 4.")
                }
            } while (!regexEscolhaAtq.matches(escolhaAtq))

            val forcaAtq = pegarForcaAtq(playerAtacando[rodada], "ATAQUES", escolhaAtq.toInt(), 1)

            val elementoAtq = pegarElementoDoAtq(playerAtacando[rodada], "ATAQUES", escolhaAtq.toInt(), 2)

            val tipoAtq = pegarTipoDoAtq(playerAtacando[rodada], "ATAQUES", escolhaAtq.toInt(), 3)

            val pkmnInimigoTemNulidade = verSeTemNulidade(playerDefendendo[rodada], "TIPOS", elementoAtq)

            val pkmnInimigoTemFrqz = verSeTemFraqueza(playerDefendendo[rodada], "DESVANTAGENS", elementoAtq)

            val pkmnInimigoTemResistencia = verSeTemResistencia(playerDefendendo[rodada], "RESISTÊNCIAS", elementoAtq)


            if (p1) {
                val vidaDoPkmnP2 = calculoDano(
                    pkmnInimigoTemFrqz,
                    pkmnInimigoTemResistencia,
                    pkmnInimigoTemNulidade,
                    timePlayer1,
                    timePlayer2,
                    rodada,
                    forcaAtq,
                    tipoAtq,
                    vidaPkmnP2,
                    nomeP2
                )
                vidaPkmnP2 = vidaDoPkmnP2
                if (vidaDoPkmnP2 <= 0.0) {
                    vitoriasP1++
                    println("\n$nomeP1 venceu a rodada ${rodada + 1}")
                }
                p1 = false
            } else {
                val vidaDoPkmnP1 = calculoDano(
                    pkmnInimigoTemFrqz,
                    pkmnInimigoTemResistencia,
                    pkmnInimigoTemNulidade,
                    timePlayer2,
                    timePlayer1,
                    rodada,
                    forcaAtq,
                    tipoAtq,
                    vidaPkmnP1,
                    nomeP1
                )
                vidaPkmnP1 = vidaDoPkmnP1
                if (vidaDoPkmnP1 <= 0.0) {
                    vitoriasP2++
                    println("\n$nomeP2 venceu a rodada ${rodada + 1}!")
                }
                p1 = true
            }
        } while (vidaPkmnP1 > 0.0 && vidaPkmnP2 > 0.0)

        rodada++

        if (qtdePokemonLuta.toInt() > 1) {
            if (rodada < 3) {
                vidaPkmnP1 = (timePlayer1[rodada]?.get("STATUS") as Map<*, *>)["VIDA"] as Double
                vidaPkmnP2 = (timePlayer2[rodada]?.get("STATUS") as Map<*, *>)["VIDA"] as Double
                velocidadePkmnP1 = (timePlayer1[rodada]?.get("STATUS") as Map<*, *>)["VELOCIDADE"] as Double
                velocidadePkmnP2 = (timePlayer2[rodada]?.get("STATUS") as Map<*, *>)["VELOCIDADE"] as Double
            }
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
                "$nomeP2 $msgmVtriaM" +
                        "\nEle venceu $vitoriasP2 combates."
            )
        } else {
            println(
                "$nomeP2 $msgmVtriaF" +
                        "\nEla venceu $vitoriasP2 combates."
            )
        }
    }
}