package mes_4_Abril.aula_16_04_Pilhas_Filas_Listas.exemploAula


fun main() {
    val bulbasauro = mapOf(
        "NOME" to listOf("Bulbasaur"),
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "DESVANTAGENS" to listOf("VOADOR", "VENENO", "INSETO", "FOGO", "GELO"),
        "VENENO" to listOf("FADA, PLANTA"),
        "VIDA" to 10.0,
        "ATAQUES" to mapOf(
            1 to listOf("Chicote de vinha", 8.0, "GRAMA"),
            2 to listOf("Tocar grama", 5.0, "GRAMA"),
            3 to listOf("Lança-chamas", 20.0, "FOGO")
        )
    )

    val ivisauro = mapOf(
        "NOME" to listOf("Ivysaur"),
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "DESVANTAGENS" to listOf("VOADOR", "VENENO", "INSETO", "FOGO", "GELO"),
        "VENENO" to listOf("FADA, PLANTA"),
        "VIDA" to 100.0,
        "ATAQUES" to mapOf(
            1 to listOf("Chicote de vinha", 8.0, "GRAMA"),
            2 to listOf("Tocar grama", 5.0, "GRAMA")
        )
    )

    val venusauro = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA, PLANTA")
    )

    val charmander = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO")
    )

    val charmeleon = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO")
    )

    val charizard = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val squirtle = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val warturtle = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val blastoise = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val caterpie = mapOf(
        "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO")
    )

    val metapod = mapOf(
        "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO")
    )

    val butterfree = mapOf(
        "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val weedle = mapOf(
        "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO"),
    )

    val kakuna = mapOf(
        "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO"),
        "VENENO" to listOf("FADA, PLANTA")
    )

    val beedrill = mapOf(
        "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO"),
        "VENENO" to listOf("FADA, PLANTA")
    )

    val pidgey = mapOf(
        "NORMAL" to listOf("NENHUMA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val pidgeotto = mapOf(
        "NORMAL" to listOf("NENHUMA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val pidgeot = mapOf(
        "NORMAL" to listOf("NENHUMA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val rattata = mapOf(
        "NORMAL" to listOf("NENHUMA"),
    )

    val raticate = mapOf(
        "NORMAL" to listOf("NENHUMA"),
    )

    val spearow = mapOf(
        "NORMAL" to listOf("NENHUMA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val fearow = mapOf(
        "NORMAL" to listOf("NENHUMA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val ekans = mapOf(
        "VENENO" to listOf("FADA, PLANTA")
    )

    val arbok = mapOf(
        "VENENO" to listOf("FADA, PLANTA")
    )

    val pikachu = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR"),
    )

    val raichu = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR"),
    )

    val sandshrew = mapOf(
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val sandslash = mapOf(
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val nidoran_f = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val nidorina = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val nidoqueen = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val nidoran_m = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val nidorino = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val nidoking = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val clefairy = mapOf(
        "FADA" to listOf("LUTADOR", "DRAGÃO", "SOMBRIO")
    )

    val clefable = mapOf(
        "FADA" to listOf("LUTADOR", "DRAGÃO", "SOMBRIO")
    )

    val vulpix = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO")
    )

    val ninetales = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO")
    )

    val jigglypuff = mapOf(
        "NORMAL" to listOf("NENHUMA"),
        "FADA" to listOf("LUTADOR", "DRAGÃO", "SOMBRIO")
    )

    val wigglytuff = mapOf(
        "NORMAL" to listOf("NENHUMA"),
        "FADA" to listOf("LUTADOR", "DRAGÃO", "SOMBRIO")
    )

    val zubat = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val golbat = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val oddish = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val gloom = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val vileplume = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val paras = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO", "SOMBRIO"),
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA")
    )

    val parasect = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO", "SOMBRIO"),
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA")
    )

    val venonat = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO", "SOMBRIO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val venomoth = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO", "SOMBRIO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val diglett = mapOf(
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val dugtrio = mapOf(
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val meowth = mapOf(
        "NORMAL" to listOf("NENHUMA")
    )

    val persian = mapOf(
        "NORMAL" to listOf("NENHUMA")
    )

    val psyduck = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val golduck = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val mankey = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "GELO", "AÇO", "SOMBRIO")
    )

    val primeape = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "GELO", "AÇO", "SOMBRIO")
    )

    val growlithe = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO")
    )

    val arcanine = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO")
    )

    val poliwag = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val poliwhirl = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val poliwrath = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "LUTADOR" to listOf("NORMAL", "PEDRA", "GELO", "AÇO", "SOMBRIO")
    )

    val abra = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val kadabra = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val alakazam = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val machop = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "GELO", "AÇO", "SOMBRIO")
    )

    val machoke = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "GELO", "AÇO", "SOMBRIO")
    )

    val machamp = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "GELO", "AÇO", "SOMBRIO")
    )

    val bellsprout = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val weepinbell = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val victreebel = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val tentacool = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val tentacruel = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val geodude = mapOf(
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val graveler = mapOf(
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val golem = mapOf(
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val ponyta = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO")
    )

    val rapidash = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO")
    )

    val slowpoke = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val slowbro = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val magnemite = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR"),
        "AÇO" to listOf("GELO", "ROCHA", "FADA")
    )

    val magneton = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR"),
        "AÇO" to listOf("GELO", "ROCHA", "FADA")
    )

    val farfetchd = mapOf(
        "NORMAL" to listOf("NENHUMA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val doduo = mapOf(
        "NORMAL" to listOf("NENHUMA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val dodrio = mapOf(
        "NORMAL" to listOf("NENHUMA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val seel = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val dewgong = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "GELO" to listOf("PLANTA", "VOADOR", "DRAGÃO", "TERRA")
    )

    val grimer = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val muk = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val shellder = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val cloyster = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "GELO" to listOf("PLANTA", "VOADOR", "DRAGÃO", "TERRA")
    )

    val gastly = mapOf(
        "FANTASMA" to listOf("FANTASMA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val haunter = mapOf(
        "FANTASMA" to listOf("FANTASMA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val gengar = mapOf(
        "FANTASMA" to listOf("FANTASMA", "PSÍQUICO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val onix = mapOf(
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val drowzee = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val hypno = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val krabby = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val kingler = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val voltorb = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR")
    )

    val electrode = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR")
    )

    val exeggcute = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val exeggutor = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val cubone = mapOf(
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val marowak = mapOf(
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO")
    )

    val hitmonlee = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "GELO", "AÇO", "SOMBRIO")
    )

    val hitmonchan = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "GELO", "AÇO", "SOMBRIO")
    )

    val lickitung = mapOf(
        "NORMAL" to listOf("NENHUMA")
    )

    val koffing = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val weezing = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )

    val rhyhorn = mapOf(
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO"),
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO")
    )

    val rhydon = mapOf(
        "TERRA" to listOf("ELÉTRICO", "VENENO", "PEDRA", "AÇO", "FOGO"),
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO")
    )

    val chansey = mapOf(
        "NORMAL" to listOf("NENHUMA")
    )

    val tangela = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA")
    )

    val kangaskhan = mapOf(
        "NORMAL" to listOf("NENHUMA")
    )

    val horsea = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val seadra = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val goldeen = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val seaking = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val staryu = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val starmie = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val mrMime = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR"),
        "FADA" to listOf("LUTADOR", "DRAGÃO", "TREVAS")
    )

    val scyther = mapOf(
        "INSETO" to listOf("PLANTA", "SOMBRIO", "PSÍQUICO"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val jynx = mapOf(
        "GELO" to listOf("PLANTA", "VOADOR", "DRAGÃO", "TERRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val electabuzz = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR")
    )

    val magmar = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO")
    )

    val pinsir = mapOf(
        "INSETO" to listOf("PLANTA", "SOMBRIO", "PSÍQUICO")
    )

    val tauros = mapOf(
        "NORMAL" to listOf("NENHUMA")
    )

    val magikarp = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val gyarados = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val lapras = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "GELO" to listOf("PLANTA", "VOADOR", "DRAGÃO", "TERRA")
    )

    val ditto = mapOf(
        "NORMAL" to listOf("NENHUMA")
    )

    val eevee = mapOf(
        "NORMAL" to listOf("NENHUMA")
    )

    val vaporeon = mapOf(
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val jolteon = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR")
    )

    val flareon = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO")
    )

    val porygon = mapOf(
        "NORMAL" to listOf("NENHUMA")
    )

    val omanyte = mapOf(
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val omastar = mapOf(
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val kabuto = mapOf(
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val kabutops = mapOf(
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )

    val aerodactyl = mapOf(
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val snorlax = mapOf(
        "NORMAL" to listOf("NENHUMA")
    )

    val articuno = mapOf(
        "GELO" to listOf("PLANTA", "VOADOR", "DRAGÃO", "TERRA"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val zapdos = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val moltres = mapOf(
        "FOGO" to listOf("PLANTA", "AÇO", "GELO", "INSETO"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val dratini = mapOf(
        "DRAGÃO" to listOf("DRAGÃO")
    )

    val dragonair = mapOf(
        "DRAGÃO" to listOf("DRAGÃO")
    )

    val dragonite = mapOf(
        "DRAGÃO" to listOf("DRAGÃO"),
        "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
    )

    val mewtwo = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    val mew = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

    //Boa parte das variavéis não tem uso no momento

    println("Como você quer ser chamado?")
    val apelido = readln()

    //Thread.sleep(2000)

    println("$apelido é? Que interessante.")

    //Thread.sleep(2000)

    println(
        "\nQuantos Pokémon batalharão?" +
                "\nEscolha:" +
                "\n1 - Apenas um Pokémon"
    )
    //"2 - Dois" +
    //"3 - Três")
    val qtdePokemonLuta = readln().toInt()

    //Thread.sleep(2000)

    println("\nUm Pokémon será então.")

    //Thread.sleep(2000)

    println(
        "\nQuais dos 151 Pokémon vai querer usar, $apelido?" +
                "\nSelecione:" +
                "\n1 - ${bulbasauro["NOME"]}"
    )
    val pkmnescolhido = readln().toInt()

    //Thread.sleep(2000)

    println("\nBulbasauro escolhido.")

    val time_Player1 = mapOf(
        1 to bulbasauro
    )

    val time_Computador = mapOf(
        1 to ivisauro
    )

    println(
        "\nTime de $apelido:" +
                "\n1 - ${time_Player1[1]?.get("NOME")}\n"
    )

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
                "\n1 || 2"
    )

    val escolhaAtq = readln().toInt()

    //Aberração que o nome das variaveis explica o que faz, tem que transformar isso numa função depois
    //
    //Pedi pro gepeto como conseguia um valor dentro de uma lista que tá dentro de um map que esse mesmo
    //map tá dentro de outro
    //Saiu isso aí
    //
    //Explicação do que acontece:
    //   Map do primeiro Poke do player ->
    //-> Chave "ATAQUES" (um map novo que criei) ->
    //-> Chave ataque escolhido (1 ou 2 por enquanto) ->
    //-> Valor "dano"
    //
    //Essa explicação é só lógica, se quer saber que cada coisa faz, melhor pedir pro Home

    val socorro = pegarValorDoDano(time_Player1[1],"ATAQUES",escolhaAtq,1)
    println(socorro)

    var acessarMapaDosAtaques = (time_Player1[1] as? Map<String, Any>)?.get("ATAQUES") as? Map<Int, Any>
    var pegarAtaqueEscolhido = acessarMapaDosAtaques?.get(escolhaAtq) as? List<*>
    var pegarValorDoDano = pegarAtaqueEscolhido?.get(1) as Double

    //Aproveita a aberração de antes e pega o tipo do ataque também
    //-> Valor "tipo"
    var pegarTipoDoAtaque = pegarAtaqueEscolhido.get(2) as String

    //Println pra saber se deu bom
    //println("Dano do ataque: $pegarValorDoDano")
    //println("Tipo do ataque: $pegarTipoDoAtaque")

    //Uma aberração baseada na primeira
    //Tem como objetivo determinar se o tipo do ataque está nas fraquezas do Pokémon
    //Tudo por causa da nova chave que eu criei: "DESVANTAGENS"
    //Não funciona (por enquanto)

    val acessarFraquezasAdversario = ((time_Computador[1])
        ?.get("DESVANTAGENS") as? List<*>)
        ?.contains(pegarTipoDoAtaque) == true

    var vidaPkmnCpu: Double = time_Computador[1]?.get("VIDA") as Double

    var danoFinal : Double = 0.0

    if (acessarFraquezasAdversario) {
        danoFinal = pegarValorDoDano * 2
        println(
            "\nO ataque foi super efetivo!" +
                    "\n${time_Computador[1]?.get("NOME")} levou $danoFinal de dano!"
        )
        vidaPkmnCpu = vidaPkmnCpu - danoFinal
        danoFinal = 0.0
        println("\nVida restante do ${time_Computador[1]?.get("NOME")}: $vidaPkmnCpu")
    } else {
        println("\n${time_Computador[1]?.get("NOME")} levou $pegarValorDoDano de dano.")
        vidaPkmnCpu = vidaPkmnCpu - pegarValorDoDano
        println("\nVida restante do ${time_Computador[1]?.get("NOME")}: $vidaPkmnCpu")
    }

    val randomizador = 1..4
    val atqCpu = time_Computador[1]?.get("ATAQUES")

}

fun pegarValorDoDano(pokemon: Map<String, Any>?, chave: String, ataque: Int, valorAtq: Int){

    val ataques = pokemon?.get(chave) as? Map<Int, List<Any>>

    val ataqueSelecionado = ataques?.get(ataque) as? List<*>

}


fun  acessarFraquezasAdversario(){
}
