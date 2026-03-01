package mes_8_agosto.`aula_12-20_08`.exemploAula.Entidades

import mes_8_agosto.`aula_12-20_08`.exemploAula.Enumeradores.Setor
import java.math.BigDecimal

class Servico(
    val descricao: String,
    val valor: BigDecimal,
    val funcionario: Funcionario,
){
    fun instalarCaixaDAgua(profissional: Funcionario): Boolean{
        if (profissional.setor == Setor.FINANCEIO){
            return true
        }
        return false
    }
}