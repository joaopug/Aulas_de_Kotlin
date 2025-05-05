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
        "DEFESA_ESPECIAL" to 251.0
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
        "DEFESA_ESPECIAL" to 227.0
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
        "DEFESA_ESPECIAL" to 259.0
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
        "DEFESA_ESPECIAL" to 309.0
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
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Endurecer", 0, "NORMAL", "STATUS"),
        2 to listOf("Eletroteia", 55, "ELÉTRICO", "ESPECIAL")
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
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ferrão Venenoso", 15, "VENENO", "FÍSICO"),
        2 to listOf("Cerca de Seda", 0, "INSETO", "STATUS")
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
        "DEFESA_ESPECIAL" to 168.0
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
        "DEFESA_ESPECIAL" to 198.0
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
        "DEFESA_ESPECIAL" to 238.0
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
        "DEFESA_ESPECIAL" to 148.0
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
        "DEFESA_ESPECIAL" to 198.0
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
        "DEFESA_ESPECIAL" to 162.0
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
        "DEFESA_ESPECIAL" to 222.0
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
        "DEFESA_ESPECIAL" to 178.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        2 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Gás Venenoso", 0, "VENENO", "STATUS")
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
        "DEFESA_ESPECIAL" to 228.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        2 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Gás Venenoso", 0, "VENENO", "STATUS")
    )
)

val pikachu: Map<String, Any> = mapOf(
    "NOME" to "Pikachu",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 208.0,
        "DEFESA" to 158.0,
        "ATAQUE_ESPECIAL" to 198.0,
        "DEFESA_ESPECIAL" to 198.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Trovoada", 95, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Cauda de Ferro", 100, "METÁLICO", "FÍSICO")
    )
)

val raichu: Map<String, Any> = mapOf(
    "NOME" to "Raichu",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 278.0,
        "DEFESA" to 208.0,
        "ATAQUE_ESPECIAL" to 278.0,
        "DEFESA_ESPECIAL" to 278.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Trovoada", 95, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Cauda de Ferro", 100, "METÁLICO", "FÍSICO"),
        4 to listOf("Raio", 120, "ELÉTRICO", "ESPECIAL")
    )
)
val sandshrew: Map<String, Any> = mapOf(
    "NOME" to "Sandshrew",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 249.0,
        "DEFESA" to 269.0,
        "ATAQUE_ESPECIAL" to 159.0,
        "DEFESA_ESPECIAL" to 159.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Corte", 50, "NORMAL", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Cavar", 60, "TERRA", "FÍSICO")
    )
)

val sandslash: Map<String, Any> = mapOf(
    "NOME" to "Sandslash",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 354.0,
        "ATAQUE" to 299.0,
        "DEFESA" to 319.0,
        "ATAQUE_ESPECIAL" to 209.0,
        "DEFESA_ESPECIAL" to 209.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 50, "NORMAL", "FÍSICO"),
        2 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        3 to listOf("Cavar", 60, "TERRA", "FÍSICO"),
        4 to listOf("Lança-Mísseis", 20, "NORMAL", "FÍSICO")
    )
)

val nidoran_f: Map<String, Any> = mapOf(
    "NOME" to "Nidoran♀",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 195.0,
        "DEFESA" to 205.0,
        "ATAQUE_ESPECIAL" to 185.0,
        "DEFESA_ESPECIAL" to 185.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Picada Venenosa", 15, "VENENO", "FÍSICO"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val nidorina: Map<String, Any> = mapOf(
    "NOME" to "Nidorina",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 225.0,
        "DEFESA" to 235.0,
        "ATAQUE_ESPECIAL" to 215.0,
        "DEFESA_ESPECIAL" to 215.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        2 to listOf("Picada Venenosa", 15, "VENENO", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO")
    )
)

val nidoqueen: Map<String, Any> = mapOf(
    "NOME" to "Nidoqueen",
    "TIPOS" to listOf("VENENO", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "LUTADOR", "VENENO", "INSETO", "PEDRA", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 265.0,
        "DEFESA" to 275.0,
        "ATAQUE_ESPECIAL" to 249.0,
        "DEFESA_ESPECIAL" to 249.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        3 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        4 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL")
    )
)

