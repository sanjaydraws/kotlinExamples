// inheriting anonymous objects from supertype 
open class Mouse{
    fun onMouseClicked(){
        println("MouseClicked")
    }
    fun onMouseMoved(){
        println("Mouse Moved ")
    }
}
class M1 {
    fun addMouseListener(object: Mouse){

    }
}

fun main(args: Array<String>) {
    val m = M1();
    val x =  m.addMouseListener(object:Mouse(){
       override fun onMouseClicked(){
            println("MouseClicked")
        }
      override  fun onMouseMoved(){
            println("Mouse Moved ")
        }
    })
    x.onMouseClicked()
    
}