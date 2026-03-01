package semestre_4_2025.mes_8_agosto.aula_12_a_20_08.exemploAula.Entidades

import semestre_4_2025.mes_8_agosto.aula_12_a_20_08.exemploAula.Enumeradores.Setor
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