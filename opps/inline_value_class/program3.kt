interface Audible {
    fun makeSound(): String
}

@JvmInline
value class AnimalSound(val sound: String) : Audible {
    override fun makeSound(): String = "The animal says: $sound"
}

fun main() {
    val catSound = AnimalSound("Meow")
    val dogSound = AnimalSound("Woof")

    println(catSound.makeSound()) // Output: The animal says: Meow
    println(dogSound.makeSound()) // Output: The animal says: Woof
}