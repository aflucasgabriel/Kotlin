class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalVoterException::class)
fun vote(name: String, age: Int){
    if(age <16){
        throw IllegalVoterException("$name can´t vote. Only people over 16 years can vote.")
    }
    println("Voto de $name realizado com sucesso!")
}


fun main(){

    vote("Lucas", 21)
    vote("Maria", 15)



}