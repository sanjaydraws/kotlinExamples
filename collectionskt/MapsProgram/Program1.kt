package collectionKt.list.MapsProgram

fun main() {
    val inputMap = mapOf(
        "Raj" to 10,
        "Ravindra" to 9,
        "Sain" to 15,
        "Yaspal" to 2,
        "Suraj" to 32
    )

    // Method 1:
    //    println(inputMap.toList()) //[(Raj, 10), (Ravindra, 9), (Sain, 15), (Yaspal, 2), (Suraj, 32)]

    // Sort by keys in ascending order
    val sortedByKey = inputMap.toList().sortedBy { it.first }.toMap()

    // Sort by values in ascending order
    val sortedByValue = inputMap.toList().sortedBy { it.second }.toMap()

    // Sort by values in descending order
    val sortedByValueDescending = inputMap.toList().sortedByDescending { it.second }.toMap()


    println("Sorted by key (ascending): $sortedByKey")
    println("Sorted by value (ascending): $sortedByValue")
    println("Sorted by value (descending): $sortedByValueDescending")

    // Method 2:
    // Sort by keys in ascending order
    val sortedByKey1 = inputMap.toSortedMap()

    // Sort by values in ascending order
    val sortedByValue1 = inputMap.entries.sortedBy { it.value }.associate { it.key to it.value }

    println("Sorted by key (ascending): $sortedByKey1") // {Raj=10, Ravindra=9, Sain=15, Suraj=32, Yaspal=2}
    println("Sorted by value (ascending): $sortedByValue1") //  {Yaspal=2, Ravindra=9, Raj=10, Sain=15, Suraj=32}
}
