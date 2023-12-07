
// calling secondary constructor of parent class from child class's secondary constructor
open class Parent {
    var firstName: String = ""
    var lastName: String = ""

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
        println("Parent Secondary Constructor Called")
    }
}

class Child : Parent {
    var age: Int = 0

    constructor(firstName: String, lastName: String, age: Int) : super(firstName, lastName) {
        this.age = age
        println("Child Secondary Constructor Called")
    }
}

fun main() {
    val child = Child("Alice", "Smith", 30)
    println("Name: ${child.firstName} ${child.lastName}, Age: ${child.age}")
}
/***
Parent Secondary Constructor Called
Child Secondary Constructor Called
Name: Alice Smith, Age: 30

 */