
// calling primary constructor of parent from child class
open class Parent(val name: String) {
    init {
        println("Initializing Parent with name: $name")
    }
}

class Child(name: String, val age: Int) : Parent(name) {
    init {
        println("Initializing Child with age: $age")
    }
}


fun main() {
    val child = Child("Alice", 30)
    // Output:
    // Initializing Parent with name: Alice
    // Initializing Child with age: 30
}
