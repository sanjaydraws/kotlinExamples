
// without implementation of hashcode
class Person(val name: String){
     
}

fun main() {
   // Creating a HashSet of Person objects
   val personHashSet = HashSet<Person>()

   // Adding Person objects to the HashSet
   val person1 = Person("Alice")
   val person2 = Person("Bob")
   println(person1.hashCode()) // 2093176254
   println(person2.hashCode()) //1389133897
   println(Person("Alice").hashCode()) // 1534030866
   println(Person("Alice").hashCode()) // 664223387



   personHashSet.add(person1)
   personHashSet.add(person2)
   personHashSet.add(Person("Alice"))
   personHashSet.add(Person("Alice"))

//     personHashSet.add(person1)

   for (person in personHashSet) {
       print("${person.name} ")
   } // Bob Alice Alice Alice
   println("Persons in HashSet: $personHashSet")
}