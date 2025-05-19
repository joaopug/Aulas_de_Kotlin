package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.trabalho

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
        "VELOCIDADE" to 207.0
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
        "VIDA" to 324.,
        "ATAQUE" to 245.0,
        "DEFESA" to 247.0,
        "ATAQUE_ESPECIAL" to 284.0,
        "DEFESA_ESPECIAL" to 284.0,
        "VELOCIDADE" to 240.0
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
        "DEFESA_ESPECIAL" to 328.0,
        "VELOCIDADE" to 284.0
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
        "DEFESA_ESPECIAL" to 218.0,
        "VELOCIDADE" to 251.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
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
    "NOME" to "Squirtle",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 292.0,
        "ATAQUE" to 195.0,
        "DEFESA" to 229.0,
        "ATAQUE_ESPECIAL" to 199.0,
        "DEFESA_ESPECIAL" to 227.0,
        "VELOCIDADE" to 203.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO"),
        4 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL")
    )
)

val wartortle: Map<String, Any> = mapOf(
    "NOME" to "Wartortle",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 322.0,
        "ATAQUE" to 225.0,
        "DEFESA" to 259.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 259.0,
        "VELOCIDADE" to 236.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Pulso d'Água", 60, "ÁGUA", "ESPECIAL"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO"),
        4 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL")
    )
)

val blastoise: Map<String, Any> = mapOf(
    "NOME" to "Blastoise",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 362.0,
        "ATAQUE" to 265.0,
        "DEFESA" to 299.0,
        "ATAQUE_ESPECIAL" to 269.0,
        "DEFESA_ESPECIAL" to 309.0,
        "VELOCIDADE" to 280.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Pulso Sombrio", 80, "SOMBRIO", "ESPECIAL")
    )
)

val caterpie: Map<String, Any> = mapOf(
    "NOME" to "Caterpie",
    "TIPOS" to listOf("INSETO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 294.0,
        "ATAQUE" to 158.0,
        "DEFESA" to 168.0,
        "ATAQUE_ESPECIAL" to 138.0,
        "DEFESA_ESPECIAL" to 138.0,
        "VELOCIDADE" to 207.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Picada", 60, "INSETO", "FÍSICO"),
        3 to listOf("Eletroteia", 55, "ELÉTRICO", "ESPECIAL")
    )
)

val metapod: Map<String, Any> = mapOf(
    "NOME" to "Metapod",
    "TIPOS" to listOf("INSETO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 138.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 148.0,
        "DEFESA_ESPECIAL" to 148.0,
        "VELOCIDADE" to 174.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Eletroteia", 55, "ELÉTRICO", "ESPECIAL")
    )
)

val butterfree: Map<String, Any> = mapOf(
    "NOME" to "Butterfree",
    "TIPOS" to listOf("INSETO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "INSETO", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "ELÉTRICO", "GELO", "VOADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 198.0,
        "ATAQUE_ESPECIAL" to 258.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bola de Energia", 90, "GRAMA", "ESPECIAL"),
        2 to listOf("Golpe de Ar", 75, "VOADOR", "ESPECIAL"),
        3 to listOf("Zumbido", 90, "INSETO", "ESPECIAL"),
        4 to listOf("Rajada Psíquica", 65, "PSÍQUICO", "ESPECIAL")
    )
)

val weedle: Map<String, Any> = mapOf(
    "NOME" to "Weedle",
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 168.0,
        "DEFESA" to 158.0,
        "ATAQUE_ESPECIAL" to 138.0,
        "DEFESA_ESPECIAL" to 138.0,
        "VELOCIDADE" to 218.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ferrão Venenoso", 15, "VENENO", "FÍSICO"),
        2 to listOf("Picada", 60, "INSETO", "FÍSICO")
    )
)

val kakuna: Map<String, Any> = mapOf(
    "NOME" to "Kakuna",
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 294.0,
        "ATAQUE" to 148.0,
        "DEFESA" to 198.0,
        "ATAQUE_ESPECIAL" to 148.0,
        "DEFESA_ESPECIAL" to 148.0,
        "VELOCIDADE" to 185.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Endurecer", 0, "NORMAL", "STATUS")
    )
)

val beedrill: Map<String, Any> = mapOf(
    "NOME" to "Beedrill",
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 178.0,
        "ATAQUE_ESPECIAL" to 188.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 273.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ferrão Venenoso", 15, "VENENO", "FÍSICO"),
        2 to listOf("Agulha Dupla", 25, "INSETO", "FÍSICO"),
        3 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        4 to listOf("Picada Mortal", 70, "INSETO", "FÍSICO")
    )
)

val pidgey: Map<String, Any> = mapOf(
    "NOME" to "Pidgey",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 178.0,
        "ATAQUE_ESPECIAL" to 168.0,
        "DEFESA_ESPECIAL" to 168.0,
        "VELOCIDADE" to 243.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rajada de Vento", 40, "VOADOR", "ESPECIAL"),
        3 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val pidgeotto: Map<String, Any> = mapOf(
    "NOME" to "Pidgeotto",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 330.0,
        "ATAQUE" to 218.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 266.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rajada de Vento", 40, "VOADOR", "ESPECIAL"),
        3 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val pidgeot: Map<String, Any> = mapOf(
    "NOME" to "Pidgeot",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 366.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 248.0,
        "ATAQUE_ESPECIAL" to 238.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 312.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Rajada de Vento", 40, "VOADOR", "ESPECIAL"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Ataque Aéreo", 100, "VOADOR", "FÍSICO")
    )
)

val rattata: Map<String, Any> = mapOf(
    "NOME" to "Rattata",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 212.0,
        "DEFESA" to 168.0,
        "ATAQUE_ESPECIAL" to 148.0,
        "DEFESA_ESPECIAL" to 148.0,
        "VELOCIDADE" to 269.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Presa", 80, "NORMAL", "FÍSICO")
    )
)

val raticate: Map<String, Any> = mapOf(
    "NOME" to "Raticate",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 262.0,
        "DEFESA" to 218.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 322.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Presa", 80, "NORMAL", "FÍSICO")
    )
)

val spearow: Map<String, Any> = mapOf(
    "NOME" to "Spearow",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 218.0,
        "DEFESA" to 158.0,
        "ATAQUE_ESPECIAL" to 162.0,
        "DEFESA_ESPECIAL" to 162.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bicada", 35, "VOADOR", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Perfuração", 80, "VOADOR", "FÍSICO")
    )
)

val fearow: Map<String, Any> = mapOf(
    "NOME" to "Fearow",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 278.0,
        "DEFESA" to 228.0,
        "ATAQUE_ESPECIAL" to 222.0,
        "DEFESA_ESPECIAL" to 222.0,
        "VELOCIDADE" to 328.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bicada", 35, "VOADOR", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Perfuração", 80, "VOADOR", "FÍSICO")
    )
)

val ekans: Map<String, Any> = mapOf(
    "NOME" to "Ekans",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 218.0,
        "DEFESA" to 188.0,
        "ATAQUE_ESPECIAL" to 178.0,
        "DEFESA_ESPECIAL" to 178.0,
        "VELOCIDADE" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        2 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Bomba de Lodo", 90, "VENENO", "ESPECIAL")
    )
)

val arbok: Map<String, Any> = mapOf(
    "NOME" to "Arbok",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 268.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 228.0,
        "DEFESA_ESPECIAL" to 256.0,
        "VELOCIDADE" to 284.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        2 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Bomba de Lodo", 90, "VENENO", "ESPECIAL")
    )
)

val pikachu: Map<String, Any> = mapOf(
    "NOME" to "Pikachu",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "AÇO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 208.0,
        "DEFESA" to 174.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 90, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Cauda de Ferro", 100, "AÇO", "FÍSICO"),
        4 to listOf("Soco do Trovão", 75, "ELÉTRICO", "FÍSICO")
    )
)

val raichu: Map<String, Any> = mapOf(
    "NOME" to "Raichu",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "AÇO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 278.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 278.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 350.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 90, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Cauda de Ferro", 100, "AÇO", "FÍSICO"),
        4 to listOf("Soco do Trovão", 75, "ELÉTRICO", "FÍSICO")
    )
)

