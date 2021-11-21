//e2

//Inheriting anonymous objects from supertypes

//Inheriting anonymous objects from supertypes
open class Mouse{
    open fun onMouseClicked(){
        println("MouseClicked")
    }
    fun onMouseMoved(){
        println("Mouse Moved ")
    }
}
class M1 {
    fun addMouseListener(mouse: Mouse){
        mouse.onMouseClicked()
    }

}

// if supertype has constructor , constructor parameter shoul be passed
// Multiple supertypes can be  specified as a comma-delimited list after the colon:
open class A(x:Int){
    open val y:Int? = x

}

interface B{
    fun funcB1()
}

fun main() {
    val m1 = M1()

    m1.addMouseListener(object : Mouse() {
        override fun onMouseClicked() {
//            super.onMouseClicked() //MouseClicked
            print("on Mouse overridden ") //on Mouse override
        }
    })



    val ab = object :A(11), B {
        override val y: Int?
            get() = super.y

        override fun funcB1() {
            println("B1 is here ")
        }
        val c = object {
            fun c1(){
                print("c1 is here")
            }
        }
    }

    println(ab.y) // 11
    ab.funcB1() // B1 is here
    ab.c.c1() //c1 is here



}