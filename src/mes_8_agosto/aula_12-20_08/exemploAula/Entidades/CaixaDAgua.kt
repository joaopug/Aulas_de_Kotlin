package mes_8_agosto.`aula_12-20_08`.exemploAula.Entidades

import mes_8_agosto.`aula_12-20_08`.exemploAula.Enumeradores.Cor
import mes_8_agosto.`aula_12-20_08`.exemploAula.Enumeradores.Marca
import java.math.BigDecimal

class CaixaDAgua(
    val capacidade: Int,
    val cor: Cor,
    val peso: Double,
    val preco: BigDecimal,
    val alturaComTampa: Double,
    val alturaSemTampa: Double,
    val diametroSuperior: Double,
    val diametroInferior: Double,
    val marca: Marca,
    val ambienteExterno: Boolean
)