val sandshrew: Map<String, Any> = mapOf(
    "NOME" to "Sandshrew",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 248.0,
        "DEFESA" to 268.0,
        "ATAQUE_ESPECIAL" to 158.0,
        "DEFESA_ESPECIAL" to 178.0,
        "VELOCIDADE" to 196.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Cavar", 80, "TERRA", "FÍSICO"),
        2 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Arranhão", 40, "NORMAL", "FÍSICO")
    )
)

val sandslash: Map<String, Any> = mapOf(
    "NOME" to "Sandslash",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 354.0,
        "ATAQUE" to 298.0,
        "DEFESA" to 318.0,
        "ATAQUE_ESPECIAL" to 188.0,
        "DEFESA_ESPECIAL" to 208.0,
        "VELOCIDADE" to 251.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Cavar", 80, "TERRA", "FÍSICO"),
        2 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Arranhão", 40, "NORMAL", "FÍSICO")
    )
)

val nidoran_f: Map<String, Any> = mapOf(
    "NOME" to "Nidoran♀",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 194.0,
        "DEFESA" to 204.0,
        "ATAQUE_ESPECIAL" to 174.0,
        "DEFESA_ESPECIAL" to 174.0,
        "VELOCIDADE" to 202.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Chifre Venenoso", 25, "VENENO", "FÍSICO"),
        4 to listOf("Arranhão", 40, "NORMAL", "FÍSICO")
    )
)

val nidorina: Map<String, Any> = mapOf(
    "NOME" to "Nidorina",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 224.0,
        "DEFESA" to 234.0,
        "ATAQUE_ESPECIAL" to 204.0,
        "DEFESA_ESPECIAL" to 204.0,
        "VELOCIDADE" to 232.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Chifre Venenoso", 25, "VENENO", "FÍSICO"),
        4 to listOf("Corte", 70, "NORMAL", "FÍSICO")
    )
)

val nidoqueen: Map<String, Any> = mapOf(
    "NOME" to "Nidoqueen",
    "TIPOS" to listOf("VENENO", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA", "LUTADOR", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 274.0,
        "DEFESA" to 284.0,
        "ATAQUE_ESPECIAL" to 248.0,
        "DEFESA_ESPECIAL" to 268.0,
        "VELOCIDADE" to 280.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        3 to listOf("Soco Trovão", 75, "ELÉTRICO", "FÍSICO"),
        4 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO")
    )
)

val nidoran_m: Map<String, Any> = mapOf(
    "NOME" to "Nidoran♂",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 294.0,
        "ATAQUE" to 214.0,
        "DEFESA" to 184.0,
        "ATAQUE_ESPECIAL" to 174.0,
        "DEFESA_ESPECIAL" to 174.0,
        "VELOCIDADE" to 218.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        2 to listOf("Chifre Venenoso", 25, "VENENO", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Chifre de Ataque", 65, "NORMAL", "FÍSICO")
    )
)

val nidorino: Map<String, Any> = mapOf(
    "NOME" to "Nidorino",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 244.0,
        "DEFESA" to 214.0,
        "ATAQUE_ESPECIAL" to 204.0,
        "DEFESA_ESPECIAL" to 204.0,
        "VELOCIDADE" to 251.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        2 to listOf("Chifre Venenoso", 25, "VENENO", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Chifre de Ataque", 65, "NORMAL", "FÍSICO")
    )
)

val nidoking: Map<String, Any> = mapOf(
    "NOME" to "Nidoking",
    "TIPOS" to listOf("VENENO", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA", "LUTADOR", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 294.0,
        "DEFESA" to 254.0,
        "ATAQUE_ESPECIAL" to 268.0,
        "DEFESA_ESPECIAL" to 248.0,
        "VELOCIDADE" to 295.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        3 to listOf("Soco Trovão", 75, "ELÉTRICO", "FÍSICO"),
        4 to listOf("Chifre de Ataque", 65, "NORMAL", "FÍSICO")
    )
)

val clefairy: Map<String, Any> = mapOf(
    "NOME" to "Clefairy",
    "TIPOS" to listOf("FADA"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "INSETO", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VENENO", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 194.0,
        "ATAQUE_ESPECIAL" to 218.0,
        "DEFESA_ESPECIAL" to 228.0,
        "VELOCIDADE" to 185.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brilho Encantador", 80, "FADA", "ESPECIAL"),
        2 to listOf("Soco Meteoro", 70, "AÇO", "FÍSICO"),
        3 to listOf("Explosão Lunar", 95, "FADA", "ESPECIAL"),
        4 to listOf("Tapinha Duplo", 15, "FADA", "FÍSICO")
    )
)

val clefable: Map<String, Any> = mapOf(
    "NOME" to "Clefable",
    "TIPOS" to listOf("FADA"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "INSETO", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VENENO", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 394.0,
        "ATAQUE" to 238.0,
        "DEFESA" to 244.0,
        "ATAQUE_ESPECIAL" to 288.0,
        "DEFESA_ESPECIAL" to 278.0,
        "VELOCIDADE" to 240.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brilho Encantador", 80, "FADA", "ESPECIAL"),
        2 to listOf("Soco Meteoro", 70, "AÇO", "FÍSICO"),
        3 to listOf("Raio Lunar", 95, "FADA", "ESPECIAL"),
        4 to listOf("Soco Trovão", 75, "ELÉTRICO", "FÍSICO")
    )
)

val vulpix: Map<String, Any> = mapOf(
    "NOME" to "Vulpix",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "PEDRA", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 280.0,
        "ATAQUE" to 180.0,
        "DEFESA" to 176.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 228.0,
        "VELOCIDADE" to 251.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        4 to listOf("Chama Explosiva", 110, "FOGO", "ESPECIAL")
    )
)

val ninetales: Map<String, Any> = mapOf(
    "NOME" to "Ninetales",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "PEDRA", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 350.0,
        "ATAQUE" to 250.0,
        "DEFESA" to 248.0,
        "ATAQUE_ESPECIAL" to 268.0,
        "DEFESA_ESPECIAL" to 298.0,
        "VELOCIDADE" to 328.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        4 to listOf("Chama Explosiva", 110, "FOGO", "ESPECIAL")
    )
)

val jigglypuff: Map<String, Any> = mapOf(
    "NOME" to "Jigglypuff",
    "TIPOS" to listOf("NORMAL", "FADA"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "LUTADOR", "INSETO", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VENENO", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 434.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 138.0,
        "ATAQUE_ESPECIAL" to 188.0,
        "DEFESA_ESPECIAL" to 148.0,
        "VELOCIDADE" to 138.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brilho Encantador", 80, "FADA", "ESPECIAL"),
        2 to listOf("Hiper Voz", 90, "NORMAL", "ESPECIAL"),
        3 to listOf("Tapinha Duplo", 15, "FADA", "FÍSICO"),
        4 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO")
    )
)

val wigglytuff: Map<String, Any> = mapOf(
    "NOME" to "Wigglytuff",
    "TIPOS" to listOf("NORMAL", "FADA"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "LUTADOR", "INSETO", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VENENO", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 484.0,
        "ATAQUE" to 238.0,
        "DEFESA" to 188.0,
        "ATAQUE_ESPECIAL" to 248.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 188.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brilho Encantador", 80, "FADA", "ESPECIAL"),
        2 to listOf("Hiper Voz", 90, "NORMAL", "ESPECIAL"),
        3 to listOf("Tapinha Duplo", 15, "FADA", "FÍSICO"),
        4 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO")
    )
)

val zubat: Map<String, Any> = mapOf(
    "NOME" to "Zubat",
    "TIPOS" to listOf("VENENO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 168.0,
        "ATAQUE_ESPECIAL" to 158.0,
        "DEFESA_ESPECIAL" to 178.0,
        "VELOCIDADE" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Chupar Sangue", 80, "INSETO", "FÍSICO"),
        4 to listOf("Ácido", 40, "VENENO", "ESPECIAL")
    )
)

val golbat: Map<String, Any> = mapOf(
    "NOME" to "Golbat",
    "TIPOS" to listOf("VENENO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 354.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 228.0,
        "DEFESA_ESPECIAL" to 248.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Chupar Sangue", 80, "INSETO", "FÍSICO"),
        4 to listOf("Ácido", 40, "VENENO", "ESPECIAL")
    )
)

