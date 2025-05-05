package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.Trabalho

val bulbasaur: Map<String, Any> = mapOf(
    "NOME" to "Bulbasaur",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "PSÍQUICO", "GELO", "VOADOR"),
    "STATUS" to mapOf(
        "VIDA" to 294.0,
        "ATAQUE" to 216.0,
        "DEFESA" to 216.0,
        "ATAQUE_ESPECIAL" to 251.0,
        "DEFESA_ESPECIAL" to 251.0,
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Chicote de Vinha", 45, "GRAMA", "FÍSICO"),
        2 to listOf("Semente Bombástica", 80, "GRAMA", "ESPECIAL"),
        3 to listOf("Cabeçada", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)

val ivysaur: Map<String, Any> = mapOf(
    "NOME" to "Ivysaur",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "PSÍQUICO", "GELO", "VOADOR"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 245.0,
        "DEFESA" to 247.0,
        "ATAQUE_ESPECIAL" to 284.0,
        "DEFESA_ESPECIAL" to 284.0,
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bomba de Sementes", 80, "GRAMA", "ESPECIAL"),
        2 to listOf("Investida", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Bomba de Lodo", 90, "VENENO", "ESPECIAL"),
        4 to listOf("Raio da Cura", 0, "NORMAL", "ESPECIAL")
    )
)

val venusaur: Map<String, Any> = mapOf(
    "NOME" to "Venusaur",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTA", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "PSÍQUICO", "VOADOR"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 289.0,
        "DEFESA" to 291.0,
        "ATAQUE_ESPECIAL" to 328.0,
        "DEFESA_ESPECIAL" to 328.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bomba de Lodo", 90, "VENENO", "ESPECIAL"),
        2 to listOf("Pontada Dupla", 120, "NORMAL", "FÍSICO"),
        3 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL"),
        4 to listOf("Terremoto", 100, "TERRA", "FÍSICO")
    )
)

val charmander: Map<String, Any> = mapOf(
    "NOME" to "Charmander",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "FADA", "METAL"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 282.0,
        "ATAQUE" to 223.0,
        "DEFESA" to 203.0,
        "ATAQUE_ESPECIAL" to 240.0,
        "DEFESA_ESPECIAL" to 218.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL"),
        2 to listOf("Garra de Metal", 50, "METAL", "FÍSICO"),
        3 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Cavar", 80, "TERRA", "FÍSICO")
    )
)

val charmeleon: Map<String, Any> = mapOf(
    "NOME" to "Charmeleon",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "FADA", "METAL"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 320.0,
        "ATAQUE" to 249.0,
        "DEFESA" to 236.0,
        "ATAQUE_ESPECIAL" to 284.0,
        "DEFESA_ESPECIAL" to 251.0,
        "VELOCIDADE" to 284.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Pulso do Dragão", 85, "DRAGÃO", "ESPECIAL"),
        3 to listOf("Mastigada", 80, "SOMBRIO", "FÍSICO"),
        4 to listOf("Presas de Fogo", 65, "FOGO", "FÍSICO")
    )
)

val charizard: Map<String, Any> = mapOf(
    "NOME" to "Charizard",
    "TIPOS" to listOf("FOGO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "FADA", "METAL", "LUTA"),
    "DESVANTAGENS" to listOf("ÁGUA", "ELÉTRICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 360.0,
        "ATAQUE" to 293.0,
        "DEFESA" to 280.0,
        "ATAQUE_ESPECIAL" to 348.0,
        "DEFESA_ESPECIAL" to 295.0,
        "VELOCIDADE" to 328.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        3 to listOf("Pontada Dupla", 120, "NORMAL", "FÍSICO"),
        4 to listOf("Garra de Dragão", 80, "DRAGÃO", "FÍSICO")
    )
)

val squirtle: Map<String, Any> = mapOf(
    "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
)

val wartortle: Map<String, Any> = mapOf(
    "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
)

val blastoise: Map<String, Any> = mapOf(
    "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA")
)

val caterpie: Map<String, Any> = mapOf(
    "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO")
)

val metapod: Map<String, Any> = mapOf(
    "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO")
)

val butterfree: Map<String, Any> = mapOf(
    "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO"),
    "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
)

val weedle: Map<String, Any> = mapOf(
    "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO"),
)

val kakuna: Map<String, Any> = mapOf(
    "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO"),
    "VENENO" to listOf("FADA, PLANTA")
)

