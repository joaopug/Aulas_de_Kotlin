package mes_8_agosto.aula_12_08_13_08.exemploAula

import java.math.BigDecimal

class Cliente(
    nome: String,
    cpf: String,
    sexo: String,
    idade: Int,
    telefone: String,
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
)