val oddish: Map<String, Any> = mapOf(
    "NOME" to "Oddish",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GRAMA", "ELÉTRICO", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 294.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 248.0,
        "DEFESA_ESPECIAL" to 228.0,
        "VELOCIDADE" to 174.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Dança de Pétalas", 120, "GRAMA", "ESPECIAL"),
        4 to listOf("Bomba de Semente", 80, "GRAMA", "FÍSICO")
    )
)

val gloom: Map<String, Any> = mapOf(
    "NOME" to "Gloom",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GRAMA", "ELÉTRICO", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 218.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 268.0,
        "DEFESA_ESPECIAL" to 248.0,
        "VELOCIDADE" to 196.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Dança de Pétalas", 120, "GRAMA", "ESPECIAL"),
        4 to listOf("Bomba de Semente", 80, "GRAMA", "FÍSICO")
    )
)

val vileplume: Map<String, Any> = mapOf(
    "NOME" to "Vileplume",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GRAMA", "ELÉTRICO", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 354.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 268.0,
        "ATAQUE_ESPECIAL" to 318.0,
        "DEFESA_ESPECIAL" to 278.0,
        "VELOCIDADE" to 218.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        2 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL"),
        3 to listOf("Chuva de Pétalas", 90, "GRAMA", "FÍSICO"),
        4 to listOf("Bomba de Semente", 80, "GRAMA", "FÍSICO")
    )
)

val paras: Map<String, Any> = mapOf(
    "NOME" to "Paras",
    "TIPOS" to listOf("INSETO", "GRAMA"),
    "RESISTÊNCIAS" to listOf("GRAMA", "TERRA", "ÁGUA", "ELÉTRICO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PEDRA", "GELO", "VENENO"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 238.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 188.0,
        "DEFESA_ESPECIAL" to 208.0,
        "VELOCIDADE" to 148.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        2 to listOf("Bomba de Semente", 80, "GRAMA", "FÍSICO"),
        3 to listOf("Chupar Sangue", 80, "INSETO", "FÍSICO"),
        4 to listOf("Bola de Energia", 90, "GRAMA", "ESPECIAL")
    )
)

val parasect: Map<String, Any> = mapOf(
    "NOME" to "Parasect",
    "TIPOS" to listOf("INSETO", "GRAMA"),
    "RESISTÊNCIAS" to listOf("GRAMA", "TERRA", "ÁGUA", "ELÉTRICO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PEDRA", "GELO", "VENENO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 288.0,
        "DEFESA" to 258.0,
        "ATAQUE_ESPECIAL" to 218.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 174.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        2 to listOf("Bomba de Semente", 80, "GRAMA", "FÍSICO"),
        3 to listOf("Chupar Sangue", 80, "INSETO", "FÍSICO"),
        4 to listOf("Bola de Energia", 90, "GRAMA", "ESPECIAL")
    )
)

val venonat: Map<String, Any> = mapOf(
    "NOME" to "Venonat",
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 208.0,
        "DEFESA" to 198.0,
        "ATAQUE_ESPECIAL" to 178.0,
        "DEFESA_ESPECIAL" to 208.0,
        "VELOCIDADE" to 207.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Zumbido", 90, "INSETO", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Bomba de Lodo", 90, "VENENO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val venomoth: Map<String, Any> = mapOf(
    "NOME" to "Venomoth",
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 228.0,
        "DEFESA" to 218.0,
        "ATAQUE_ESPECIAL" to 278.0,
        "DEFESA_ESPECIAL" to 248.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Zumbido", 90, "INSETO", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Bomba de Lodo", 90, "VENENO", "ESPECIAL"),
        4 to listOf("Rajada Psíquica", 65, "PSÍQUICO", "ESPECIAL")
    )
)

val diglett: Map<String, Any> = mapOf(
    "NOME" to "Diglett",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 224.0,
        "ATAQUE" to 208.0,
        "DEFESA" to 148.0,
        "ATAQUE_ESPECIAL" to 168.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 317.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Cavar", 80, "TERRA", "FÍSICO"),
        2 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Arranhão", 40, "NORMAL", "FÍSICO")
    )
)

val dugtrio: Map<String, Any> = mapOf(
    "NOME" to "Dugtrio",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 198.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 372.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Cavar", 80, "TERRA", "FÍSICO"),
        2 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Arranhão", 40, "NORMAL", "FÍSICO")
    )
)

val meowth: Map<String, Any> = mapOf(
    "NOME" to "Meowth",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 168.0,
        "ATAQUE_ESPECIAL" to 178.0,
        "DEFESA_ESPECIAL" to 178.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val persian: Map<String, Any> = mapOf(
    "NOME" to "Persian",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 238.0,
        "DEFESA" to 218.0,
        "ATAQUE_ESPECIAL" to 228.0,
        "DEFESA_ESPECIAL" to 228.0,
        "VELOCIDADE" to 361.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val psyduck: Map<String, Any> = mapOf(
    "NOME" to "Psyduck",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 202.0,
        "DEFESA" to 194.0,
        "ATAQUE_ESPECIAL" to 228.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO")
    )
)

val golduck: Map<String, Any> = mapOf(
    "NOME" to "Golduck",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 262.0,
        "DEFESA" to 254.0,
        "ATAQUE_ESPECIAL" to 288.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 295.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO")
    )
)

val mankey: Map<String, Any> = mapOf(
    "NOME" to "Mankey",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 168.0,
        "ATAQUE_ESPECIAL" to 168.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Chute Baixo", 60, "LUTADOR", "FÍSICO"),
        3 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 70, "NORMAL", "FÍSICO")
    )
)

val primeape: Map<String, Any> = mapOf(
    "NOME" to "Primeape",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 308.0,
        "DEFESA" to 218.0,
        "ATAQUE_ESPECIAL" to 218.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 317.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Chute Baixo", 60, "LUTADOR", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 70, "NORMAL", "FÍSICO")
    )
)

val growlithe: Map<String, Any> = mapOf(
    "NOME" to "Growlithe",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "PEDRA", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 238.0,
        "DEFESA" to 188.0,
        "ATAQUE_ESPECIAL" to 238.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 240.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Presas de Fogo", 65, "FOGO", "FÍSICO"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val arcanine: Map<String, Any> = mapOf(
    "NOME" to "Arcanine",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "PEDRA", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 318.0,
        "DEFESA" to 258.0,
        "ATAQUE_ESPECIAL" to 298.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 317.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Presas de Fogo", 65, "FOGO", "FÍSICO"),
        4 to listOf("Chama Explosiva", 110, "FOGO", "ESPECIAL")
    )
)

val poliwag: Map<String, Any> = mapOf(
    "NOME" to "Poliwag",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 198.0,
        "DEFESA" to 178.0,
        "ATAQUE_ESPECIAL" to 178.0,
        "DEFESA_ESPECIAL" to 178.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Bolha", 40, "ÁGUA", "ESPECIAL"),
        3 to listOf("Tapinha Duplo", 15, "FADA", "FÍSICO"),
        4 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO")
    )
)

val poliwhirl: Map<String, Any> = mapOf(
    "NOME" to "Poliwhirl",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 228.0,
        "DEFESA" to 228.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        3 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO"),
        4 to listOf("Bolha", 40, "ÁGUA", "ESPECIAL")
    )
)

val poliwrath: Map<String, Any> = mapOf(
    "NOME" to "Poliwrath",
    "TIPOS" to listOf("ÁGUA", "LUTADOR"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO", "INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 288.0,
        "DEFESA" to 288.0,
        "ATAQUE_ESPECIAL" to 238.0,
        "DEFESA_ESPECIAL" to 278.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        3 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO"),
        4 to listOf("Chute Baixo", 60, "LUTADOR", "FÍSICO")
    )
)

val abra: Map<String, Any> = mapOf(
    "NOME" to "Abra",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 254.0,
        "ATAQUE" to 138.0,
        "DEFESA" to 148.0,
        "ATAQUE_ESPECIAL" to 308.0,
        "DEFESA_ESPECIAL" to 208.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Soco Trovoada", 75, "ELÉTRICO", "FÍSICO"),
        4 to listOf("Bola Sombria",80,"FANTASMA","ESPECIAL")
    )
)

