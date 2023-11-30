class Animal(val name: String)

class Zoo(val animals: List<Animal>){

operator fun iterator(): Iterator<Animal> {
    return animals.iterator()
    }
}

fun main(){
    val aniamais = listOf(Animal("Zebra"), Animal("Lion"), Animal("Monkey"))
    val zoo = Zoo(aniamais)
    for (animal in zoo){
        println("Watch out! Its a ${animal.name}!")
    }
}