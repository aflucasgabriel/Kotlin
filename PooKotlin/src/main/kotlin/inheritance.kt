open class Dog{
    open fun sayHello(){
        println("wow wow")
    }
}

class Yorkshire : Dog(){
    override fun sayHello() {
        println("wif wif")
    }
}

open class Tiger(val origin: String){
    fun sayHello(){
        println("A tiger from $origin say grhhhh")
    }
}

class SiberianTiger: Tiger("Siberian")


fun main(){
    /*
    val dog: Dog = Dog()
    dog.sayHello()

    val dog1: Dog = Yorkshire()
    dog1.sayHello()
    */
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}