val kadabra: Map<String, Any> = mapOf(
    "NOME" to "Kadabra",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 168.0,
        "DEFESA" to 178.0,
        "ATAQUE_ESPECIAL" to 338.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 339.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio de Sinal", 75, "INSETO", "ESPECIAL"),
        4 to listOf("Visão do Futuro", 120, "PSÍQUICO", "ESPECIAL")
    )
)

val alakazam: Map<String, Any> = mapOf(
    "NOME" to "Alakazam",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 198.0,
        "DEFESA" to 188.0,
        "ATAQUE_ESPECIAL" to 368.0,
        "DEFESA_ESPECIAL" to 288.0,
        "VELOCIDADE" to 372.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio de Sinal", 75, "INSETO", "ESPECIAL"),
        4 to listOf("Pulso Sombrio", 80, "SOMBRIO", "ESPECIAL")
    )
)

val machop: Map<String, Any> = mapOf(
    "NOME" to "Machop",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 198.0,
        "ATAQUE_ESPECIAL" to 168.0,
        "DEFESA_ESPECIAL" to 168.0,
        "VELOCIDADE" to 185.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Chute Baixo", 60, "LUTADOR", "FÍSICO"),
        3 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        4 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO")
    )
)

val machoke: Map<String, Any> = mapOf(
    "NOME" to "Machoke",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 298.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 218.0,
        "VELOCIDADE" to 207.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Chute Baixo", 60, "LUTADOR", "FÍSICO"),
        3 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        4 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO")
    )
)

val machamp: Map<String, Any> = mapOf(
    "NOME" to "Machamp",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 358.0,
        "DEFESA" to 258.0,
        "ATAQUE_ESPECIAL" to 228.0,
        "DEFESA_ESPECIAL" to 268.0,
        "VELOCIDADE" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Chute Baixo", 60, "LUTADOR", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO")
    )
)

val bellsprout: Map<String, Any> = mapOf(
    "NOME" to "Bellsprout",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GRAMA", "ELÉTRICO", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 248.0,
        "DEFESA" to 168.0,
        "ATAQUE_ESPECIAL" to 238.0,
        "DEFESA_ESPECIAL" to 158.0,
        "VELOCIDADE" to 196.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Chicote de Vinha", 45, "GRAMA", "FÍSICO"),
        4 to listOf("Chicote Poderoso", 120, "GRAMA", "FÍSICO")
    )
)

val weepinbell: Map<String, Any> = mapOf(
    "NOME" to "Weepinbell",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GRAMA", "ELÉTRICO", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 278.0,
        "DEFESA" to 198.0,
        "ATAQUE_ESPECIAL" to 268.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Chicote de Vinha", 45, "GRAMA", "FÍSICO"),
        4 to listOf("Chicote Poderoso", 120, "GRAMA", "FÍSICO")
    )
)

val victreebel: Map<String, Any> = mapOf(
    "NOME" to "Victreebel",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GRAMA", "ELÉTRICO", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 308.0,
        "DEFESA" to 228.0,
        "ATAQUE_ESPECIAL" to 298.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Chicote de Vinha", 45, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)

val tentacool: Map<String, Any> = mapOf(
    "NOME" to "Tentacool",
    "TIPOS" to listOf("ÁGUA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 178.0,
        "DEFESA" to 168.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 298.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        4 to listOf("Bolha", 40, "ÁGUA", "ESPECIAL")
    )
)

val tentacruel: Map<String, Any> = mapOf(
    "NOME" to "Tentacruel",
    "TIPOS" to listOf("ÁGUA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 238.0,
        "DEFESA" to 228.0,
        "ATAQUE_ESPECIAL" to 258.0,
        "DEFESA_ESPECIAL" to 338.0,
        "VELOCIDADE" to 328.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        4 to listOf("Pulso d'Água", 60, "ÁGUA", "ESPECIAL")
    )
)

val geodude: Map<String, Any> = mapOf(
    "NOME" to "Geodude",
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VOADOR", "NORMAL", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 298.0,
        "ATAQUE_ESPECIAL" to 158.0,
        "DEFESA_ESPECIAL" to 158.0,
        "VELOCIDADE" to 138.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Rolo Compressor", 30, "TERRA", "FÍSICO"),
        3 to listOf("Explosão de Rocha", 25, "PEDRA", "FÍSICO"),
        4 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO")
    )
)

val graveler: Map<String, Any> = mapOf(
    "NOME" to "Graveler",
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VOADOR", "NORMAL", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 288.0,
        "DEFESA" to 328.0,
        "ATAQUE_ESPECIAL" to 188.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 185.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Rolo Compressor", 30, "TERRA", "FÍSICO"),
        3 to listOf("Explosão de Rocha", 25, "PEDRA", "FÍSICO"),
        4 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO")
    )
)

val golem: Map<String, Any> = mapOf(
    "NOME" to "Golem",
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VOADOR", "NORMAL", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 318.0,
        "DEFESA" to 358.0,
        "ATAQUE_ESPECIAL" to 208.0,
        "DEFESA_ESPECIAL" to 228.0,
        "VELOCIDADE" to 207.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Rolo Compressor", 30, "TERRA", "FÍSICO"),
        3 to listOf("Explosão de Rocha", 25, "PEDRA", "FÍSICO"),
        4 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO")
    )
)

val ponyta: Map<String, Any> = mapOf(
    "NOME" to "Ponyta",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "PEDRA", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 268.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 228.0,
        "DEFESA_ESPECIAL" to 228.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Pisoteada", 65, "NORMAL", "FÍSICO"),
        3 to listOf("Presas de Fogo", 65, "FOGO", "FÍSICO"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val rapidash: Map<String, Any> = mapOf(
    "NOME" to "Rapidash",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "PEDRA", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 298.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 258.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 339.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Pisoteada", 65, "NORMAL", "FÍSICO"),
        3 to listOf("Presas de Fogo", 65, "FOGO", "FÍSICO"),
        4 to listOf("Chama Explosiva", 110, "FOGO", "ESPECIAL")
    )
)

val slowpoke: Map<String, Any> = mapOf(
    "NOME" to "Slowpoke",
    "TIPOS" to listOf("ÁGUA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO", "LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 228.0,
        "DEFESA" to 228.0,
        "ATAQUE_ESPECIAL" to 178.0,
        "DEFESA_ESPECIAL" to 178.0,
        "VELOCIDADE" to 129.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO")
    )
)

val slowbro: Map<String, Any> = mapOf(
    "NOME" to "Slowbro",
    "TIPOS" to listOf("ÁGUA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO", "LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 394.0,
        "ATAQUE" to 248.0,
        "DEFESA" to 318.0,
        "ATAQUE_ESPECIAL" to 298.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 174.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO")
    )
)
val magnemite: Map<String, Any> = mapOf(
    "NOME" to "Magnemite",
    "TIPOS" to listOf("ELÉTRICO", "AÇO"),
    "RESISTÊNCIAS" to listOf("NORMAL", "GRAMA", "GELO", "VOADOR", "PSÍQUICO", "INSETO", "PEDRA", "DRAGÃO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "LUTADOR", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 254.0,
        "ATAQUE" to 168.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 288.0,
        "DEFESA_ESPECIAL" to 208.0,
        "VELOCIDADE" to 207.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 90, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Raio", 40, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Soco Trovão", 75, "ELÉTRICO", "FÍSICO"),
        4 to listOf("Explosão de Faísca", 65, "ELÉTRICO", "ESPECIAL")
    )
)

val magneton: Map<String, Any> = mapOf(
    "NOME" to "Magneton",
    "TIPOS" to listOf("ELÉTRICO", "AÇO"),
    "RESISTÊNCIAS" to listOf("NORMAL", "GRAMA", "GELO", "VOADOR", "PSÍQUICO", "INSETO", "PEDRA", "DRAGÃO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "LUTADOR", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 218.0,
        "DEFESA" to 288.0,
        "ATAQUE_ESPECIAL" to 338.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 90, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Raio", 40, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Soco Trovão", 75, "ELÉTRICO", "FÍSICO"),
        4 to listOf("Explosão de Faísca", 65, "ELÉTRICO", "ESPECIAL")
    )
)

