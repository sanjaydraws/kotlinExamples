// local inner class 
// class created inside a method is called 
// to invoke the methods of local inner class, you must instantiate this class inside the method.


private val data = 30 //instance variable
fun display() {
    class Local {
        fun msg() {
            println(data)
        }
    }
    val l = Local()
    l.msg()
}

fun main(args: Array<String>) {
        display()
}

