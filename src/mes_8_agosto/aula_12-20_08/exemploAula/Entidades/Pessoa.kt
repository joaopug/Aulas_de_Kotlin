package mes_8_agosto.`aula_12-20_08`.exemploAula.Entidades

import mes_8_agosto.`aula_12-20_08`.exemploAula.Enumeradores.Sexo
import java.math.BigDecimal

open class Pessoa (
    val nome : String,
    val cpf : String,
    val sexo : Sexo,
    val idade : Int,
    val telefone : String,
    saldo: Conta
) {
    open fun transacao(conta: Conta, aReceber: BigDecimal) {
        conta.saldo = conta.saldo.min(aReceber)
    }
}