val farfetchd: Map<String, Any> = mapOf(
    "NOME" to "Farfetch'd",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("GRAMA", "INSETO", "FANTASMA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 308.0,
        "ATAQUE" to 248.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 214.0,
        "DEFESA_ESPECIAL" to 224.0,
        "VELOCIDADE" to 240.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Golpe Aéreo", 60, "VOADOR", "FÍSICO"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val doduo: Map<String, Any> = mapOf(
    "NOME" to "Doduo",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("GRAMA", "INSETO", "FANTASMA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 268.0,
        "DEFESA" to 188.0,
        "ATAQUE_ESPECIAL" to 168.0,
        "DEFESA_ESPECIAL" to 168.0,
        "VELOCIDADE" to 273.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bicada", 35, "VOADOR", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Perfuração", 80, "VOADOR", "FÍSICO")
    )
)

val dodrio: Map<String, Any> = mapOf(
    "NOME" to "Dodrio",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("GRAMA", "INSETO", "FANTASMA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 318.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 218.0,
        "DEFESA_ESPECIAL" to 218.0,
        "VELOCIDADE" to 328.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bicada", 35, "VOADOR", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Perfuração", 80, "VOADOR", "FÍSICO")
    )
)

val seel: Map<String, Any> = mapOf(
    "NOME" to "Seel",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 188.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 207.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        3 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO"),
        4 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO")
    )
)

val dewgong: Map<String, Any> = mapOf(
    "NOME" to "Dewgong",
    "TIPOS" to listOf("ÁGUA", "GELO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GELO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 238.0,
        "DEFESA" to 258.0,
        "ATAQUE_ESPECIAL" to 238.0,
        "DEFESA_ESPECIAL" to 288.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        3 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO"),
        4 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO")
    )
)

val grimer: Map<String, Any> = mapOf(
    "NOME" to "Grimer",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 198.0,
        "ATAQUE_ESPECIAL" to 178.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 148.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        3 to listOf("Bomba de Lama", 90, "VENENO", "ESPECIAL"),
        4 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO")
    )
)

val muk: Map<String, Any> = mapOf(
    "NOME" to "Muk",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 414.0,
        "ATAQUE" to 308.0,
        "DEFESA" to 248.0,
        "ATAQUE_ESPECIAL" to 228.0,
        "DEFESA_ESPECIAL" to 298.0,
        "VELOCIDADE" to 218.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        3 to listOf("Bomba de Lama", 90, "VENENO", "ESPECIAL"),
        4 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO")
    )
)

val shellder: Map<String, Any> = mapOf(
    "NOME" to "Shellder",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 228.0,
        "DEFESA" to 298.0,
        "ATAQUE_ESPECIAL" to 188.0,
        "DEFESA_ESPECIAL" to 148.0,
        "VELOCIDADE" to 196.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        3 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO"),
        4 to listOf("Explosão de Gelo", 40, "GELO", "FÍSICO")
    )
)

val cloyster: Map<String, Any> = mapOf(
    "NOME" to "Cloyster",
    "TIPOS" to listOf("ÁGUA", "GELO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GELO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 288.0,
        "DEFESA" to 458.0,
        "ATAQUE_ESPECIAL" to 268.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        3 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO"),
        4 to listOf("Explosão de Gelo", 40, "GELO", "FÍSICO")
    )
)

val gastly: Map<String, Any> = mapOf(
    "NOME" to "Gastly",
    "TIPOS" to listOf("FANTASMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA", "NORMAL"),
    "DESVANTAGENS" to listOf("PSÍQUICO", "SOMBRIO", "FANTASMA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 168.0,
        "DEFESA" to 158.0,
        "ATAQUE_ESPECIAL" to 298.0,
        "DEFESA_ESPECIAL" to 168.0,
        "VELOCIDADE" to 284.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bola Sombria", 80, "FANTASMA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Pulso Sombrio", 80, "SOMBRIO", "ESPECIAL"),
        4 to listOf("Língua Venenosa", 60, "FANTASMA", "FÍSICO")
    )
)

val haunter: Map<String, Any> = mapOf(
    "NOME" to "Haunter",
    "TIPOS" to listOf("FANTASMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA", "NORMAL"),
    "DESVANTAGENS" to listOf("PSÍQUICO", "SOMBRIO", "FANTASMA"),
    "STATUS" to mapOf(
        "VIDA" to 294.0,
        "ATAQUE" to 198.0,
        "DEFESA" to 188.0,
        "ATAQUE_ESPECIAL" to 328.0,
        "DEFESA_ESPECIAL" to 208.0,
        "VELOCIDADE" to 317.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bola Sombria", 80, "FANTASMA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Pulso Sombrio", 80, "SOMBRIO", "ESPECIAL"),
        4 to listOf("Língua Venenosa", 60, "FANTASMA", "FÍSICO")
    )
)

val gengar: Map<String, Any> = mapOf(
    "NOME" to "Gengar",
    "TIPOS" to listOf("FANTASMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA", "NORMAL"),
    "DESVANTAGENS" to listOf("PSÍQUICO", "SOMBRIO", "FANTASMA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 228.0,
        "DEFESA" to 218.0,
        "ATAQUE_ESPECIAL" to 358.0,
        "DEFESA_ESPECIAL" to 248.0,
        "VELOCIDADE" to 350.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bola Sombria", 80, "FANTASMA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Pulso Sombrio", 80, "SOMBRIO", "ESPECIAL"),
        4 to listOf("Língua Venenosa", 60, "FANTASMA", "FÍSICO")
    )
)

val onix: Map<String, Any> = mapOf(
    "NOME" to "Onix",
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VOADOR", "NORMAL", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 418.0,
        "ATAQUE_ESPECIAL" to 158.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO"),
        3 to listOf("Rolo Compressor", 30, "TERRA", "FÍSICO"),
        4 to listOf("Explosão de Rocha", 25, "PEDRA", "FÍSICO")
    )
)

val drowzee: Map<String, Any> = mapOf(
    "NOME" to "Drowzee",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 194.0,
        "DEFESA" to 178.0,
        "ATAQUE_ESPECIAL" to 178.0,
        "DEFESA_ESPECIAL" to 278.0,
        "VELOCIDADE" to 204.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO"),
        4 to listOf("Soco de Gelo", 75, "GELO", "FÍSICO")
    )
)

val hypno: Map<String, Any> = mapOf(
    "NOME" to "Hypno",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 374.0,
        "ATAQUE" to 244.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 238.0,
        "DEFESA_ESPECIAL" to 328.0,
        "VELOCIDADE" to 250.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO"),
        4 to listOf("Soco de Gelo", 75, "GELO", "FÍSICO")
    )
)

val krabby: Map<String, Any> = mapOf(
    "NOME" to "Krabby",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 308.0,
        "DEFESA" to 258.0,
        "ATAQUE_ESPECIAL" to 148.0,
        "DEFESA_ESPECIAL" to 148.0,
        "VELOCIDADE" to 218.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Garra de Metal", 50, "AÇO", "FÍSICO"),
        3 to listOf("Martelo Caranguejo", 100, "ÁGUA", "FÍSICO"),
        4 to listOf("Bolha", 40, "ÁGUA", "ESPECIAL")
    )
)

val kingler: Map<String, Any> = mapOf(
    "NOME" to "Kingler",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATA Tune" to 358.0,
        "DEFESA" to 328.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 273.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Garra de Metal", 50, "AÇO", "FÍSICO"),
        3 to listOf("Martelo Caranguejo", 100, "ÁGUA", "FÍSICO"),
        4 to listOf("Bolha", 40, "ÁGUA", "ESPECIAL")
    )
)

val voltorb: Map<String, Any> = mapOf(
    "NOME" to "Voltorb",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "AÇO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 158.0,
        "DEFESA" to 198.0,
        "ATAQUE_ESPECIAL" to 208.0,
        "DEFESA_ESPECIAL" to 208.0,
        "VELOCIDADE" to 328.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 90, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Explosão de Faísca", 65, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Raio", 40, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Autodestruição", 200, "NORMAL", "FÍSICO")
    )
)

