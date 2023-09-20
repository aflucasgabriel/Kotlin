
fun printMessage(message: String){
    println(message)

}

fun printMessageWithPrefix(message: String, prefix: String = "info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int{
    return x + y
}

fun multiply(x: Int, y: Int) = x * y


fun main() {
    //printMessage("Ola")
    //printMessageWithPrefix("Ola","Log")
    //printMessageWithPrefix("Ola")
    //printMessageWithPrefix(prefix = "log", message = "Ola")
    println(sum(5, 5))
    println(multiply(10, 2))

}





