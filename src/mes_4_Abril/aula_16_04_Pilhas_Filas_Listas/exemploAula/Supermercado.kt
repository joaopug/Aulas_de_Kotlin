package mes_4_Abril.aula_16_04_Pilhas_Filas_Listas.exemploAula

import java.util.*

fun main(){
    /*val pilha = LinkedList<String>()

    //Prateleira de produtos
    pilha.push("Sardinha")
    pilha.push("Milho")
    pilha.push("Molho de Tomate")

    //Acessar primeiro elemento da Pilha
    println(pilha.peek())

    //Ver tamanho da Pilha
    println(pilha.size)

    //Remover elemento da prateleira
    val esgotado = pilha.pop()
    println("Produto esgotado: $esgotado")
    println("Novo produto no topo da pilha: ${pilha.peek()}")

    //Verifica se existem produtos na prateleira (Pilha)
    if(pilha.isEmpty()){
        println("Acabou os produtos!")
    } else {
        println("Ainda existem produtos!")
    }
*/
    //Criação de uma FILA
    val fila = LinkedList<String>()

    //Adicionar usuários
    fila.addLast("Joãozinho")
    fila.addLast("Mariazinha")
    fila.addLast("Pedrinho")

    //Ver o primeiro usuário da Fila
    println("Primeiro usuário na fila:\n${fila.peek()}\n")

    //Ver todos os usuários da Fila
    println("Usuários na fila:\n$fila\n")

    do{
        //Faz duas coisas ao mesmo, imprime o usuário e remove ele
        println("O user ${fila.removeFirst()} entrou no servidor\n")
        Thread.sleep(1000)//Faz o processador parar por 1 segundo
    } while(fila.isNotEmpty()) //Vê se tem gente na fila
}