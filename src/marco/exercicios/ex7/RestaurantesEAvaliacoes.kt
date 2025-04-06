package marco.exercicios.ex7

val listaDeRestaurantes: MutableList<InformacoesDoRestaurante> = mutableListOf<InformacoesDoRestaurante>()


fun main() {
    val restaurante1 = InformacoesDoRestaurante()
    restaurante1.nome = "Guloso"
    restaurante1.endereco = "Rua dos Loucos, 123"
    restaurante1.especialidade = "Massas"
    listaDeRestaurantes.add(restaurante1)

    val restaurante2 = InformacoesDoRestaurante()
    restaurante2.nome = "O Rei do Espeto"
    restaurante2.endereco = "Avenida das Brasas, 456"
    restaurante2.especialidade = "Churrasco"
    listaDeRestaurantes.add(restaurante2)

    val restaurante3 = InformacoesDoRestaurante()
    restaurante3.nome = "Sushi no Capricho"
    restaurante3.endereco = "Travessa do Oriente, 789"
    restaurante3.especialidade = "Comida Japonesa"
    listaDeRestaurantes.add(restaurante3)

    println("\nLista de restaurantes:")
    listaDeRestaurantes.forEachIndexed { i, restaurante ->
        println(
            "\nRestaurante: ${i + 1}" +
                    "\nNome: ${restaurante.nome}" +
                    "\nEndereço: ${restaurante.endereco}" +
                    "\nEspecialidade: ${restaurante.especialidade}"
        )
    }

    println("\nÉ possível avaliar cada restaurante com uma nota de 1 a 5.\n")

    val cliente1 = Cliente("Alice")
    val cliente2 = Cliente("Bruno")
    val cliente3 = Cliente("Carlos")
    val cliente4 = Cliente("Diana")
    val cliente5 = Cliente("Eduardo")
    val cliente6 = Cliente("Fernanda")
    val cliente7 = Cliente("Gustavo")
    val cliente8 = Cliente("Helena")
    val cliente9 = Cliente("Igor")
    val cliente10 = Cliente("Juliana")

    cliente1.darNota(restaurante1, 4)
    cliente2.darNota(restaurante2, 5)
    cliente3.darNota(restaurante2, 3)
    cliente4.darNota(restaurante1, 4)
    cliente5.darNota(restaurante3, 5)
    cliente6.darNota(restaurante2, 5)
    cliente7.darNota(restaurante2, 4)
    cliente8.darNota(restaurante3, 3)
    cliente9.darNota(restaurante3, 4)
    cliente10.darNota(restaurante1, 5)

    println("\nMédia do ${restaurante1.nome}: ${restaurante1.nota}" +
            "\nMédia do ${restaurante2.nome}: ${restaurante2.nota}" +
            "\nMédia do ${restaurante3.nome}: ${restaurante3.nota}")
}

