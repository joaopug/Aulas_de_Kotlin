package mes_3_marco.exercicios.ex4

fun main(){
    println("\nContador de Termos 2000" +
            "\n\nQual é o texto?")
    val texto = readln()

    println("\nQual é o termo que deseja pesquisar no texto?")
    val termo = readln()

    val pesquisador = Regex("\\b${Regex.escape(termo)}\\b")
    val contagem = pesquisador.findAll(texto).count()

    println("\nO termo \"$termo\" se repete $contagem veze(s).")
}