package collectionKt.list.MapsProgram

// ways to remove keys from map

fun main() {
    val myMap1 = mutableMapOf(
        "A" to 1,
        "B" to 2,
        "C" to 3,
        "D" to 4,
        "E" to 5
    )

    // 1. Using MutableMap.remove():
    myMap1.remove("B")

    //2. Using MutableMap.remove() with conditional check:
    if (myMap1.containsKey("B")) {
        myMap1.remove("B")
    }
    println(myMap1) // {A=1, C=3, D=4, E=5}



    // 3 : Using filterKeys():
    val filteredMap1 = myMap1.filterKeys { it != "C" }
    println(filteredMap1) // {A=1, D=4, E=5}

    //4. Using filter():
    val filteredMap2 = myMap1.filter { it.key != "C" }

    println(filteredMap2) // {A=1, D=4, E=5}


    // 5. using filterNot()
    println(myMap1.filterNot { it.key == "C"}) // {A=1, D=4, E=5}



//    4. Using toMutableMap() with filtering:
    val myMap2 = mapOf(
        "A" to 1,
        "B" to 2,
        "C" to 3,
        "D" to 4,
        "E" to 5
    )

    val filteredMap = myMap2.toMutableMap()
    filteredMap.remove("B")


    //
    val myMap3 = mapOf(
        "A" to 1,
        "B" to 2,
        "C" to 3,
        "D" to 4,
        "E" to 5
    )

    val keysToKeep = setOf("A", "C", "E")

    val filteredMap4 = myMap3.filterKeys { it in keysToKeep }

    println(filteredMap4) // {A=1, C=3, E=5}

}
