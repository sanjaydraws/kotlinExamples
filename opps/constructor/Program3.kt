
// demo of secondary constructor
class Person {
    var fullName: String 

    constructor(fName: String){
        fullName = fName
        println("no parameter constructor run ")
        println("$fullName")
    }
    constructor(firstName: String, lastName: String) {
        fullName = "$firstName $lastName"
    }

    constructor(firstName: String, lastName: String, age: Int) {
        fullName = "$firstName $lastName ($age years old)"
    }
}

fun main() {
    var person1 = Person("Ishan Kishan")
    println(person1.fullName)
}
/**
no parameter constructor run 
Ishan Kishan
 * */