package mes_4_Abril.aula_16_04_Pilhas_Filas_Listas.Trabalho

val regexPokemonBatalha = Regex("[1-3]")

val regexEscolhaPokemon = Regex("^(?:[1-9]|[1-9][0-9]|1[0-4][0-9]|150|151)\$")

fun main() {
    var duracaoDelay: Long = 2000
    var duracaoDelay2: Long = 6000

    println(
        "Este programa possui delays de ${(duracaoDelay/1000)} segundos entre prints\npara tornar a experiência mais imersiva." +
                "\nGostaria de desativá-los?" +
                "\nS - sim || N - não"
    )
    val semDelay = readln()

    if (semDelay.uppercase() == "S") {
        duracaoDelay = 0
        duracaoDelay2 = 0
    }

    println(
        "Você é um menino ou uma menina?" +
                "\n1 - Menino || 2 - Menina"
    )
    val generoP1 = readln()

    Thread.sleep(duracaoDelay)

    if (generoP1.toInt() == 1) {
        println("Entendi. Um menino.")
    } else {
        println("Entendi. Uma menina.")
    }

    Thread.sleep(duracaoDelay)

    println("Como você quer ser chamado?")
    val apelidoP1 = readln()

    Thread.sleep(duracaoDelay)

    println("$apelidoP1 é? Que interessante.")

    Thread.sleep(duracaoDelay)

    println("$apelidoP1, vejo que há alguém do seu lado.")

    Thread.sleep(duracaoDelay)

    println("\nEssa pessoa também é um garoto?" +
            "\nS - sim || N - não")
    val generoP2 = readln()

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
    val nomeP2 = readln()

    Thread.sleep(duracaoDelay)

    println("Verdade! $nomeP2! Isso mesmo.")

    Thread.sleep(duracaoDelay)

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
                    println("\nTrês Pokémon será então.\n")
                }
            }
        } else {
            println("Caractere inválido")
        }

    } while (!regexPokemonBatalha.matches(qtdePokemonLuta))

    Thread.sleep(duracaoDelay2)

    println(
        "Quais dos 151 Pokémon vai querer usar, $apelidoP1?" +
                "\nSelecione:"
    )

    Thread.sleep(duracaoDelay)

    for ((chave, valor) in mapaPokemons) {
        val pokemon = valor as? Map<*, *>
        val nomePokemon = pokemon?.get("NOME")
        println("$chave: $nomePokemon")
    }

    var time_Player1: MutableMap<Int, Map<String, Any>?> = mutableMapOf()
    var time_Player2: MutableMap<Int, Map<String, Any>?> = mutableMapOf()
    var repeticao = 0

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

        var pokemonEscolhido = mapaPokemons[escolha.toInt()]

        time_Player1[repeticao] = pokemonEscolhido

        println("${pokemonEscolhido?.get("NOME")} escolhido.")

        repeticao++

    } while (repeticao != qtdePokemonLuta.toInt())
    //Thread.sleep(2000)

    println("\nTime de $apelidoP1:")
    for ((chave, valor) in time_Player1) {
        val pokemon = valor as? Map<*, *>
        val nomePokemon = pokemon?.get("NOME")
        println("${chave + 1}: $nomePokemon")
    }

    /*
    //Thread.sleep(2000)

    println(
        "Time adversário:" +
                "\n1 - ${time_Computador[1]?.get("NOME")}"
    )

    //Thread.sleep(5000)

    //O print dos "ATAQUES" será necessário reformulação para ficar mais bonito
    println(
        "Que a batalha comece!!!" +
                "\n\n$apelido começa atacando primeiro!" +
                "\n\nQual ataque o seu ${time_Player1[1]?.get("NOME")} usará?" +
                "\n${time_Player1[1]?.get("ATAQUES")}" +
                "\nEscolha:" +
                "\n1 || 2 || 3 || 4"
    )

    val escolhaAtq = readln().toInt()

    //Aberração
    //
    //Explicação do que acontece:
    //   Map do primeiro Poke do player ->
    //-> Chave "ATAQUES" (um map novo que criei) ->
    //-> Chave ataque escolhido (1 ou 2 por enquanto) ->
    //-> Valor "dano"
    //
    //Essa explicação é só lógica, se quer saber que cada coisa faz, melhor pedir pro Home

    var atqPlyr = gerarDanoAtaque(time_Player1[1], "ATAQUES", escolhaAtq, 1)
    println(atqPlyr)

    //Aproveita a aberração de antes e pega o tipo do ataque também
    //-> Valor "tipo"
    var tipoDoAtaque = pegarTipoDoAtaque(time_Player1[1], "ATAQUES", escolhaAtq, 2)

    //Uma aberração baseada na primeira
    //Tem como objetivo determinar se o tipo do ataque está nas fraquezas do Pokémon
    //Tudo por causa da nova chave que eu criei: "DESVANTAGENS"
    //Não funciona (por enquanto)

    var vidaPkmnCpu: Double = time_Computador[1]?.get("VIDA") as Double

    var cpuTemFraqueza = compararTipoDoAtq(time_Computador[1], "DESVANTAGENS", tipoDoAtaque)

    calculoDano(cpuTemFraqueza, time_Computador, atqPlyr, vidaPkmnCpu)

    var randomizador = (1..4).random()
    var atqCpu = gerarDanoAtaque(time_Computador[1], "ATAQUES", randomizador, 1)
    var tipoAtqCpu = pegarTipoDoAtaque(time_Computador[1],"ATAQUES",randomizador, 2)
    var vidaPkmnPlyr: Double = time_Player[1]?.get("VIDA") as Double
    var plyrTemFraqueza = compararTipoDoAtq(time_Player1[1], "DESVANTAGENS", tipoAtqCpu)

    calculoDano(plyrTemFraqueza, time_Computador, atqCpu, vidaPkmnPlyr)

*/

}