package mes_8_agosto.aula_12_08_13_08.exemploAula

import java.math.BigDecimal

class Funcionario (
    nome : String,
    cpf : String,
    sexo : String,
    idade : Int,
    telefone : String,
    val salario : BigDecimal,
    val experiencia : Int,
    val funcao : String,
) : Pessoa(
    nome = nome,
    cpf = cpf,
    sexo = sexo,
    idade = idade,
    telefone = telefone,
)