package mes_3_Marco.exercicios.ex5

import java.util.Calendar
import kotlin.concurrent.fixedRateTimer

val frasesMotivacionais = listOf(
    "Acredite no seu potencial.",
    "Um passo de cada vez.",
    "Você é mais forte do que pensa.",
    "Não desista agora.",
    "Grandes coisas levam tempo.",
    "Vá no seu ritmo, mas não pare.",
    "O impossível é só questão de opinião.",
    "Tudo começa com um sonho.",
    "Continue mesmo sem vontade.",
    "Sua jornada é única.",
    "Faça por você.",
    "Cada dia é uma nova chance.",
    "Errar faz parte do caminho.",
    "Foco, força e fé.",
    "Coragem é agir com medo mesmo.",
    "Seja sua própria motivação.",
    "Você está evoluindo, mesmo que devagar.",
    "Só quem tenta, vence.",
    "Sucesso é persistência.",
    "Vá além do que esperam de você.",
    "Orgulhe-se de cada pequena vitória.",
    "Um dia de cada vez.",
    "Disciplina vence a motivação.",
    "Confie no processo.",
    "Ninguém vai fazer por você.",
    "Plante hoje para colher amanhã.",
    "Faça acontecer.",
    "Desafios te tornam mais forte.",
    "Você é capaz.",
    "Não pare até se orgulhar."
)

val frasesDoDia = frasesMotivacionais.shuffled().take(24)

var ultimaHora = -1

fun main() {
    contador()
}

private fun contador() {
    fixedRateTimer("fraseACadaHora", initialDelay = 0L, period = 600_000L) {
        val agora = Calendar.getInstance()
        val horaAtual = agora.get(Calendar.HOUR_OF_DAY)

        if (horaAtual != ultimaHora) {
            ultimaHora = horaAtual
            val frase = frasesDoDia[horaAtual % frasesDoDia.size]
            println("A sua frase motivacional das ${horaAtual}h: $frase")
        }
    }
}