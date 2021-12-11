

class Example() {


    var str:String? = null

    constructor(init:Example.() -> Unit):this(){
        print("Hello World ")
        print(this.init())
    }

    init {
        println("first init")
    }
    init {
        println("second init")
    }
    infix fun <T> String.to(value: T){

    }

    fun print(){
        
    }


}
fun invoke(p1: Example) :Unit{

}

fun main() {

    val e1 = Example()
    

    val e2 = Example{
        invoke(e1)
    }

}