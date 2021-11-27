
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

data class Sum(val x :Int?, val y:Int?):Example1 {
    override fun open1(param1: Int) {
        print(y?.let { x?.plus(it) } ?: 0)
    }
}

// constructor of sealed class has two visibility protected(by default) or private
// public and internal not allowed
sealed class M1 :Example1 {

    constructor(){
        // protected
        println("by default it's protected")
    }
    private constructor(x: Int?):this(){
        println(this)
    }
    fun m(){
        println("this is f1 ")
    }
}
sealed class M2(val x:Int):Example1{
    // not necessary to override
}

// inherit sealed class
data class Minus(val x :Int?, val y :Int?):M1(x){
    init {
        println("x=$x  y=$y")
    }
    override fun open1(param1: Int) {

    }
}


fun main() {


    //    This type is sealed, so it can be inherited by only its own nested classes or objects
    /*
    val fi = object : Example {
        override fun open1(param1: Int) {
            TODO("Not yet implemented")
        }
    }     */

    O1.open1(3)
    val s =  Sum(2,3)
    s.open1(1) // 5


    val min = Minus(23,6)
    /**
    by default it's protected
    Minus(x=null, y=null)
    x=23  y=6

     * */
    // can't instantiate sealed class directly 





}