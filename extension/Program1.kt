
// Qualified  this access this from an outer class
class A{
    val x = 2
    fun A.printObj(){
        println(this@A) // expression.A@2f4d3709
        println(this) //expression.A@2f4d3709

    }

    fun Int?.ex(){}
    fun  fun1 (){
        x.ex()
    }
    inner class B{
        val  i:Int = 23
        fun Int.example(){
            val a = this@A // A's this
            val b = this@B // B's this
            val c = this // example()'s this, an Int
            val d = this@example // example()'s receiver, an Int
            println("c ${c}") //23
            println("d ${this@example}") // 23
            println("b ${b}") // expression.A$B@6e8cf4c6
            println("a ${a}") // expression.A@34a245ab


            val funLit = lambda@ fun String.(){
                val e = this // funLit's receiver
                println(e)
            }
            funLit.invoke("Hello World ")


            val funList2 = { s:String->
               // example's receiver , since after enclosing lambda expression
                val e1 = this
            }
        }
        fun exampleFun(){
            i.example()
        }
    }
}

val  retLam = lambda@ fun String.(name:String){
    println("${this} ${name}") // this represents firstArgument
}

fun main(){
    val a = A()
    /**
     * access extension outside of the class
     * */
    with(a) {
        this.printObj()
    }

    withCustom(a){
        this.printObj()
    }


    with(a.B()){
        this.i.example()
    }

    retLam.invoke("Hello", "World")
}

public inline fun <T, R> withCustom(receiver: T, block: T.() -> R) {

    receiver.block()
//    block.invoke(receiver)
}