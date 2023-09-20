fun main(){

    fun printALL(vararg messages: String){
        for(m in messages ) println(m)

    }

    printALL("Hello", "Ola", "Salut")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for(m in messages) println(prefix + m)
    }

    printAllWithPrefix("Hello", "Ola", "Salut", prefix = "Saudação: ")

    fun Log(vararg entries: String){
        printALL(*entries) // o * faz com que a var entries seja lida como vararg e nao array
    }
    Log("Hello", "Ola", "Salut")


}