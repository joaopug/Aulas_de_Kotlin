package mes_4_abril.aula_16_04_Pilhas_Filas_Listas.exerciciosFilaPilhas.ex1PilhaDeProdutos

class Produto(
    var nome: String = "",
    var validade: Long = 0,
    var quantidade: Int = 0
) {
    fun taVencido(currentTime: Long): Boolean {
        return currentTime >= validade
    }
}

