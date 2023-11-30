fun main(){
/*
    for (i in 'a'..'d'){
        print(i)
    }
    print(" ")

    for (i in 'z' downTo 's' step 2){
        print(i)
    }
    print(" ")
  */

    val x = 2
    if (x in 1..5){
        print("X is in range from 1 to 5")
    }
    println()

    if (x !in 6..10){
        print("X isn't in range from 6 to 10")
    }


}