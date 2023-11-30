sealed class Mammal(val name: String)

class Cat(val catName: String): Mammal(catName)
class Human(val humanName: String, val job: String): Mammal(humanName)

fun greatMamal(mamal: Mammal): String{
    when (mamal){
        is Human -> return "Hello ${mamal.name}; You are working as a ${mamal.job}"
        is Cat -> return "Hello ${mamal.name}"
    }
}

fun main(){
    val cat = Cat("Snowy")
    val human = Human("John", "developer")
    println(greatMamal(cat))
    println(greatMamal(human))

}