enum class State{
    IDLE, RUNNING, FINISHED
}

enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0X0000FF),
    YELLOW(0xFFFF00);

    fun containsRED() = (this.rgb and 0xFF0000 != 0)


}

fun main(){
    /*val state = State.IDLE
    val message = when(state){
        State.IDLE -> "It´s idle."
        State.RUNNING -> "It´s running."
        State.FINISHED -> "It´s finished."

    }

    print(message)
*/
    val red = Color.RED
    println(red)
    println(red.containsRED())
    println(Color.BLUE.containsRED())
    println(Color.YELLOW.containsRED())


}