val beedrill: Map<String, Any> = mapOf(
    "INSETO" to listOf("PLANTA", "SOMBRIO", "PSIQUICO"),
    "VENENO" to listOf("FADA, PLANTA")
)

val pidgey: Map<String, Any> = mapOf(
    "NORMAL" to listOf("NENHUMA"),
    "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
)

val pidgeotto: Map<String, Any> = mapOf(
    "NORMAL" to listOf("NENHUMA"),
    "VOADOR" to listOf("PLANTA", "INSETO", "LUTADOR")
)

val pidgeot: Map<String, Any> = mapOf(
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
    "NOME" to "Kabuto",
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

val mapaTodosPokemon: Map<Int, Map<String, Any>> = mapOf(
    1 to bulbasaur,
    2 to ivysaur,
    3 to venusaur,
    4 to charmander,
    5 to charmeleon,
    6 to charizard,
    7 to squirtle,
    8 to wartortle,
    9 to blastoise,
    10 to caterpie,
    11 to metapod,
    12 to butterfree,
    13 to weedle,
    14 to kakuna,
    15 to beedrill,
    16 to pidgey,
    17 to pidgeotto,
    18 to pidgeot,
    19 to rattata,
    20 to raticate,
    21 to spearow,
    22 to fearow,
    23 to ekans,
    24 to arbok,
    25 to pikachu,
    26 to raichu,
    27 to sandshrew,
    28 to sandslash,
    29 to nidoran_f,
    30 to nidorina,
    31 to nidoqueen,
    32 to nidoran_m,
    33 to nidorino,
    34 to nidoking,
    35 to clefairy,
    36 to clefable,
    37 to vulpix,
    38 to ninetales,
    39 to jigglypuff,
    40 to wigglytuff,
    41 to zubat,
    42 to golbat,
    43 to oddish,
    44 to gloom,
    45 to vileplume,
    46 to paras,
    47 to parasect,
    48 to venonat,
    49 to venomoth,
    50 to diglett,
    51 to dugtrio,
    52 to meowth,
    53 to persian,
    54 to psyduck,
    55 to golduck,
    56 to mankey,
    57 to primeape,
    58 to growlithe,
    59 to arcanine,
    60 to poliwag,
    61 to poliwhirl,
    62 to poliwrath,
    63 to abra,
    64 to kadabra,
    65 to alakazam,
    66 to machop,
    67 to machoke,
    68 to machamp,
    69 to bellsprout,
    70 to weepinbell,
    71 to victreebel,
    72 to tentacool,
    73 to tentacruel,
    74 to geodude,
    75 to graveler,
    76 to golem,
    77 to ponyta,
    78 to rapidash,
    79 to slowpoke,
    80 to slowbro,
    81 to magnemite,
    82 to magneton,
    83 to farfetchd,
    84 to doduo,
    85 to dodrio,
    86 to seel,
    87 to dewgong,
    88 to grimer,
    89 to muk,
    90 to shellder,
    91 to cloyster,
    92 to gastly,
    93 to haunter,
    94 to gengar,
    95 to onix,
    96 to drowzee,
    97 to hypno,
    98 to krabby,
    99 to kingler,
    100 to voltorb,
    101 to electrode,
    102 to exeggcute,
    103 to exeggutor,
    104 to cubone,
    105 to marowak,
    106 to hitmonlee,
    107 to hitmonchan,
    108 to lickitung,
    109 to koffing,
    110 to weezing,
    111 to rhyhorn,
    112 to rhydon,
    113 to chansey,
    114 to tangela,
    115 to kangaskhan,
    116 to horsea,
    117 to seadra,
    118 to goldeen,
    119 to seaking,
    120 to staryu,
    121 to starmie,
    122 to mrMime,
    123 to scyther,
    124 to jynx,
    125 to electabuzz,
    126 to magmar,
    127 to pinsir,
    128 to tauros,
    129 to magikarp,
    130 to gyarados,
    131 to lapras,
    132 to ditto,
    133 to eevee,
    134 to vaporeon,
    135 to jolteon,
    136 to flareon,
    137 to porygon,
    138 to omanyte,
    139 to omastar,
    140 to kabuto,
    141 to kabutops,
    142 to aerodactyl,
    143 to snorlax,
    144 to articuno,
    145 to zapdos,
    146 to moltres,
    147 to dratini,
    148 to dragonair,
    149 to dragonite,
    150 to mewtwo,
    151 to mew
)