package semestre_4_2025.mes_8_agosto.aula_12_a_20_08.exemploAula.Entidades

import semestre_4_2025.mes_8_agosto.aula_12_a_20_08.exemploAula.Enumeradores.Setor
import semestre_4_2025.mes_8_agosto.aula_12_a_20_08.exemploAula.Enumeradores.Sexo
import java.math.BigDecimal

class Funcionario(
    nome: String,
    cpf: String,
    sexo: Sexo,
    idade: Int,
    telefone: String,
    saldo: Conta,
    val salario: BigDecimal,
    val experiencia: Int,
    val setor: Setor
) : Pessoa(
    nome = nome,
    cpf = cpf,
    sexo = sexo,
    idade = idade,
    telefone = telefone,
    saldo = saldo
){
    fun instalarCaixaDAgua(profissional: Funcionario): Boolean{
        if (profissional.setor == Setor.FINANCEIO){
            return true
        }
        return false
    }
    override fun transacao(conta: Conta, aReceber: BigDecimal) {
        conta.saldo = conta.saldo.add(aReceber)
    }
}