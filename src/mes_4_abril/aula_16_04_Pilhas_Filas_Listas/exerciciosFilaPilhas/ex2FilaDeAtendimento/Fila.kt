package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.exerciciosFilaPilhas.ex2FilaDeAtendimento

import java.util.LinkedList

val fila = LinkedList<Paciente>()

var assentos: Int = 15

fun main() {
    val jorge = Paciente("Jorge", 20, 45.0, 1.70, 0.0, "1212121212")
    val maria = Paciente("Maria", 46, 68.0, 1.75, 0.0, "4545669969")
    val ana = Paciente("Ana", 30, 78.0, 1.70, 0.0, "9876543210")
    val lucas = Paciente("Lucas", 25, 95.0, 1.70, 0.0, "1122334455")
    val carla = Paciente("Carla", 52, 110.0, 1.70, 0.0, "9988776655")
    val marcos = Paciente("Marcos", 52, 125.0, 1.65, 0.0, "9988776655")

    val listaDePacientes = listOf(jorge, maria, ana, lucas, carla, marcos)

    addPacientes(listaDePacientes)

    while (true) {
        val primeiroNaFila = fila.peek()

        if (primeiroNaFila != null) {
            when {
                primeiroNaFila.imc >= 40.0 -> {
                    println(
                        "\nO(A) paciente ${primeiroNaFila.nome} foi chamado(a)\n" +
                                "Tempo de espera: 10 segundos"
                    )
                    Thread.sleep(10000)
                }

                primeiroNaFila.imc in 35.0..39.9 -> {
                    println(
                        "\nO(A) paciente ${primeiroNaFila.nome} foi chamado(a)\n" +
                                "Tempo de espera: 8 segundos"
                    )
                    Thread.sleep(8000)
                }

                primeiroNaFila.imc in 30.0..34.9 -> {
                    println(
                        "\nO(A) paciente ${primeiroNaFila.nome} foi chamado(a)\n" +
                                "Tempo de espera: 7 segundos"
                    )
                    Thread.sleep(7000)
                }

                primeiroNaFila.imc in 25.0..29.9 -> {
                    println(
                        "\nO(A) paciente ${primeiroNaFila.nome} foi chamado(a)\n" +
                                "Tempo de espera: 5 segundos"
                    )
                    Thread.sleep(5000)
                }

                primeiroNaFila.imc in 18.5..24.9 -> {
                    println(
                        "\nO(A) paciente ${primeiroNaFila.nome} foi chamado(a)\n" +
                                "Tempo de espera: 3 segundos"
                    )
                    Thread.sleep(3000)
                }

                else -> {
                    println(
                        "\nO(A) paciente ${primeiroNaFila.nome} foi chamado(a)\n" +
                                "Tempo de espera: 1 segundo"
                    )
                    Thread.sleep(1000)
                }
            }
            println("O(A) paciente ${primeiroNaFila.nome} foi atendido(a)\n")
            fila.removeFirst()
            assentos++
        }
        addPacientes(listaDePacientes)
        println("Pessoas na fila:")
        fila.forEachIndexed { i, paciente ->
            println("${i + 1}º ${paciente.nome}")
        }
        println("\nAssentos disponíveis: $assentos")
    }

}

private fun addPacientes(pacientes: List<Paciente>) {
    if (assentos > 3) {
        val quantidade = (1..3).random()
        repeat(quantidade) {
            val paciente = pacientes.random()
            calcIMC(paciente)
            fila.addLast(paciente)
            println("O(A) paciente ${paciente.nome} entrou na fila\n")
            Thread.sleep(5000)
            assentos--
        }
    }
}

fun calcIMC(paciente: Paciente) {
    val imc: Double = paciente.peso / (paciente.altura * paciente.altura)
    paciente.imc = imc
}