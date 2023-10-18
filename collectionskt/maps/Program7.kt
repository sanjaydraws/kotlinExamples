fun main() {
    val ages = mapOf(
        "Alice" to 30,
        "Bob" to 25,
        "Charlie" to 35
    )

    // all() :
    val allAdults = ages.all { it.value >= 18 } // Are all people adults? true
    println("Are all people adults? $allAdults")

    // any()
    val hasTeenagers = ages.any { it.value < 18 }
    println("Are there any teenagers? $hasTeenagers")

    //asSequence
    val filteredAges = ages.asSequence().filter { it.value >= 30 }
    println(filteredAges.toList()) // [Alice=30, Charlie=35]

    //count
    val adultsCount = ages.count { it.value >= 18 }
    println("Number of adults: $adultsCount")// Number of adults: 3


    //filter
    val adults = ages.filter { it.value >= 18 }
    println(adults) // {Alice=30, Bob=25, Charlie=35}

    //filterKeys
    val adults2 = ages.filterKeys { it != "Charlie" }
    println(adults2)// {Alice=30, Bob=25}

    //filterNot
    val adults3 = ages.filterNot { it.value < 18 }
    println(adults3) // {Alice=30, Bob=25, Charlie=35}

    // filterNotTo()
    //Appends all entries not matching the given predicate into the given destination.
    val adults4 = mutableMapOf<String, Int>()
    ages.filterNotTo(adults4) { it.value < 18 }
    println(adults4)// {Alice=30, Bob=25, Charlie=35}

    //Appends all entries matching the given predicate into the mutable map given as destination parameter.
    val adults5 = mutableMapOf<String, Int>()
    ages.filterTo(adults5) { it.value >= 18 }
    println(adults5)//{Alice=30, Bob=25, Charlie=35}

    //filterValues
    val adultAges = ages.filterValues { it >= 18 }
    println(adultAges) // {Alice=30, Bob=25, Charlie=35}

    val names = mapOf(
        "Alice" to null,
        "Bob" to "Smith",
        "Charlie" to "Brown"
    )

    val firstNotNullLastName1 = names.values.firstNotNullOf { it }
    println("First not null last name: $firstNotNullLastName1") // First not null last name: Smith

    // Returns the first non-null value produced by transform if no value in map return null
    val firstNotNullLastName2 = names.values.firstNotNullOfOrNull { it }
    println("First not null last name: $firstNotNullLastName2")// First not null last name: Smith

    //flatMap()
    val fruitsToColors = mapOf(
        "apple" to listOf("red", "green"),
        "banana" to listOf("yellow"),
        "cherry" to listOf("red")
    )

    val allColors = fruitsToColors.flatMap { it.value }
    println(allColors)//[red, green, yellow, red]

    //flatMapTo()
    // each entry transfer to new map
    val allColors2 = mutableListOf<String>()
    fruitsToColors.flatMapTo(allColors2) { it.value  }
    println(allColors)
}
