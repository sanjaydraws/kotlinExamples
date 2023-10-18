

fun main() {
    val personWithAge = mutableMapOf(
        "Alice" to 30,
        "Bob" to 25,
        "Charlie" to 35
    )

    // maxByOrNull : return map entry
    val oldestPerson = personWithAge.maxByOrNull {
        it.value
    }
    println("The oldest person is ${oldestPerson?.key}") // The oldest person is Charlie


//    maxOf()
    //  if no element get exception  java.util.NoSuchElementException
    val maxAge1 = personWithAge.maxOf { it.value}
//    val maxAge = personWithAge.values.maxOf { it }
    println("The maximum age is $maxAge1") // The maximum age is 35


//    maxOfOrNull() - if no element return null
    val maxAge2 = personWithAge.values.maxOfOrNull { it }

    println("The maximum age is $maxAge2") // The maximum age is 35


    //maxWithOrNull : allows you to find the maximum element based on a custom comparison
    // return null if there are no entries.
    val oldestPerson2 = personWithAge.maxWithOrNull(compareBy { it.value })
    println("The oldest person is ${oldestPerson2?.key}") // The oldest person is Charlie


    val youngestPerson1 = personWithAge.minByOrNull { it.value }

    println("The youngest person is ${youngestPerson1?.key}") // The youngest person is Bob


    val minAge1 = personWithAge.minOf { it.value }
    println("$minAge1") // 25

    val minAge2 = personWithAge.minOfOrNull { it.value }
    println("The minimum age is $minAge2") // The minimum age is 25



    val youngestPerson2 = personWithAge.minWithOrNull(compareBy { it.value })
    println(youngestPerson2?.key) // Bob

    // minus :return new map and remove keypair
    // no changes in existing map
    val newPersons =  personWithAge.minus("Bob")
    println(newPersons) // {Alice=30, Charlie=35}

    // plus : return new map and add key-value pair
    // no changes in existing map
    val newPerson2 =  personWithAge.plus("Bob" to 3)
    println(newPerson2) // {Alice=30, Bob=3, Charlie=35}
    println(personWithAge) // {Alice=30, Bob=25, Charlie=35}

    val isTeenager = personWithAge.none { it.value < 20 }
    println(isTeenager) // true

    // to check map  is Empty or null or not empty
    val ages: Map<String, Int>? = mutableMapOf()
    println(personWithAge.isEmpty()) // false
    println(personWithAge.isNotEmpty()) // true
    println(ages.isNullOrEmpty())// true

    val sortedAges = personWithAge.toSortedMap(compareBy { it })

    println(sortedAges) // {Alice=30, Bob=25, Charlie=35}

    val defaultAges = personWithAge.withDefault { 0 }

    println(defaultAges["David"]) // null

}
