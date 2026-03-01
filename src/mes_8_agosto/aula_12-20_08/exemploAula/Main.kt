package mes_8_agosto.`aula_12-20_08`.exemploAula

import mes_8_agosto.`aula_12-20_08`.exemploAula.Entidades.CaixaDAgua
import mes_8_agosto.`aula_12-20_08`.exemploAula.Entidades.Funcionario
import mes_8_agosto.`aula_12-20_08`.exemploAula.Entidades.Servico
import mes_8_agosto.`aula_12-20_08`.exemploAula.Enumeradores.Cor
import mes_8_agosto.`aula_12-20_08`.exemploAula.Enumeradores.Marca
import mes_8_agosto.`aula_12-20_08`.exemploAula.Enumeradores.Setor
import mes_8_agosto.`aula_12-20_08`.exemploAula.Enumeradores.Sexo
import java.math.BigDecimal

fun main() {
    val caixa = CaixaDAgua(
        20000,
        Cor.AZUL,
        266.0,
        BigDecimal("14400"),
        3.50,
        3.23,
        3.35,
        2.44,
        Marca.FORTLEV,
        true
    )

    val instalacao: Servico = Servico(
        "Instalar caixa d'água",
        "800.05".toBigDecimal(),
        Funcionario(
            "João",
            "000.00000..",
            salario = BigDecimal("2500.00"),
            sexo = Sexo.MASCULINO,
            experiencia = 3,
            idade = 20,
            telefone = "46944439939",
            setor = Setor.MONTAGEM,
            conta = Conta()
        )
    )
}