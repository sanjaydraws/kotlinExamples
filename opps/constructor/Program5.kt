
// example of calling secondary constructor from another :
class Person {
    var fullName: String = ""
    var age: Int = 0

    // Secondary constructor #1
    constructor(firstName: String, lastName: String) {
        fullName = "$firstName $lastName"
    }

    // Secondary constructor #2 - calls the first constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
        fullName = "$fullName ($age years old)"
    }
}

fun main() {
    val person1 = Person("Alice", "Smith")
    println("Full Name: ${person1.fullName}, Age: ${person1.age}") // Output: Full Name: Alice Smith, Age: 0

    val person2 = Person("Bob", "Johnson", 25)
    println("Full Name: ${person2.fullName}, Age: ${person2.age}") // Output: Full Name: Bob Johnson (25 years old), Age: 25
}
