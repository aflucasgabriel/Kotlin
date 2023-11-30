fun main(){
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any){
        when (obj){
            1 -> println("One")
            "Hello" -> println("greeting")
            is Long -> println("Long")
            !is String -> println("Not a string")
            else -> println("unknown")
        }
}



class MyClass