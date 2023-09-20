import org.jetbrains.annotations.NotNull

fun main (){
    /*
    var neverNull: String = "Can´t be null"

    // neverNull = null / vai dar erro

    var nullable: String? = "Can be null" // o "?" possibilita a nulidade

    nullable = null // sem erro

    var inferredNonNull = "Compiler assumes non-null" // caso nao tenha inferencia de tipos, o compilador assume
                                                      // que a variavel é não nula, pois tem valor

   // inferredNonNull = null / vai dar erro

    fun strLength(str: String?): Int {
        return str?.length ?: 0 // elvis operator: caso o valor nao existir, ele retorna 0;
    }

    println(strLength(neverNull))
    println(strLength(nullable))
*/

    fun describeString(maybeString: String?): String{
        if (maybeString != null && maybeString.length > 0){
            return "String of length ${maybeString.length}"
        }else{
            return "Empty or null string"
        }

    }
    println(describeString(null))
    println(describeString(""))
    println(describeString("Ola mundo"))

}