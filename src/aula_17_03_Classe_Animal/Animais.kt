package aula_17_03_Classe_Animal
/*Toda Classe começa letra MAIÚSCULA
e segue o padrão CamelCase
Exemplo: MinhaClasse*/
fun main(){

    val gato: Gato = Gato()
    gato.nomeCientifico= "gato"
    gato.habitat = "domestico"
    gato.especie = "felino"
    gato.dieta = "peixe"

    println(gato.nomeCientifico)

    val cachorro = Cachorro()
    cachorro.nomeCientifico= "cachorro"
    cachorro.habitat = "domestico"
    cachorro.especie = "canino"
    cachorro.dieta = "bacon"

    println(cachorro.somAnimal())

    /*
        Jeito paia do objeto "gato" da classe "Gato" receber os valores do objeto agora apagado "animal":
        val gato : Gato = animal as gato
     */
    val animal = Animal()
    println(animal.somAnimal())
}