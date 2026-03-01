package mes_8_agosto.`aula_12-20_08`.exemploAula.Entidades

import mes_8_agosto.`aula_12-20_08`.exemploAula.Enumeradores.Sexo
import java.math.BigDecimal

class Cliente(
    nome: String,
    cpf: String,
    sexo: Sexo,
    idade: Int,
    telefone: String,
    saldo: Conta,
    val endereco: String,
    val comprouQuantasVezes: Int,
    val fidelizado: Boolean,
    val gastoTotal: BigDecimal,
    val temDividas: Boolean,
) : Pessoa(
    nome = nome,
    cpf = cpf,
    sexo = sexo,
    idade = idade,
    telefone = telefone,
    saldo = saldo
){
    override fun transacao(conta: Conta, aReceber: BigDecimal) {
        conta.saldo = conta.saldo.min(aReceber)
    }
}