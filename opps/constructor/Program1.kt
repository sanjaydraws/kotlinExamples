
// demo of primary constructor
class Person(firstName: String, lastName: String, age: Int) {
    // Properties defined in the primary constructor.
    val fullName: String
    
    init {
        // Code inside init block is executed when an instance is created.
        fullName = "$firstName $lastName"
    }
}
