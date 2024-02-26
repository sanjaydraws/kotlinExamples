// Accessing Superclass Constructor:
open class Animal(val name: String) {
    open fun makeSound() {
        println("Generic animal sound")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        super.makeSound()
        println("Bark")
    }
}

fun main() {
    val dog = Dog("Buddy")
    println("Name: ${dog.name}")
    dog.makeSound()
    // Output:
    // Name: Buddy
    // Generic animal sound
    // Bark
}
