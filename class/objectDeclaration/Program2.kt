/*  Object declarations can't be local (i.e. be nested directly inside a function), but they can be nested into other
    object declarations or non-inner classes.
 object declaration is not an expression, and cannot be used on the right hand side of an assignment
statement.
Object declaration's initialization is thread-safe and done at first access.
*/

 
object Example1{
    fun f1() {
        print("f1")
    }
}
 

sealed  interface E1 {
    fun f1()
}
object Example2:E1{
    override fun f1(){

    }
}

fun main(args: Array<String>) {
    Example1.f1()

}