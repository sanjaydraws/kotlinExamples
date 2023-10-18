package collectionKt.list.MapsProgram

fun main() {
    val list = listOf(
        mapOf("name" to "Taylor", "age" to 20),
        mapOf("name" to "Ariana", "age" to 21),
        mapOf("name" to "James", "age" to 19)
    )

    val sortedList = list.sortedBy { it["age"] as Int }

    println(sortedList) // [{name=James, age=19}, {name=Taylor, age=20}, {name=Ariana, age=21}]

    sortedList.forEach { println(it) }
}

