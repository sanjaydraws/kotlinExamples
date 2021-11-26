
sealed interface Example1{
    fun open1(param1 :Int)
}

sealed interface Example2{
    fun e1(param1 :Int)
}

object O1:Example1,Example2{
    override fun open1(param1: Int) {
        println("it 's open1")
    }

    override fun e1(param1: Int) {
        TODO("Not yet implemented")
    }
}

sealed class M1 :Example1 {
    fun m(){
        println("this is f1 ")
    }
}

fun main(args: Array<String>) {

    //    This type is sealed, so it can be inherited by only its own nested classes or objects
    /*
    val fi = object : Example {
        override fun open1(param1: Int) {
            TODO("Not yet implemented")
        }
    }     */

    O1.open1(3)


    
}

