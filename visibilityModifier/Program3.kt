internal open class InternalClass {
    // Internal property
    internal var count: Int = 0

    // Internal function
    internal fun increment() {
        count++
    }
}

// if extending internal then you mark subclass by internal or private
internal class Hello : InternalClass() {
    fun h1() {
        // Code for h1() function
    }
}

fun main() {
    val helloObject = Hello()
    helloObject.increment() // Accessing the internal function from the superclass
    println("Count: ${helloObject.count}") // Accessing the internal property from the superclass
    helloObject.h1() // Calling the function specific to the Hello subclass
}
