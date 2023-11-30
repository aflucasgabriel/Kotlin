// filter

fun main(){
    val numbers = listOf(-1, 2, -3, 4, -5, 6)

    val positives = numbers.filter { x -> x > 0 } // x recebe os numeros positivos

    val negatives = numbers.filter { it < 0 } // x recebe os numeros negativos

    val even = numbers.filter { x -> x % 2 == 0 } // x recebe os numeros pares

    val doubled = numbers.map { x -> x * 2 } // multiplica todos os numeros da lista por 2

    val tripled = numbers.map { it * 3 } // multiplica todos os numeros da lista por 3

    println("Numbers: $numbers")
    println("Numbers doubled: $doubled")
    println("Numbers tripled: $tripled")



}

// existe o any, all e none. Find and findlast