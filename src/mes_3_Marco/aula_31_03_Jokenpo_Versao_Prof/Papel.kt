package mes_3_Marco.aula_31_03_Jokenpo_Versao_Prof

class Papel {
    fun luta(elemento: String): Int {
        if (elemento == "Tesoura") {//PERDE
            println("Você perdeu!")
            return -1
        }
        if (elemento == "Pedra") {//GANHA
            println("Você ganhou!")
            return 1
        }
        println("Você empatou")
        return 0
    }
}