
// by default all public
// protected not applicable for class
// protected keyword can be accessed in sub class but not in another class
// internal keyword access in same module or some other class
class TestClass{
    fun testing(){
        var person = User()
        print(person.c)
        print(person.d)
//        print(person.a) // private
//        print(person.b) // can't acces protected in another class
    }
}

open class User{
    private val a =1
    protected val b =2
    internal val c = 3
    public val d = 3

}
class Indian:User(){
    // a is not visible
    //b,c,d is visible
    fun test(){
        print(d)
    }
}

fun main() {
    val i = Indian()
    i.test()
}

// private only access in that file,not visible in another file
private fun f1(){}
private class X{}

// internal visible in same module
internal fun f2(){
    println(" function")
}
internal class Y{}