val electrode: Map<String, Any> = mapOf(
    "NOME" to "Electrode",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "AÇO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 198.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 258.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 416.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 90, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Explosão de Faísca", 65, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Raio", 40, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Autodestruição", 200, "NORMAL", "FÍSICO")
    )
)

val exeggcute: Map<String, Any> = mapOf(
    "NOME" to "Exeggcute",
    "TIPOS" to listOf("GRAMA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GRAMA", "ELÉTRICO", "LUTADOR", "TERRA", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "VENENO", "INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 178.0,
        "DEFESA" to 258.0,
        "ATAQUE_ESPECIAL" to 218.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 196.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Bomba de Semente", 80, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)

val exeggutor: Map<String, Any> = mapOf(
    "NOME" to "Exeggutor",
    "TIPOS" to listOf("GRAMA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GRAMA", "ELÉTRICO", "LUTADOR", "TERRA", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "VENENO", "INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 394.0,
        "ATAQUE" to 288.0,
        "DEFESA" to 268.0,
        "ATAQUE_ESPECIAL" to 348.0,
        "DEFESA_ESPECIAL" to 228.0,
        "VELOCIDADE" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Bomba de Semente", 80, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)

val cubone: Map<String, Any> = mapOf(
    "NOME" to "Cubone",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 198.0,
        "DEFESA" to 288.0,
        "ATAQUE_ESPECIAL" to 178.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 185.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Cavar", 80, "TERRA", "FÍSICO"),
        3 to listOf("Osso Bumerangue", 50, "TERRA", "FÍSICO"),
        4 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO")
    )
)

val marowak: Map<String, Any> = mapOf(
    "NOME" to "Marowak",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 318.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 207.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Cavar", 80, "TERRA", "FÍSICO"),
        3 to listOf("Osso Bumerangue", 50, "TERRA", "FÍSICO"),
        4 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO")
    )
)

val hitmonlee: Map<String, Any> = mapOf(
    "NOME" to "Hitmonlee",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 338.0,
        "DEFESA" to 204.0,
        "ATAQUE_ESPECIAL" to 168.0,
        "DEFESA_ESPECIAL" to 318.0,
        "VELOCIDADE" to 292.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Chute Alto", 130, "LUTADOR", "FÍSICO"),
        3 to listOf("Chute Baixo", 60, "LUTADOR", "FÍSICO"),
        4 to listOf("Chute Duplo", 30, "LUTADOR", "FÍSICO")
    )
)

val hitmonchan: Map<String, Any> = mapOf(
    "NOME" to "Hitmonchan",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 308.0,
        "DEFESA" to 256.0,
        "ATAQUE_ESPECIAL" to 168.0,
        "DEFESA_ESPECIAL" to 318.0,
        "VELOCIDADE" to 280.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO"),
        3 to listOf("Soco de Gelo", 75, "GELO", "FÍSICO"),
        4 to listOf("Soco Trovão", 75, "ELÉTRICO", "FÍSICO")
    )
)

val lickitung: Map<String, Any> = mapOf(
    "NOME" to "Lickitung",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 208.0,
        "DEFESA" to 248.0,
        "ATAQUE_ESPECIAL" to 218.0,
        "DEFESA_ESPECIAL" to 248.0,
        "VELOCIDADE" to 174.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Língua Venenosa", 60, "FANTASMA", "FÍSICO"),
        2 to listOf("Pisoteada", 65, "NORMAL", "FÍSICO"),
        3 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        4 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO")
    )
)

val koffing: Map<String, Any> = mapOf(
    "NOME" to "Koffing",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 228.0,
        "DEFESA" to 288.0,
        "ATAQUE_ESPECIAL" to 218.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 185.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Bomba de Lama", 90, "VENENO", "ESPECIAL"),
        3 to listOf("Venochoque", 65, "VENENO", "ESPECIAL"),
        4 to listOf("Autodestruição", 200, "NORMAL", "FÍSICO")
    )
)

val weezing: Map<String, Any> = mapOf(
    "NOME" to "Weezing",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 278.0,
        "DEFESA" to 338.0,
        "ATAQUE_ESPECIAL" to 268.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 240.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Bomba de Lama", 90, "VENENO", "ESPECIAL"),
        3 to listOf("Venochoque", 65, "VENENO", "ESPECIAL"),
        4 to listOf("Autodestruição", 200, "NORMAL", "FÍSICO")
    )
)

val rhyhorn: Map<String, Any> = mapOf(
    "NOME" to "Rhyhorn",
    "TIPOS" to listOf("TERRA", "PEDRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VOADOR", "NORMAL", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 268.0,
        "DEFESA" to 288.0,
        "ATAQUE_ESPECIAL" to 158.0,
        "DEFESA_ESPECIAL" to 158.0,
        "VELOCIDADE" to 148.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO"),
        3 to listOf("Pisoteada", 65, "NORMAL", "FÍSICO"),
        4 to listOf("Chifre de Ataque", 65, "NORMAL", "FÍSICO")
    )
)

val rhydon: Map<String, Any> = mapOf(
    "NOME" to "Rhydon",
    "TIPOS" to listOf("TERRA", "PEDRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VOADOR", "NORMAL", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 414.0,
        "ATAQUE" to 358.0,
        "DEFESA" to 338.0,
        "ATAQUE_ESPECIAL" to 188.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 196.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO"),
        3 to listOf("Pisoteada", 65, "NORMAL", "FÍSICO"),
        4 to listOf("Chifre de Ataque", 65, "NORMAL", "FÍSICO")
    )
)

val chansey: Map<String, Any> = mapOf(
    "NOME" to "Chansey",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 704.0,
        "ATAQUE" to 108.0,
        "DEFESA" to 108.0,
        "ATAQUE_ESPECIAL" to 168.0,
        "DEFESA_ESPECIAL" to 308.0,
        "VELOCIDADE" to 218.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Tapinha Duplo", 15, "FADA", "FÍSICO"),
        2 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        3 to listOf("Hiper Voz", 90, "NORMAL", "ESPECIAL"),
        4 to listOf("Desmantelar", 90, "NORMAL", "FÍSICO")
    )
)

val tangela: Map<String, Any> = mapOf(
    "NOME" to "Tangela",
    "TIPOS" to listOf("GRAMA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GRAMA", "ELÉTRICO", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VENENO", "VOADOR", "INSETO"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 208.0,
        "DEFESA" to 328.0,
        "ATAQUE_ESPECIAL" to 298.0,
        "DEFESA_ESPECIAL" to 178.0,
        "VELOCIDADE" to 240.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        2 to listOf("Chicote de Vinha", 45, "GRAMA", "FÍSICO"),
        3 to listOf("Bomba de Semente", 80, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)

val kangaskhan: Map<String, Any> = mapOf(
    "NOME" to "Kangaskhan",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 414.0,
        "ATAQUE" to 288.0,
        "DEFESA" to 258.0,
        "ATAQUE_ESPECIAL" to 178.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        4 to listOf("Pisoteada", 65, "NORMAL", "FÍSICO")
    )
)

val horsea: Map<String, Any> = mapOf(
    "NOME" to "Horsea",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 178.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 238.0,
        "DEFESA_ESPECIAL" to 148.0,
        "VELOCIDADE" to 240.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Bolha", 40, "ÁGUA", "ESPECIAL"),
        3 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO"),
        4 to listOf("Pulso d'Água", 60, "ÁGUA", "ESPECIAL")
    )
)

val seadra: Map<String, Any> = mapOf(
    "NOME" to "Seadra",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 228.0,
        "DEFESA" to 288.0,
        "ATAQUE_ESPECIAL" to 288.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 295.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Bolha", 40, "ÁGUA", "ESPECIAL"),
        3 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO"),
        4 to listOf("Pulso d'Água", 60, "ÁGUA", "ESPECIAL")
    )
)

val goldeen: Map<String, Any> = mapOf(
    "NOME" to "Goldeen",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 294.0,
        "ATAQUE" to 234.0,
        "DEFESA" to 218.0,
        "ATAQUE_ESPECIAL" to 168.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 246.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO"),
        3 to listOf("Chifre de Ataque", 65, "NORMAL", "FÍSICO"),
        4 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO")
    )
)

