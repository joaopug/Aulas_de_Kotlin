package mes_3_marco.aula_17_03_Classe_Animal

//Atividade: Crie uma classe animal
//Atributos: Nome Ciêntifico, Espécie, Dieta, Habitat
//Essa nossa classe é uma superclasse
//A palavra OPEN é usada para indicar que uma classe pode ser herdada.
/*ENCAPSULAMENTO: É uma forma de controle sobre
os atributos, quem pode acessar ou não*/
open class Animal {
    //Atributos
    var nomeCientifico = ""
    var especie = ""
    var dieta = ""
    var habitat = ""


    open fun somAnimal(): String {
        return "Faz um barulho"
    }
}