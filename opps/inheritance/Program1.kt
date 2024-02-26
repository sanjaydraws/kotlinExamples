
// calling super class method
open class Animal {
    open fun makeSound() {
        println("Generic animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        super.makeSound() // Call the makeSound method of the superclass
        println("Bark")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound()
    // Output:
    // Generic animal sound
    // Bark
}
