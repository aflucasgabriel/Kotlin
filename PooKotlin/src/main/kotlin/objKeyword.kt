fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit{
    val dayRates = object {
        var standardDays: Int = 30 * standardDays
        var festivityDays: Int = 50 * festivityDays
        var specialDays: Int = 10 * specialDays
    }
    val total = dayRates.standardDays + dayRates.festivityDays + dayRates.specialDays

    print("Total price: $$total")

}

object DoAuth{
    fun takeParams(username: String, password: String){
        println("input Auth parameters = $username:$password")
    }
}

class BigBen(){
    companion object Bonger{
        fun getBongs(nTimes: Int){
            for (i in 1.. nTimes){
                println("Bong")
            }
        }
    }
}

fun main(){
    // rentPrice(10, 5, 1)

    //DoAuth.takeParams("foo", "mama")

    BigBen.getBongs(12)

}