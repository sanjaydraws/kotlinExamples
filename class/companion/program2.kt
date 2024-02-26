interface MyInterface {
    fun interfaceMethod()
}

open class MyBaseClass {
    open fun baseMethod() {
        println("Base method")
    }
}

class MyClass {
    companion object : MyInterface, MyBaseClass() {
        override fun interfaceMethod() {
            println("Implemented interface method in companion object.")
        }

        override fun baseMethod() {
            println("Overridden base method in companion object.")
        }

        // Additional properties and methods of the companion object
        val companionProperty = "Companion Property"

        fun companionMethod() {
            println("Companion Method")
        }
    }
}