val seaking: Map<String, Any> = mapOf(
    "NOME" to "Seaking",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 284.0,
        "DEFESA" to 228.0,
        "ATAQUE_ESPECIAL" to 218.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO"),
        3 to listOf("Chifre de Ataque", 65, "NORMAL", "FÍSICO"),
        4 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO")
    )
)

val staryu: Map<String, Any> = mapOf(
    "NOME" to "Staryu",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 238.0,
        "DEFESA_ESPECIAL" to 208.0,
        "VELOCIDADE" to 295.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Pulso d'Água", 60, "ÁGUA", "ESPECIAL"),
        3 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val starmie: Map<String, Any> = mapOf(
    "NOME" to "Starmie",
    "TIPOS" to listOf("ÁGUA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO", "LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 248.0,
        "DEFESA" to 268.0,
        "ATAQUE_ESPECIAL" to 298.0,
        "DEFESA_ESPECIAL" to 268.0,
        "VELOCIDADE" to 361.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        4 to listOf("Pulso d'Água", 60, "ÁGUA", "ESPECIAL")
    )
)

val mrMime: Map<String, Any> = mapOf(
    "NOME" to "Mr. Mime",
    "TIPOS" to listOf("PSÍQUICO", "FADA"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO", "DRAGÃO"),
    "DESVANTAGENS" to listOf("VENENO", "FANTASMA", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 188.0,
        "DEFESA" to 228.0,
        "ATAQUE_ESPECIAL" to 298.0,
        "DEFESA_ESPECIAL" to 338.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Brilho Encantador", 80, "FADA", "ESPECIAL"),
        3 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Soco Trovão", 75, "ELÉTRICO", "FÍSICO")
    )
)

val scyther: Map<String, Any> = mapOf(
    "NOME" to "Scyther",
    "TIPOS" to listOf("INSETO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "ELÉTRICO", "GELO", "VOADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 318.0,
        "DEFESA" to 258.0,
        "ATAQUE_ESPECIAL" to 208.0,
        "DEFESA_ESPECIAL" to 258.0,
        "VELOCIDADE" to 339.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Zumbido", 90, "INSETO", "ESPECIAL"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val jynx: Map<String, Any> = mapOf(
    "NOME" to "Jynx",
    "TIPOS" to listOf("GELO", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("GELO", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("FOGO", "INSETO", "PEDRA", "FANTASMA", "SOMBRIO", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 198.0,
        "DEFESA" to 168.0,
        "ATAQUE_ESPECIAL" to 328.0,
        "DEFESA_ESPECIAL" to 288.0,
        "VELOCIDADE" to 317.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Soco de Gelo", 75, "GELO", "FÍSICO"),
        4 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL")
    )
)

val electabuzz: Map<String, Any> = mapOf(
    "NOME" to "Electabuzz",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "AÇO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 264.0,
        "DEFESA" to 214.0,
        "ATAQUE_ESPECIAL" to 288.0,
        "DEFESA_ESPECIAL" to 268.0,
        "VELOCIDADE" to 339.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 90, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Soco Trovão", 75, "ELÉTRICO", "FÍSICO"),
        3 to listOf("Raio", 40, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Explosão de Faísca", 65, "ELÉTRICO", "ESPECIAL")
    )
)

val magmar: Map<String, Any> = mapOf(
    "NOME" to "Magmar",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "PEDRA", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 288.0,
        "DEFESA" to 214.0,
        "ATAQUE_ESPECIAL" to 298.0,
        "DEFESA_ESPECIAL" to 268.0,
        "VELOCIDADE" to 317.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO"),
        3 to listOf("Presas de Fogo", 65, "FOGO", "FÍSICO"),
        4 to listOf("Chama Explosiva", 110, "FOGO", "ESPECIAL")
    )
)

val pinsir: Map<String, Any> = mapOf(
    "NOME" to "Pinsir",
    "TIPOS" to listOf("INSETO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 348.0,
        "DEFESA" to 298.0,
        "ATAQUE_ESPECIAL" to 208.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 295.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Zumbido", 90, "INSETO", "ESPECIAL"),
        2 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        3 to listOf("Garra de Tijolo", 75, "LUTADOR", "FÍSICO"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val tauros: Map<String, Any> = mapOf(
    "NOME" to "Tauros",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 354.0,
        "ATAQUE" to 298.0,
        "DEFESA" to 288.0,
        "ATAQUE_ESPECIAL" to 178.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 350.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        2 to listOf("Pisoteada", 65, "NORMAL", "FÍSICO"),
        3 to listOf("Chifre de Ataque", 65, "NORMAL", "FÍSICO"),
        4 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO")
    )
)

val magikarp: Map<String, Any> = mapOf(
    "NOME" to "Magikarp",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 244.0,
        "ATAQUE" to 128.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 138.0,
        "DEFESA_ESPECIAL" to 138.0,
        "VELOCIDADE" to 284.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO")
    )
)

val gyarados: Map<String, Any> = mapOf(
    "NOME" to "Gyarados",
    "TIPOS" to listOf("ÁGUA", "VOADOR"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "AÇO", "LUTADOR", "INSETO", "TERRA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 394.0,
        "ATAQUE" to 348.0,
        "DEFESA" to 256.0,
        "ATAQUE_ESPECIAL" to 218.0,
        "DEFESA_ESPECIAL" to 298.0,
        "VELOCIDADE" to 294.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        4 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO")
    )
)

val lapras: Map<String, Any> = mapOf(
    "NOME" to "Lapras",
    "TIPOS" to listOf("ÁGUA", "GELO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GELO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 464.0,
        "ATAQUE" to 268.0,
        "DEFESA" to 258.0,
        "ATAQUE_ESPECIAL" to 268.0,
        "DEFESA_ESPECIAL" to 288.0,
        "VELOCIDADE" to 240.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        3 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO"),
        4 to listOf("Soco Trovão", 75, "ELÉTRICO", "FÍSICO")
    )
)

val ditto: Map<String, Any> = mapOf(
    "NOME" to "Ditto",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 296.0,
        "ATAQUE" to 194.0,
        "DEFESA" to 194.0,
        "ATAQUE_ESPECIAL" to 194.0,
        "DEFESA_ESPECIAL" to 194.0,
        "VELOCIDADE" to 194.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Transformação", 0, "NORMAL", "STATUS")
    )
)

val eevee: Map<String, Any> = mapOf(
    "NOME" to "Eevee",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 208.0,
        "DEFESA" to 198.0,
        "ATAQUE_ESPECIAL" to 188.0,
        "DEFESA_ESPECIAL" to 228.0,
        "VELOCIDADE" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 70, "NORMAL", "FÍSICO")
    )
)

val vaporeon: Map<String, Any> = mapOf(
    "NOME" to "Vaporeon",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 464.0,
        "ATAQUE" to 228.0,
        "DEFESA" to 218.0,
        "ATAQUE_ESPECIAL" to 318.0,
        "DEFESA_ESPECIAL" to 288.0,
        "VELOCIDADE" to 251.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO"),
        3 to listOf("Cauda d'Água", 90, "ÁGUA", "FÍSICO"),
        4 to listOf("Pulso d'Água", 60, "ÁGUA", "ESPECIAL")
    )
)

val jolteon: Map<String, Any> = mapOf(
    "NOME" to "Jolteon",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "AÇO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 228.0,
        "DEFESA" to 218.0,
        "ATAQUE_ESPECIAL" to 318.0,
        "DEFESA_ESPECIAL" to 288.0,
        "VELOCIDADE" to 394.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 90, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Soco Trovão", 75, "ELÉTRICO", "FÍSICO"),
        3 to listOf("Raio", 40, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val flareon: Map<String, Any> = mapOf(
    "NOME" to "Flareon",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "PEDRA", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 358.0,
        "DEFESA" to 218.0,
        "ATAQUE_ESPECIAL" to 288.0,
        "DEFESA_ESPECIAL" to 318.0,
        "VELOCIDADE" to 251.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Presas de Fogo", 65, "FOGO", "FÍSICO"),
        3 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO"),
        4 to listOf("Chama Explosiva", 110, "FOGO", "ESPECIAL")
    )
)

val porygon: Map<String, Any> = mapOf(
    "NOME" to "Porygon",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 218.0,
        "DEFESA" to 238.0,
        "ATAQUE_ESPECIAL" to 268.0,
        "DEFESA_ESPECIAL" to 248.0,
        "VELOCIDADE" to 196.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL"),
        2 to listOf("Choque do Trovão", 90, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val omanyte: Map<String, Any> = mapOf(
    "NOME" to "Omanyte",
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("GRAMA", "ELÉTRICO", "LUTADOR", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 178.0,
        "DEFESA" to 298.0,
        "ATAQUE_ESPECIAL" to 278.0,
        "DEFESA_ESPECIAL" to 208.0,
        "VELOCIDADE" to 185.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO"),
        3 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO"),
        4 to listOf("Explosão de Rocha", 25, "PEDRA", "FÍSICO")
    )
)

val omastar: Map<String, Any> = mapOf(
    "NOME" to "Omastar",
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("GRAMA", "ELÉTRICO", "LUTADOR", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 218.0,
        "DEFESA" to 348.0,
        "ATAQUE_ESPECIAL" to 328.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO"),
        3 to listOf("Mergulho", 80, "ÁGUA", "FÍSICO"),
        4 to listOf("Explosão de Rocha", 25, "PEDRA", "FÍSICO")
    )
)

val kabuto: Map<String, Any> = mapOf(
    "NOME" to "Kabuto",
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("GRAMA", "ELÉTRICO", "LUTADOR", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 258.0,
        "DEFESA" to 278.0,
        "ATAQUE_ESPECIAL" to 208.0,
        "DEFESA_ESPECIAL" to 188.0,
        "VELOCIDADE" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO"),
        3 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Explosão de Rocha", 25, "PEDRA", "FÍSICO")
    )
)

val kabutops: Map<String, Any> = mapOf(
    "NOME" to "Kabutops",
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("GRAMA", "ELÉTRICO", "LUTADOR", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 328.0,
        "DEFESA" to 308.0,
        "ATAQUE_ESPECIAL" to 238.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 284.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Jato d'Água", 110, "ÁGUA", "ESPECIAL"),
        2 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO"),
        3 to listOf("Corte", 70, "NORMAL", "FÍSICO"),
        4 to listOf("Explosão de Rocha", 25, "PEDRA", "FÍSICO")
    )
)

val aerodactyl: Map<String, Any> = mapOf(
    "NOME" to "Aerodactyl",
    "TIPOS" to listOf("PEDRA", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FOGO", "VOADOR", "INSETO", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("ÁGUA", "ELÉTRICO", "GELO", "PEDRA", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 308.0,
        "DEFESA" to 228.0,
        "ATAQUE_ESPECIAL" to 218.0,
        "DEFESA_ESPECIAL" to 248.0,
        "VELOCIDADE" to 394.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        2 to listOf("Corte de Pedra", 100, "PEDRA", "FÍSICO"),
        3 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val snorlax: Map<String, Any> = mapOf(
    "NOME" to "Snorlax",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 524.0,
        "ATAQUE" to 318.0,
        "DEFESA" to 228.0,
        "ATAQUE_ESPECIAL" to 228.0,
        "DEFESA_ESPECIAL" to 318.0,
        "VELOCIDADE" to 174.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL"),
        3 to listOf("Pisoteada", 65, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 70, "NORMAL", "FÍSICO")
    )
)

val articuno: Map<String, Any> = mapOf(
    "NOME" to "Articuno",
    "TIPOS" to listOf("GELO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "ELÉTRICO", "PEDRA", "AÇO"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 268.0,
        "DEFESA" to 298.0,
        "ATAQUE_ESPECIAL" to 288.0,
        "DEFESA_ESPECIAL" to 348.0,
        "VELOCIDADE" to 295.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Raio de Gelo", 90, "GELO", "ESPECIAL"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Nevasca", 110, "GELO", "ESPECIAL"),
        4 to listOf("Golpe Aéreo", 60, "VOADOR", "FÍSICO")
    )
)

val zapdos: Map<String, Any> = mapOf(
    "NOME" to "Zapdos",
    "TIPOS" to listOf("ELÉTRICO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VOADOR", "INSETO", "AÇO"),
    "DESVANTAGENS" to listOf("GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 278.0,
        "DEFESA" to 268.0,
        "ATAQUE_ESPECIAL" to 348.0,
        "DEFESA_ESPECIAL" to 278.0,
        "VELOCIDADE" to 328.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 90, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Raio", 40, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Perfuração", 80, "VOADOR", "FÍSICO")
    )
)

val moltres: Map<String, Any> = mapOf(
    "NOME" to "Moltres",
    "TIPOS" to listOf("FOGO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "INSETO", "AÇO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "ELÉTRICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 298.0,
        "DEFESA" to 278.0,
        "ATAQUE_ESPECIAL" to 348.0,
        "DEFESA_ESPECIAL" to 268.0,
        "VELOCIDADE" to 306.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Lança-Chamas", 90, "FOGO", "ESPECIAL"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Presas de Fogo", 65, "FOGO", "FÍSICO"),
        4 to listOf("Chama Explosiva", 110, "FOGO", "ESPECIAL")
    )
)

val dratini: Map<String, Any> = mapOf(
    "NOME" to "Dratini",
    "TIPOS" to listOf("DRAGÃO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GRAMA", "ELÉTRICO"),
    "DESVANTAGENS" to listOf("GELO", "DRAGÃO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 282.0,
        "ATAQUE" to 226.0,
        "DEFESA" to 188.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 198.0,
        "VELOCIDADE" to 218.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Sopro do Dragão", 60, "DRAGÃO", "ESPECIAL"),
        2 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Investida Dragão", 100, "DRAGÃO", "FÍSICO"),
        4 to listOf("Cauda de Dragão", 60, "DRAGÃO", "FÍSICO")
    )
)

val dragonair: Map<String, Any> = mapOf(
    "NOME" to "Dragonair",
    "TIPOS" to listOf("DRAGÃO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GRAMA", "ELÉTRICO"),
    "DESVANTAGENS" to listOf("GELO", "DRAGÃO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 322.0,
        "ATAQUE" to 266.0,
        "DEFESA" to 228.0,
        "ATAQUE_ESPECIAL" to 238.0,
        "DEFESA_ESPECIAL" to 238.0,
        "VELOCIDADE" to 262.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Sopro do Dragão", 60, "DRAGÃO", "ESPECIAL"),
        2 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Investida Dragão", 100, "DRAGÃO", "FÍSICO"),
        4 to listOf("Cauda de Dragão", 60, "DRAGÃO", "FÍSICO")
    )
)

val dragonite: Map<String, Any> = mapOf(
    "NOME" to "Dragonite",
    "TIPOS" to listOf("DRAGÃO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GRAMA", "LUTADOR", "INSETO"),
    "DESVANTAGENS" to listOf("GELO", "PEDRA", "DRAGÃO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 382.0,
        "ATAQUE" to 366.0,
        "DEFESA" to 288.0,
        "ATAQUE_ESPECIAL" to 298.0,
        "DEFESA_ESPECIAL" to 298.0,
        "VELOCIDADE" to 284.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Sopro do Dragão", 60, "DRAGÃO", "ESPECIAL"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL"),
        4 to listOf("Cauda de Dragão", 60, "DRAGÃO", "FÍSICO")
    )
)

val mewtwo: Map<String, Any> = mapOf(
    "NOME" to "Mewtwo",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 412.0,
        "ATAQUE" to 318.0,
        "DEFESA" to 278.0,
        "ATAQUE_ESPECIAL" to 406.0,
        "DEFESA_ESPECIAL" to 278.0,
        "VELOCIDADE" to 394.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val mew: Map<String, Any> = mapOf(
    "NOME" to "Mew",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 404.0,
        "ATAQUE" to 298.0,
        "DEFESA" to 298.0,
        "ATAQUE_ESPECIAL" to 298.0,
        "DEFESA_ESPECIAL" to 298.0,
        "VELOCIDADE" to 328.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)