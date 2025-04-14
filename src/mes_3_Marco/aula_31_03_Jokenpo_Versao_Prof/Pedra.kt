package mes_3_Marco.aula_31_03_Jokenpo_Versao_Prof

class Pedra {
    fun luta(elemento: String): Int {
        if (elemento == "PAPEL") {//PERDE
            println("Você perdeu!")
            return -1
        }
        if (elemento == "TESOURA") {//GANHA
            println("Você ganhou!")
            return 1
        }
        println("Você empatou")
        return 0
    }
}