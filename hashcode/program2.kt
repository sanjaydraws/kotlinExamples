
// Implementation of hashcode
class Person(val name: String) {
    override fun hashCode(): Int {
        return name.hashCode()
    }
}

fun main() {
    // Creating a HashSet of Person objects
    val personHashSet = HashSet<Person>()

    // Adding Person objects to the HashSet
    val person1 = Person("Alice")
    val person2 = Person("Bob")
    
   println(person1.hashCode()) // 63350368

   println(person2.hashCode()) //66965
   //hashcode is same because hashcode are generated on property
   println(Person("Alice").hashCode()) // 63350368
   println(Person("Alice").hashCode()) // 63350368

    personHashSet.add(person1)
    personHashSet.add(person2)
    personHashSet.add(Person("Alice"))
    personHashSet.add(Person("Alice"))

    for (person in personHashSet) {
        print("${person.name} ")
    } // Alice Bob

    println("\nPersons in HashSet: $personHashSet")
}
