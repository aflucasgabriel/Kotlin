fun main(){

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.duo(other: String) = Pair(this, other)
    val myPair = "McLaren" duo "Lucas"
    println(myPair)                                 // tem a mesma função do "to" da variavel anterior



    class Person(val name: String){
        val likedPeople = mutableListOf<Person>()
        infix fun likes(other: Person) {likedPeople.add(other)}
    }

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia


}