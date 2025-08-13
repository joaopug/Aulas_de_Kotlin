package mes_8_agosto.aula_12_08_13_08.exemploAula

import java.math.BigDecimal

fun main() {
    val caixa = caixaDAgua(
        20000,
        "Azul",
        266.0,
        BigDecimal("14400"),
        3.50,
        3.23,
        3.35,
        2.44,
        "FortLeve",
        true
    )

    val instalacao: Servico = Servico(
        "Instalar caixa d'água",
        "800.05".toBigDecimal(),
        Funcionario(
            "João",
            "000.00000..",
            salario = BigDecimal("2500.00"),
            sexo = "Macho",
            experiencia = 3,
            funcao = "Instalador de caixas (de água)",
            idade = 20,
            telefone = "46944439939"
        )
    )
}