package semestre_4_2025.mes_8_agosto.aula_12_a_20_08.exemploAula.Entidades

import java.math.BigDecimal

open class Conta (
    var saldo: BigDecimal,
    val titular: Pessoa,
    val numero: Int,
)