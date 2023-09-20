// Pilha

class mutableStack<E>(vararg items: E){

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString()= "MutableStack(${elements.joinToString()})"


}

// funções genéricas

fun <E> MutableStackOf(vararg elements: E) = mutableStack(*elements)



fun main(){
/*
    val stack = mutableStack(0.62, 1.68, 5.37)
    println(stack)
    stack.push(0.5)
    println(stack)
    println("////////////////////////////////////////////////")
    println("peek(): ${stack.peek()}")
    println(stack)
    println("////////////////////////////////////////////////")

    for (i in 1..stack.size()){
        println("pop(): ${stack.pop()}")
        println(stack)
    }
*/
    val stack = mutableListOf(0.68, "Lucas", 9)
    println(stack)

}