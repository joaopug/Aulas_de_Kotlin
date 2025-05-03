package mes_3_marco.aula_31_03_Jokenpo_Versao_Prof

class Tesoura {
    fun luta(elemento: String): Int {
        if (elemento == "PEDRA") {//PERDE
            println("Você perdeu!")
            return -1
        }
        if (elemento == "PAPEL") {//GANHA
            println("Você ganhou!")
            return 1
        }
        println("Você empatou")
        return 0
    }
}