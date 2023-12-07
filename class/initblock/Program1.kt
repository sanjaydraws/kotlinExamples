class Person(val firstName: String, val lastName: String) {
    val fullName: String

    // this block it will run every time new instance created
    init {
        fullName = "$firstName $lastName"
        println(fullName)
    }
     companion object {
        init {
            // Code inside this block will be executed when the class is loaded.
            // only run first time when class accessed
            println("Static initialization  ")
        }
    }
}


fun main() {
    val person = Person("justin", "bieber")
    println(person)
}
/**
 Static initialization  
justin bieber
Person@12edcd21
 * */