val nidoran_m: Map<String, Any> = mapOf(
    "NOME" to "Nidoran♂",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 302.0,
        "ATAQUE" to 215.0,
        "DEFESA" to 185.0,
        "ATAQUE_ESPECIAL" to 185.0,
        "DEFESA_ESPECIAL" to 185.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Chifrada", 65, "NORMAL", "FÍSICO"),
        2 to listOf("Picada Venenosa", 15, "VENENO", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val nidorino: Map<String, Any> = mapOf(
    "NOME" to "Nidorino",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 332.0,
        "ATAQUE" to 245.0,
        "DEFESA" to 215.0,
        "ATAQUE_ESPECIAL" to 215.0,
        "DEFESA_ESPECIAL" to 215.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Chifrada", 65, "NORMAL", "FÍSICO"),
        2 to listOf("Picada Venenosa", 15, "VENENO", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val nidoking: Map<String, Any> = mapOf(
    "NOME" to "Nidoking",
    "TIPOS" to listOf("VENENO", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "LUTADOR", "VENENO", "INSETO", "PEDRA", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 285.0,
        "DEFESA" to 255.0,
        "ATAQUE_ESPECIAL" to 269.0,
        "DEFESA_ESPECIAL" to 269.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        2 to listOf("Chifrada", 65, "NORMAL", "FÍSICO"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL")
    )
)

val clefairy: Map<String, Any> = mapOf(
    "NOME" to "Clefairy",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 189.0,
        "DEFESA" to 195.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        4 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL")
    )
)

val clefable: Map<String, Any> = mapOf(
    "NOME" to "Clefable",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 394.0,
        "ATAQUE" to 239.0,
        "DEFESA" to 245.0,
        "ATAQUE_ESPECIAL" to 269.0,
        "DEFESA_ESPECIAL" to 269.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco Dinâmico", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val vulpix: Map<String, Any> = mapOf(
    "NOME" to "Vulpix",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 286.0,
        "ATAQUE" to 181.0,
        "DEFESA" to 179.0,
        "ATAQUE_ESPECIAL" to 199.0,
        "DEFESA_ESPECIAL" to 199.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL")
    )
)

val ninetales: Map<String, Any> = mapOf(
    "NOME" to "Ninetales",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 356.0,
        "ATAQUE" to 251.0,
        "DEFESA" to 249.0,
        "ATAQUE_ESPECIAL" to 261.0,
        "DEFESA_ESPECIAL" to 261.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL")
    )
)

val jigglypuff: Map<String, Any> = mapOf(
    "NOME" to "Jigglypuff",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 434.0,
        "ATAQUE" to 189.0,
        "DEFESA" to 139.0,
        "ATAQUE_ESPECIAL" to 189.0,
        "DEFESA_ESPECIAL" to 189.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val wigglytuff: Map<String, Any> = mapOf(
    "NOME" to "Wigglytuff",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 484.0,
        "ATAQUE" to 239.0,
        "DEFESA" to 189.0,
        "ATAQUE_ESPECIAL" to 239.0,
        "DEFESA_ESPECIAL" to 239.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val zubat: Map<String, Any> = mapOf(
    "NOME" to "Zubat",
    "TIPOS" to listOf("VENENO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 189.0,
        "DEFESA" to 169.0,
        "ATAQUE_ESPECIAL" to 159.0,
        "DEFESA_ESPECIAL" to 159.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO")
    )
)

val golbat: Map<String, Any> = mapOf(
    "NOME" to "Golbat",
    "TIPOS" to listOf("VENENO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 354.0,
        "ATAQUE" to 259.0,
        "DEFESA" to 239.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO")
    )
)

val oddish: Map<String, Any> = mapOf(
    "NOME" to "Oddish",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 294.0,
        "ATAQUE" to 199.0,
        "DEFESA" to 209.0,
        "ATAQUE_ESPECIAL" to 249.0,
        "DEFESA_ESPECIAL" to 249.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)

val gloom: Map<String, Any> = mapOf(
    "NOME" to "Gloom",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 239.0,
        "ATAQUE_ESPECIAL" to 279.0,
        "DEFESA_ESPECIAL" to 279.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)

val vileplume: Map<String, Any> = mapOf(
    "NOME" to "Vileplume",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 354.0,
        "ATAQUE" to 259.0,
        "DEFESA" to 269.0,
        "ATAQUE_ESPECIAL" to 309.0,
        "DEFESA_ESPECIAL" to 309.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)

val paras: Map<String, Any> = mapOf(
    "NOME" to "Paras",
    "TIPOS" to listOf("INSETO", "GRAMA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "LUTADOR", "GRAMA", "TERRA", "ÁGUA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "GELO", "VENENO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 239.0,
        "DEFESA" to 209.0,
        "ATAQUE_ESPECIAL" to 189.0,
        "DEFESA_ESPECIAL" to 189.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Corte", 50, "NORMAL", "FÍSICO"),
        4 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO")
    )
)

val parasect: Map<String, Any> = mapOf(
    "NOME" to "Parasect",
    "TIPOS" to listOf("INSETO", "GRAMA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "LUTADOR", "GRAMA", "TERRA", "ÁGUA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "GELO", "VENENO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 289.0,
        "DEFESA" to 259.0,
        "ATAQUE_ESPECIAL" to 239.0,
        "DEFESA_ESPECIAL" to 239.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Corte", 50, "NORMAL", "FÍSICO"),
        4 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO")
    )
)

val venonat: Map<String, Any> = mapOf(
    "NOME" to "Venonat",
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 209.0,
        "DEFESA" to 199.0,
        "ATAQUE_ESPECIAL" to 189.0,
        "DEFESA_ESPECIAL" to 189.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Picada Venenosa", 15, "VENENO", "FÍSICO"),
        4 to listOf("Absorver", 20, "GRAMA", "ESPECIAL")
    )
)

val venomoth: Map<String, Any> = mapOf(
    "NOME" to "Venomoth",
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 219.0,
        "ATAQUE_ESPECIAL" to 279.0,
        "DEFESA_ESPECIAL" to 279.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Picada Venenosa", 15, "VENENO", "FÍSICO"),
        4 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL")
    )
)

val diglett: Map<String, Any> = mapOf(
    "NOME" to "Diglett",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 224.0,
        "ATAQUE" to 209.0,
        "DEFESA" to 149.0,
        "ATAQUE_ESPECIAL" to 169.0,
        "DEFESA_ESPECIAL" to 169.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Cavar", 60, "TERRA", "FÍSICO"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val dugtrio: Map<String, Any> = mapOf(
    "NOME" to "Dugtrio",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 259.0,
        "DEFESA" to 199.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Cavar", 60, "TERRA", "FÍSICO"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val meowth: Map<String, Any> = mapOf(
    "NOME" to "Meowth",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 189.0,
        "DEFESA" to 169.0,
        "ATAQUE_ESPECIAL" to 179.0,
        "DEFESA_ESPECIAL" to 179.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val persian: Map<String, Any> = mapOf(
    "NOME" to "Persian",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 239.0,
        "DEFESA" to 219.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val psyduck: Map<String, Any> = mapOf(
    "NOME" to "Psyduck",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 203.0,
        "DEFESA" to 195.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val golduck: Map<String, Any> = mapOf(
    "NOME" to "Golduck",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 263.0,
        "DEFESA" to 255.0,
        "ATAQUE_ESPECIAL" to 289.0,
        "DEFESA_ESPECIAL" to 289.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val mankey: Map<String, Any> = mapOf(
    "NOME" to "Mankey",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 259.0,
        "DEFESA" to 169.0,
        "ATAQUE_ESPECIAL" to 169.0,
        "DEFESA_ESPECIAL" to 169.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val primeape: Map<String, Any> = mapOf(
    "NOME" to "Primeape",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 309.0,
        "DEFESA" to 219.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val growlithe: Map<String, Any> = mapOf(
    "NOME" to "Growlithe",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 239.0,
        "DEFESA" to 189.0,
        "ATAQUE_ESPECIAL" to 239.0,
        "DEFESA_ESPECIAL" to 239.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL")
    )
)

val arcanine: Map<String, Any> = mapOf(
    "NOME" to "Arcanine",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 319.0,
        "DEFESA" to 259.0,
        "ATAQUE_ESPECIAL" to 299.0,
        "DEFESA_ESPECIAL" to 299.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL")
    )
)

val poliwag: Map<String, Any> = mapOf(
    "NOME" to "Poliwag",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 199.0,
        "DEFESA" to 179.0,
        "ATAQUE_ESPECIAL" to 179.0,
        "DEFESA_ESPECIAL" to 179.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val poliwhirl: Map<String, Any> = mapOf(
    "NOME" to "Poliwhirl",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 229.0,
        "ATAQUE_ESPECIAL" to 209.0,
        "DEFESA_ESPECIAL" to 209.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val poliwrath: Map<String, Any> = mapOf(
    "NOME" to "Poliwrath",
    "TIPOS" to listOf("ÁGUA", "LUTADOR"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 279.0,
        "DEFESA" to 289.0,
        "ATAQUE_ESPECIAL" to 239.0,
        "DEFESA_ESPECIAL" to 239.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val abra: Map<String, Any> = mapOf(
    "NOME" to "Abra",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 254.0,
        "ATAQUE" to 139.0,
        "DEFESA" to 129.0,
        "ATAQUE_ESPECIAL" to 309.0,
        "DEFESA_ESPECIAL" to 309.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val kadabra: Map<String, Any> = mapOf(
    "NOME" to "Kadabra",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 169.0,
        "DEFESA" to 159.0,
        "ATAQUE_ESPECIAL" to 339.0,
        "DEFESA_ESPECIAL" to 339.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val alakazam: Map<String, Any> = mapOf(
    "NOME" to "Alakazam",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 199.0,
        "DEFESA" to 189.0,
        "ATAQUE_ESPECIAL" to 369.0,
        "DEFESA_ESPECIAL" to 369.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val machop: Map<String, Any> = mapOf(
    "NOME" to "Machop",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 259.0,
        "DEFESA" to 199.0,
        "ATAQUE_ESPECIAL" to 169.0,
        "DEFESA_ESPECIAL" to 169.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val machoke: Map<String, Any> = mapOf(
    "NOME" to "Machoke",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 299.0,
        "DEFESA" to 239.0,
        "ATAQUE_ESPECIAL" to 199.0,
        "DEFESA_ESPECIAL" to 199.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val machamp: Map<String, Any> = mapOf(
    "NOME" to "Machamp",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 359.0,
        "DEFESA" to 259.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val bellsprout: Map<String, Any> = mapOf(
    "NOME" to "Bellsprout",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 249.0,
        "DEFESA" to 169.0,
        "ATAQUE_ESPECIAL" to 239.0,
        "DEFESA_ESPECIAL" to 239.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Chicote de Vinha", 35, "GRAMA", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO")
    )
)

val weepinbell: Map<String, Any> = mapOf(
    "NOME" to "Weepinbell",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 279.0,
        "DEFESA" to 199.0,
        "ATAQUE_ESPECIAL" to 269.0,
        "DEFESA_ESPECIAL" to 269.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Chicote de Vinha", 35, "GRAMA", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO")
    )
)

val victreebel: Map<String, Any> = mapOf(
    "NOME" to "Victreebel",
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 309.0,
        "DEFESA" to 229.0,
        "ATAQUE_ESPECIAL" to 299.0,
        "DEFESA_ESPECIAL" to 299.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Chicote de Vinha", 35, "GRAMA", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO")
    )
)

val tentacool: Map<String, Any> = mapOf(
    "NOME" to "Tentacool",
    "TIPOS" to listOf("ÁGUA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "VENENO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 179.0,
        "DEFESA" to 169.0,
        "ATAQUE_ESPECIAL" to 199.0,
        "DEFESA_ESPECIAL" to 199.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val tentacruel: Map<String, Any> = mapOf(
    "NOME" to "Tentacruel",
    "TIPOS" to listOf("ÁGUA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "VENENO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 239.0,
        "DEFESA" to 229.0,
        "ATAQUE_ESPECIAL" to 259.0,
        "DEFESA_ESPECIAL" to 259.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val geodude: Map<String, Any> = mapOf(
    "NOME" to "Geodude",
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 259.0,
        "DEFESA" to 299.0,
        "ATAQUE_ESPECIAL" to 159.0,
        "DEFESA_ESPECIAL" to 159.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val graveler: Map<String, Any> = mapOf(
    "NOME" to "Graveler",
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 289.0,
        "DEFESA" to 329.0,
        "ATAQUE_ESPECIAL" to 189.0,
        "DEFESA_ESPECIAL" to 189.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val golem: Map<String, Any> = mapOf(
    "NOME" to "Golem",
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 319.0,
        "DEFESA" to 359.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val ponyta: Map<String, Any> = mapOf(
    "NOME" to "Ponyta",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 269.0,
        "DEFESA" to 209.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL")
    )
)

val rapidash: Map<String, Any> = mapOf(
    "NOME" to "Rapidash",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 299.0,
        "DEFESA" to 239.0,
        "ATAQUE_ESPECIAL" to 259.0,
        "DEFESA_ESPECIAL" to 259.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL")
    )
)

val slowpoke: Map<String, Any> = mapOf(
    "NOME" to "Slowpoke",
    "TIPOS" to listOf("ÁGUA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "PSÍQUICO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 229.0,
        "ATAQUE_ESPECIAL" to 179.0,
        "DEFESA_ESPECIAL" to 179.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val slowbro: Map<String, Any> = mapOf(
    "NOME" to "Slowbro",
    "TIPOS" to listOf("ÁGUA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "PSÍQUICO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 394.0,
        "ATAQUE" to 249.0,
        "DEFESA" to 329.0,
        "ATAQUE_ESPECIAL" to 299.0,
        "DEFESA_ESPECIAL" to 299.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val magnemite: Map<String, Any> = mapOf(
    "NOME" to "Magnemite",
    "TIPOS" to listOf("ELÉTRICO", "METÁLICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO", "GRAMA", "PSÍQUICO", "INSETO", "PEDRA", "GELO", "DRAGÃO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "LUTADOR", "FOGO"),
    "STATUS" to mapOf(
        "VIDA" to 254.0,
        "ATAQUE" to 169.0,
        "DEFESA" to 239.0,
        "ATAQUE_ESPECIAL" to 289.0,
        "DEFESA_ESPECIAL" to 289.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL")
    )
)

val magneton: Map<String, Any> = mapOf(
    "NOME" to "Magneton",
    "TIPOS" to listOf("ELÉTRICO", "METÁLICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO", "GRAMA", "PSÍQUICO", "INSETO", "PEDRA", "GELO", "DRAGÃO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "LUTADOR", "FOGO"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 219.0,
        "DEFESA" to 289.0,
        "ATAQUE_ESPECIAL" to 339.0,
        "DEFESA_ESPECIAL" to 339.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL")
    )
)

val farfetchd: Map<String, Any> = mapOf(
    "NOME" to "Farfetch'd",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 306.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 209.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bicada", 35, "VOADOR", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val doduo: Map<String, Any> = mapOf(
    "NOME" to "Doduo",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 269.0,
        "DEFESA" to 189.0,
        "ATAQUE_ESPECIAL" to 169.0,
        "DEFESA_ESPECIAL" to 169.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bicada", 35, "VOADOR", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val dodrio: Map<String, Any> = mapOf(
    "NOME" to "Dodrio",
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 319.0,
        "DEFESA" to 239.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Bicada", 35, "VOADOR", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val seel: Map<String, Any> = mapOf(
    "NOME" to "Seel",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 189.0,
        "DEFESA" to 209.0,
        "ATAQUE_ESPECIAL" to 189.0,
        "DEFESA_ESPECIAL" to 189.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val dewgong: Map<String, Any> = mapOf(
    "NOME" to "Dewgong",
    "TIPOS" to listOf("ÁGUA", "GELO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GELO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 239.0,
        "DEFESA" to 259.0,
        "ATAQUE_ESPECIAL" to 239.0,
        "DEFESA_ESPECIAL" to 239.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val grimer: Map<String, Any> = mapOf(
    "NOME" to "Grimer",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 259.0,
        "DEFESA" to 169.0,
        "ATAQUE_ESPECIAL" to 149.0,
        "DEFESA_ESPECIAL" to 149.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO")
    )
)

val muk: Map<String, Any> = mapOf(
    "NOME" to "Muk",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 414.0,
        "ATAQUE" to 309.0,
        "DEFESA" to 249.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO")
    )
)
val shellder: Map<String, Any> = mapOf(
    "NOME" to "Shellder",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 299.0,
        "ATAQUE_ESPECIAL" to 189.0,
        "DEFESA_ESPECIAL" to 189.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL")
    )
)

val cloyster: Map<String, Any> = mapOf(
    "NOME" to "Cloyster",
    "TIPOS" to listOf("ÁGUA", "GELO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GELO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 289.0,
        "DEFESA" to 459.0,
        "ATAQUE_ESPECIAL" to 269.0,
        "DEFESA_ESPECIAL" to 269.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL")
    )
)

val gastly: Map<String, Any> = mapOf(
    "NOME" to "Gastly",
    "TIPOS" to listOf("FANTASMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 169.0,
        "DEFESA" to 159.0,
        "ATAQUE_ESPECIAL" to 299.0,
        "DEFESA_ESPECIAL" to 299.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Língua", 30, "FANTASMA", "FÍSICO"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Sombra Noturna", 60, "FANTASMA", "FÍSICO")
    )
)

val haunter: Map<String, Any> = mapOf(
    "NOME" to "Haunter",
    "TIPOS" to listOf("FANTASMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 294.0,
        "ATAQUE" to 199.0,
        "DEFESA" to 189.0,
        "ATAQUE_ESPECIAL" to 329.0,
        "DEFESA_ESPECIAL" to 329.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Língua", 30, "FANTASMA", "FÍSICO"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Sombra Noturna", 60, "FANTASMA", "FÍSICO")
    )
)

val gengar: Map<String, Any> = mapOf(
    "NOME" to "Gengar",
    "TIPOS" to listOf("FANTASMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 219.0,
        "ATAQUE_ESPECIAL" to 359.0,
        "DEFESA_ESPECIAL" to 359.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Língua", 30, "FANTASMA", "FÍSICO"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Sombra Noturna", 60, "FANTASMA", "FÍSICO")
    )
)

val onix: Map<String, Any> = mapOf(
    "NOME" to "Onix",
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 189.0,
        "DEFESA" to 419.0,
        "ATAQUE_ESPECIAL" to 159.0,
        "DEFESA_ESPECIAL" to 159.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val drowzee: Map<String, Any> = mapOf(
    "NOME" to "Drowzee",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 195.0,
        "DEFESA" to 189.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val hypno: Map<String, Any> = mapOf(
    "NOME" to "Hypno",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 374.0,
        "ATAQUE" to 245.0,
        "DEFESA" to 239.0,
        "ATAQUE_ESPECIAL" to 279.0,
        "DEFESA_ESPECIAL" to 279.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val krabby: Map<String, Any> = mapOf(
    "NOME" to "Krabby",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 309.0,
        "DEFESA" to 279.0,
        "ATAQUE_ESPECIAL" to 149.0,
        "DEFESA_ESPECIAL" to 149.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val kingler: Map<String, Any> = mapOf(
    "NOME" to "Kingler",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 359.0,
        "DEFESA" to 329.0,
        "ATAQUE_ESPECIAL" to 199.0,
        "DEFESA_ESPECIAL" to 199.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val voltorb: Map<String, Any> = mapOf(
    "NOME" to "Voltorb",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 159.0,
        "DEFESA" to 199.0,
        "ATAQUE_ESPECIAL" to 209.0,
        "DEFESA_ESPECIAL" to 209.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL")
    )
)

val electrode: Map<String, Any> = mapOf(
    "NOME" to "Electrode",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 199.0,
        "DEFESA" to 239.0,
        "ATAQUE_ESPECIAL" to 259.0,
        "DEFESA_ESPECIAL" to 259.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL")
    )
)

val exeggcute: Map<String, Any> = mapOf(
    "NOME" to "Exeggcute",
    "TIPOS" to listOf("GRAMA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "PSÍQUICO", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VENENO", "VOADOR", "INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 179.0,
        "DEFESA" to 259.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)

val exeggutor: Map<String, Any> = mapOf(
    "NOME" to "Exeggutor",
    "TIPOS" to listOf("GRAMA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "PSÍQUICO", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VENENO", "VOADOR", "INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 394.0,
        "ATAQUE" to 289.0,
        "DEFESA" to 269.0,
        "ATAQUE_ESPECIAL" to 349.0,
        "DEFESA_ESPECIAL" to 349.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
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
        "ATAQUE" to 199.0,
        "DEFESA" to 289.0,
        "ATAQUE_ESPECIAL" to 179.0,
        "DEFESA_ESPECIAL" to 179.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Cavar", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val marowak: Map<String, Any> = mapOf(
    "NOME" to "Marowak",
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 259.0,
        "DEFESA" to 319.0,
        "ATAQUE_ESPECIAL" to 199.0,
        "DEFESA_ESPECIAL" to 199.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Cavar", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val hitmonlee: Map<String, Any> = mapOf(
    "NOME" to "Hitmonlee",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 339.0,
        "DEFESA" to 209.0,
        "ATAQUE_ESPECIAL" to 169.0,
        "DEFESA_ESPECIAL" to 169.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        2 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val hitmonchan: Map<String, Any> = mapOf(
    "NOME" to "Hitmonchan",
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 304.0,
        "ATAQUE" to 309.0,
        "DEFESA" to 259.0,
        "ATAQUE_ESPECIAL" to 169.0,
        "DEFESA_ESPECIAL" to 169.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val lickitung: Map<String, Any> = mapOf(
    "NOME" to "Lickitung",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 209.0,
        "DEFESA" to 249.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Língua", 30, "FANTASMA", "FÍSICO"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)

val koffing: Map<String, Any> = mapOf(
    "NOME" to "Koffing",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 289.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val weezing: Map<String, Any> = mapOf(
    "NOME" to "Weezing",
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 279.0,
        "DEFESA" to 339.0,
        "ATAQUE_ESPECIAL" to 269.0,
        "DEFESA_ESPECIAL" to 269.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val rhyhorn: Map<String, Any> = mapOf(
    "NOME" to "Rhyhorn",
    "TIPOS" to listOf("TERRA", "PEDRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 269.0,
        "DEFESA" to 289.0,
        "ATAQUE_ESPECIAL" to 159.0,
        "DEFESA_ESPECIAL" to 159.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Chifrada", 65, "NORMAL", "FÍSICO")
    )
)

val rhydon: Map<String, Any> = mapOf(
    "NOME" to "Rhydon",
    "TIPOS" to listOf("TERRA", "PEDRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "STATUS" to mapOf(
        "VIDA" to 414.0,
        "ATAQUE" to 359.0,
        "DEFESA" to 339.0,
        "ATAQUE_ESPECIAL" to 189.0,
        "DEFESA_ESPECIAL" to 189.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Chifrada", 65, "NORMAL", "FÍSICO")
    )
)

val chansey: Map<String, Any> = mapOf(
    "NOME" to "Chansey",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 704.0,
        "ATAQUE" to 109.0,
        "DEFESA" to 109.0,
        "ATAQUE_ESPECIAL" to 169.0,
        "DEFESA_ESPECIAL" to 169.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val tangela: Map<String, Any> = mapOf(
    "NOME" to "Tangela",
    "TIPOS" to listOf("GRAMA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VENENO", "VOADOR", "INSETO"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 209.0,
        "DEFESA" to 329.0,
        "ATAQUE_ESPECIAL" to 299.0,
        "DEFESA_ESPECIAL" to 299.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Chicote de Vinha", 35, "GRAMA", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
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
        "ATAQUE" to 289.0,
        "DEFESA" to 259.0,
        "ATAQUE_ESPECIAL" to 179.0,
        "DEFESA_ESPECIAL" to 179.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val horsea: Map<String, Any> = mapOf(
    "NOME" to "Horsea",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 179.0,
        "DEFESA" to 239.0,
        "ATAQUE_ESPECIAL" to 239.0,
        "DEFESA_ESPECIAL" to 239.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val seadra: Map<String, Any> = mapOf(
    "NOME" to "Seadra",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 289.0,
        "ATAQUE_ESPECIAL" to 289.0,
        "DEFESA_ESPECIAL" to 289.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val goldeen: Map<String, Any> = mapOf(
    "NOME" to "Goldeen",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 294.0,
        "ATAQUE" to 235.0,
        "DEFESA" to 219.0,
        "ATAQUE_ESPECIAL" to 169.0,
        "DEFESA_ESPECIAL" to 169.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val seaking: Map<String, Any> = mapOf(
    "NOME" to "Seaking",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 285.0,
        "DEFESA" to 229.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val staryu: Map<String, Any> = mapOf(
    "NOME" to "Staryu",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 189.0,
        "DEFESA" to 209.0,
        "ATAQUE_ESPECIAL" to 239.0,
        "DEFESA_ESPECIAL" to 239.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val starmie: Map<String, Any> = mapOf(
    "NOME" to "Starmie",
    "TIPOS" to listOf("ÁGUA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "PSÍQUICO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 249.0,
        "DEFESA" to 269.0,
        "ATAQUE_ESPECIAL" to 299.0,
        "DEFESA_ESPECIAL" to 299.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val mrMime: Map<String, Any> = mapOf(
    "NOME" to "Mr. Mime",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 284.0,
        "ATAQUE" to 189.0,
        "DEFESA" to 229.0,
        "ATAQUE_ESPECIAL" to 299.0,
        "DEFESA_ESPECIAL" to 299.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val scyther: Map<String, Any> = mapOf(
    "NOME" to "Scyther",
    "TIPOS" to listOf("INSETO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "ELÉTRICO", "GELO", "VOADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 319.0,
        "DEFESA" to 259.0,
        "ATAQUE_ESPECIAL" to 209.0,
        "DEFESA_ESPECIAL" to 209.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 50, "NORMAL", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Agulha Dupla", 25, "INSETO", "FÍSICO")
    )
)

val jynx: Map<String, Any> = mapOf(
    "NOME" to "Jynx",
    "TIPOS" to listOf("GELO", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("GELO", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("FOGO", "INSETO", "PEDRA", "FANTASMA", "SOMBRIO", "METÁLICO"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 199.0,
        "DEFESA" to 169.0,
        "ATAQUE_ESPECIAL" to 329.0,
        "DEFESA_ESPECIAL" to 329.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        3 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val electabuzz: Map<String, Any> = mapOf(
    "NOME" to "Electabuzz",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 265.0,
        "DEFESA" to 215.0,
        "ATAQUE_ESPECIAL" to 289.0,
        "DEFESA_ESPECIAL" to 289.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Soco", 40, "NORMAL", "FÍSICO")
    )
)

val magmar: Map<String, Any> = mapOf(
    "NOME" to "Magmar",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 289.0,
        "DEFESA" to 215.0,
        "ATAQUE_ESPECIAL" to 299.0,
        "DEFESA_ESPECIAL" to 299.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL"),
        3 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val pinsir: Map<String, Any> = mapOf(
    "NOME" to "Pinsir",
    "TIPOS" to listOf("INSETO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 349.0,
        "DEFESA" to 299.0,
        "ATAQUE_ESPECIAL" to 209.0,
        "DEFESA_ESPECIAL" to 209.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 50, "NORMAL", "FÍSICO"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Agulha Dupla", 25, "INSETO", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val tauros: Map<String, Any> = mapOf(
    "NOME" to "Tauros",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 354.0,
        "ATAQUE" to 299.0,
        "DEFESA" to 289.0,
        "ATAQUE_ESPECIAL" to 179.0,
        "DEFESA_ESPECIAL" to 179.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val magikarp: Map<String, Any> = mapOf(
    "NOME" to "Magikarp",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 244.0,
        "ATAQUE" to 119.0,
        "DEFESA" to 209.0,
        "ATAQUE_ESPECIAL" to 129.0,
        "DEFESA_ESPECIAL" to 129.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val gyarados: Map<String, Any> = mapOf(
    "NOME" to "Gyarados",
    "TIPOS" to listOf("ÁGUA", "VOADOR"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "LUTADOR", "INSETO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 394.0,
        "ATAQUE" to 349.0,
        "DEFESA" to 258.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL"),
        4 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO")
    )
)

val lapras: Map<String, Any> = mapOf(
    "NOME" to "Lapras",
    "TIPOS" to listOf("ÁGUA", "GELO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GELO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 464.0,
        "ATAQUE" to 269.0,
        "DEFESA" to 259.0,
        "ATAQUE_ESPECIAL" to 269.0,
        "DEFESA_ESPECIAL" to 269.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val ditto: Map<String, Any> = mapOf(
    "NOME" to "Ditto",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 296.0,
        "ATAQUE" to 195.0,
        "DEFESA" to 195.0,
        "ATAQUE_ESPECIAL" to 195.0,
        "DEFESA_ESPECIAL" to 195.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val eevee: Map<String, Any> = mapOf(
    "NOME" to "Eevee",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 314.0,
        "ATAQUE" to 209.0,
        "DEFESA" to 199.0,
        "ATAQUE_ESPECIAL" to 189.0,
        "DEFESA_ESPECIAL" to 189.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)

val vaporeon: Map<String, Any> = mapOf(
    "NOME" to "Vaporeon",
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "STATUS" to mapOf(
        "VIDA" to 464.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 219.0,
        "ATAQUE_ESPECIAL" to 319.0,
        "DEFESA_ESPECIAL" to 319.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val jolteon: Map<String, Any> = mapOf(
    "NOME" to "Jolteon",
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 229.0,
        "DEFESA" to 219.0,
        "ATAQUE_ESPECIAL" to 319.0,
        "DEFESA_ESPECIAL" to 319.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val flareon: Map<String, Any> = mapOf(
    "NOME" to "Flareon",
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 359.0,
        "DEFESA" to 219.0,
        "ATAQUE_ESPECIAL" to 289.0,
        "DEFESA_ESPECIAL" to 289.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val porygon: Map<String, Any> = mapOf(
    "NOME" to "Porygon",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "STATUS" to mapOf(
        "VIDA" to 334.0,
        "ATAQUE" to 219.0,
        "DEFESA" to 239.0,
        "ATAQUE_ESPECIAL" to 269.0,
        "DEFESA_ESPECIAL" to 269.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val omanyte: Map<String, Any> = mapOf(
    "NOME" to "Omanyte",
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 274.0,
        "ATAQUE" to 179.0,
        "DEFESA" to 299.0,
        "ATAQUE_ESPECIAL" to 279.0,
        "DEFESA_ESPECIAL" to 279.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val omastar: Map<String, Any> = mapOf(
    "NOME" to "Omastar",
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 344.0,
        "ATAQUE" to 219.0,
        "DEFESA" to 349.0,
        "ATAQUE_ESPECIAL" to 329.0,
        "DEFESA_ESPECIAL" to 329.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val kabuto: Map<String, Any> = mapOf(
    "NOME" to "Kabuto",
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 264.0,
        "ATAQUE" to 259.0,
        "DEFESA" to 279.0,
        "ATAQUE_ESPECIAL" to 209.0,
        "DEFESA_ESPECIAL" to 209.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val kabutops: Map<String, Any> = mapOf(
    "NOME" to "Kabutops",
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "TERRA"),
    "STATUS" to mapOf(
        "VIDA" to 324.0,
        "ATAQUE" to 329.0,
        "DEFESA" to 309.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val aerodactyl: Map<String, Any> = mapOf(
    "NOME" to "Aerodactyl",
    "TIPOS" to listOf("PEDRA", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FOGO", "VOADOR", "INSETO", "VENENO", "NORMAL"),
    "DESVANTAGENS" to listOf("ÁGUA", "ELÉTRICO", "GELO", "PEDRA", "METÁLICO"),
    "STATUS" to mapOf(
        "VIDA" to 364.0,
        "ATAQUE" to 309.0,
        "DEFESA" to 229.0,
        "ATAQUE_ESPECIAL" to 219.0,
        "DEFESA_ESPECIAL" to 219.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
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
        "ATAQUE" to 319.0,
        "DEFESA" to 229.0,
        "ATAQUE_ESPECIAL" to 229.0,
        "DEFESA_ESPECIAL" to 229.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val articuno: Map<String, Any> = mapOf(
    "NOME" to "Articuno",
    "TIPOS" to listOf("GELO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "ELÉTRICO", "PEDRA", "METÁLICO"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 269.0,
        "DEFESA" to 299.0,
        "ATAQUE_ESPECIAL" to 289.0,
        "DEFESA_ESPECIAL" to 289.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Nevoeiro", 40, "GELO", "ESPECIAL")
    )
)

val zapdos: Map<String, Any> = mapOf(
    "NOME" to "Zapdos",
    "TIPOS" to listOf("ELÉTRICO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "VOADOR", "INSETO", "GRAMA", "METÁLICO"),
    "DESVANTAGENS" to listOf("GELO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 279.0,
        "DEFESA" to 269.0,
        "ATAQUE_ESPECIAL" to 349.0,
        "DEFESA_ESPECIAL" to 349.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        4 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL")
    )
)

val moltres: Map<String, Any> = mapOf(
    "NOME" to "Moltres",
    "TIPOS" to listOf("FOGO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "LUTADOR", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "ELÉTRICO", "PEDRA"),
    "STATUS" to mapOf(
        "VIDA" to 384.0,
        "ATAQUE" to 299.0,
        "DEFESA" to 279.0,
        "ATAQUE_ESPECIAL" to 349.0,
        "DEFESA_ESPECIAL" to 349.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL"),
        3 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val dratini: Map<String, Any> = mapOf(
    "NOME" to "Dratini",
    "TIPOS" to listOf("DRAGÃO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "ELÉTRICO", "GRAMA"),
    "DESVANTAGENS" to listOf("GELO", "DRAGÃO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 282.0,
        "ATAQUE" to 227.0,
        "DEFESA" to 189.0,
        "ATAQUE_ESPECIAL" to 199.0,
        "DEFESA_ESPECIAL" to 199.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val dragonair: Map<String, Any> = mapOf(
    "NOME" to "Dragonair",
    "TIPOS" to listOf("DRAGÃO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "ELÉTRICO", "GRAMA"),
    "DESVANTAGENS" to listOf("GELO", "DRAGÃO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 322.0,
        "ATAQUE" to 267.0,
        "DEFESA" to 229.0,
        "ATAQUE_ESPECIAL" to 239.0,
        "DEFESA_ESPECIAL" to 239.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)

val dragonite: Map<String, Any> = mapOf(
    "NOME" to "Dragonite",
    "TIPOS" to listOf("DRAGÃO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "LUTADOR", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("GELO", "PEDRA", "DRAGÃO", "FADA"),
    "STATUS" to mapOf(
        "VIDA" to 382.0,
        "ATAQUE" to 367.0,
        "DEFESA" to 289.0,
        "ATAQUE_ESPECIAL" to 299.0,
        "DEFESA_ESPECIAL" to 299.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

val mewtwo: Map<String, Any> = mapOf(
    "NOME" to "Mewtwo",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "STATUS" to mapOf(
        "VIDA" to 416.0,
        "ATAQUE" to 319.0,
        "DEFESA" to 279.0,
        "ATAQUE_ESPECIAL" to 399.0,
        "DEFESA_ESPECIAL" to 399.0
    ),
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
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
            "ATAQUE" to 299.0,
            "DEFESA" to 299.0,
            "ATAQUE_ESPECIAL" to 299.0,
            "DEFESA_ESPECIAL" to 299.0
        ),
        "ATAQUES" to mapOf(
            1 to listOf("Pulsar Psíquico", 80, "PSÍQUICO", "ESPECIAL"),
            2 to listOf("Soco de Fogo", 75, "FOGO", "FÍSICO"),
            3 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO"),
            4 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL")
        )
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