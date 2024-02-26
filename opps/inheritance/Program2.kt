// 2.Accessing Superclass Properties:

open class Animal {
    open val sound: String = "Generic animal sound"
}

class Dog : Animal() {
    override val sound: String
        get() = super.sound + " and Bark"
}

fun main() {
    val dog = Dog()
    println(dog.sound) // Output: Generic animal sound and Bark
}
