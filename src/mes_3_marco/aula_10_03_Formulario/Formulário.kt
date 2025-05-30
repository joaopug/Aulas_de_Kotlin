package mes_3_marco.aula_10_03_Formulario

//Cria o objeto
val p: Pessoa = Pessoa()

fun main() {
    val imc = pedirInformacoes()
    println("Nome: ${p.nome}\nIdade: ${p.idade} anos\nPeso: ${p.peso} kg\nAltura: ${p.altura} cm")
    println("Seu IMC: $imc")
    println("Deseja repetir a pesquisa?\nS - Sim || N - Não")
    val escolha = readln()
    if (escolha != "N") {
        pedirInformacoes()
    }
}

fun pedirInformacoes(): Double {

    println("Me diga seu nome")
    p.nome = readln()
    println("Me diga sua idade (anos)")
    p.idade = readln().toInt()
    println("Me diga seu peso (kg)")
    p.peso = readln().toDouble()
    println("Me diga sua altura (cm)")
    p.altura = readln().toDouble()

    val imc: Double = calcIMC(p.peso, p.altura)

    return imc
}

fun calcIMC(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}

/*fun main() {
    var nome: String
    var idade: Int
    var peso: Double
    var altura: Double
    var IMC: Double
    var escolha: String
    println("Bem-vindo ao mega formulário de IMC")

    do {
        println("Me diga seu nome")
        nome = readln()
        println("Me diga sua idade (anos)")
        idade = readln().toInt()
        println("Me diga seu peso (kg)")
        peso = readln().toDouble()
        println("Me diga sua altura (cm)")
        altura = readln().toDouble()

        IMC = peso / (altura * altura)
        println("Nome: $nome  Idade: $idade Peso: $peso Altura: $altura")
        println("Seu IMC: $IMC")
        println("Deseja repetir a pesquisa?$\nS - Sim || N - Não")
        escolha = readln().toString()
    } while (escolha != "N")
}*/