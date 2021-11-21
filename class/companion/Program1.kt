
// companion objects
//An object declaration inside a class can be marked with the companion keyword:
// Only one companion object is allowed per class
class Klass {

    companion object Factory{
        const val TAG = "Klass"
        fun create(): Klass = Klass()
    }

}
class A {

    fun printTag(){
        print(TAG)
    }
    companion object {
       const val TAG = "A Class"
        fun create(): A = A()
    }
}

fun main() {
    val instance = Klass.create()
    println(instance) // classPack.companionObj.Klass@7b23ec81

    val x = A.Companion
    println(x) // classPack.companionObj.A$Companion@3feba861
    println(x.TAG) //A Class
    

}