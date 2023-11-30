fun customPrint(s: String){
    print(s.uppercase())
}

fun main(){
    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    fun printNonNull(str: String?){
        println("Printing \"$str\":")

        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    printNonNull(null)
    printNonNull("My string")

    fun printIfBothNonNull(strOne: String?, strTwo: String?){
        strOne?.let {firstString -> // nomeação do parametro it
            strTwo?.let {secondString ->
                customPrint("$firstString : $secondString")
                println()

            }

        }

    }

    printIfBothNonNull("First", "Second")





}






