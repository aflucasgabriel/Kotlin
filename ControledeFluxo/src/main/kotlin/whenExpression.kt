fun main(){
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyName()))


}

fun whenAssign(obj: Any): Any{
    val result = when (obj){
        1 -> "one"
        "Hello" -> 1 // quando uma condição é verdadeira, ele ignora as outras
        is Long -> false
        else -> 42

    }
    return result
}

class MyName
