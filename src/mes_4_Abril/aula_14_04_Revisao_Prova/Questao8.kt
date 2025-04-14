package mes_4_Abril.aula_14_04_Revisao_Prova

fun main(){
    val listaNomes = mutableListOf<String>()
    val listaNomesDoMeio = mutableListOf<String>()
    val listaSobrenomes = mutableListOf<String>()

    do {
        println("Digite seu nome completo: ")
        val nomeCompleto = readln()

        println("Seu nome é composto? S/N")
        val resposta = readln().lowercase()
        if (resposta == "s" && nomeCompleto != "sair") {//Ele tem nome composto
            listaNomes.add(nomeCompleto.substringBefore(" "))//Quebro o nome
            //e fico somente com o que vem antes antes do espaço

            //JOÃO MATEUS SILVEIRA
            val aux = nomeCompleto.substringAfter(" ")//Virou MATEUS SILVEIRA (nome do meio + sobrenome)
            listaNomesDoMeio.add(aux.substringBefore(" "))//Apenas MATEUS agora (nome do meio)
            listaSobrenomes.add(aux.substringAfter(" "))// Apenas SILVEIRA (sobrenome)

        } else {//não tem nome composto
            listaNomes.add(nomeCompleto.substringBefore(" "))
            listaSobrenomes.add(nomeCompleto.substringAfter(" "))
        }
    }while (nomeCompleto != "sair")
    //Ordena as listas em ordem alfabética
    listaNomes.sort()
    listaNomesDoMeio.sort()
    listaSobrenomes.sort()

    println("Os nomes em ordem alfabética são: ")
    listaNomes.forEach { nome ->
        println("$nome -")
    }

    println("Os nomes do meio em ordem alfabética são: ")
    listaNomesDoMeio.forEach { nomeDoMeio ->
        println("$nomeDoMeio -")
    }

    println("Os sobrenomes em ordem alfabética são: ")
    listaSobrenomes.forEach { sobrenome ->
        println("$sobrenome -")
    }
}

//Jorge Antonio Memes
//Maria Antonieta Cavalas
//Mario Games Perolas