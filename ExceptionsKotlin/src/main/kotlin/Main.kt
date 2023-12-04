
/*
fun main() {
    val a = 10
    val b = 0

    try {
        val divisao = a/b
        println(divisao)
    }catch(e: ArrayIndexOutOfBoundsException){
        println("Ocorreu um erro no Array!") //caso a exceção não se encaixe no 1° catch, ele parte para o prox.
    }catch(e: ArithmeticException){
        println("Ocorreu uma exceção aritmética!")
    } finally { //sempre vai excecutar, independente de erro ou nao
        println("Finnaly executado!")
    }
*/ //try como uma expression
/*
    val divisao = try { a / b } catch (e: ArithmeticException) { null }
    println(divisao)

*/// throw as a expression

data class Person(val name: String?)

fun fail(message: String): Nothing{
    throw IllegalArgumentException(message)
}

fun main(){

    val person = Person(null)
    val s = person.name ?: fail("name required")

    println(s)


}