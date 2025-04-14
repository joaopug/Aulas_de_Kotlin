package mes_3_Marco.aula_17_03_Classe_Animal

//Herança: Permite que uma classe herde todos os atrivutos e metodos de uma outra classe
//Essa nossa classe é uma subclasse

class Gato: Animal() {
    val higiene: String = "Usa caixinha de areia"

    override fun somAnimal(): String {
        return "Miau, miau"
    }
}