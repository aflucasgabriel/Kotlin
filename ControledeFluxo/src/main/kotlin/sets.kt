// não sao ordenados e n permite dados duplicados

val openInssue: MutableSet<String> = mutableSetOf("descrição unica1", "descrição unica2", "descrição unica3")

fun addInssue(newInssue: String): Boolean{
    return openInssue.add(newInssue)
}

fun getStatusLog(isAdded: Boolean): String{
    return if(isAdded) "registered correctly" else "marked as duplicated and rejected"

}


fun main(){
    val aNewInssue: String = "descrição unica4"
    val anInssueAlredyIn: String = "descrição unica1"

    println("Inssue $aNewInssue ${getStatusLog(addInssue(aNewInssue))}")
    println("Inssue $anInssueAlredyIn ${getStatusLog(addInssue(anInssueAlredyIn))}")



}