data class Personn(var name: String, var age: Int, var about: String){
    constructor() : this("", 0, "")

}

fun writeCreationLog(p: Personn){
    println("A new person ${p.name} was created.")
}

fun main(){
    val jake = Personn("Jake", 30, "Android Developer")
        .also {
            writeCreationLog(it)
        }
}









