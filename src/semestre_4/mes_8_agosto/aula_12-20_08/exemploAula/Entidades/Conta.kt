package semestre_4.mes_8_agosto.`aula_12-20_08`.exemploAula.Entidades

import java.math.BigDecimal

open class Conta (
    var saldo: BigDecimal,
    val titular: Pessoa,
    val numero: Int,
)