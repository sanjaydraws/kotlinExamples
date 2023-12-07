// Kotlin program of calling one constructor from another:
// calling primary constructor from  Secondary constructor 
class Person(val firstName: String, val lastName: String, val age: Int) {
    val fullName: String

    // Primary constructor with initialization logic
    init {
        fullName = "$firstName $lastName"
    }

    // Secondary constructor that calls the primary constructor
    constructor(firstName: String, lastName: String) : this(firstName, lastName, 0)
}
fun main() {
    val person1 = Person("Alice", "Smith", 30)
    println("Full Name: ${person1.fullName}") // Output: Full Name: Alice Smith

    val person2 = Person("Bob", "Johnson")
    println("Full Name: ${person2.fullName}") // Output: Full Name: Bob Johnson
}

