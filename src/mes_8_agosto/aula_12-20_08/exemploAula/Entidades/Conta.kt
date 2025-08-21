package mes_8_agosto.`aula_12-20_08`.exemploAula.Entidades

import mes_8_agosto.`aula_12-20_08`.exemploAula.Enumeradores.Agencia
import java.math.BigDecimal

open class Conta (
    var saldo: BigDecimal,
    val titular: Pessoa,
    val numero: Int,
)