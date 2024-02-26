data class Person(val name: String, val age: Int, val address: String, /* ... other properties */) {
    // No need to manually override equals and hashCode
}

fun main() {
    //hashcode is same for same object in data class in regular class is different
    val person1 = Person("Alice", 25, "123 Main St",) // 2103224225
    val person2 = Person("Alice", 25, "123 Main St",) // 2103224225

    println(person1 == person2) // true, because data class automatically overrides equals
    println(person1.hashCode())
    println(person2.hashCode())
    println(person1 == Person("Alice", 25, "123 Main St",)) // true
    println(person1.equals(person2)) // true
} 
