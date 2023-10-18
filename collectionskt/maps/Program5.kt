
fun main() {
    val m2 = mutableMapOf("name" to "Justin", "lastname" to "Bieber", "age" to 23, )

    val map1 = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val map2 = mapOf(2 to "TWO", 4 to "four")

    map1.merge(0, "TWO") { oldValue, newValue ->
        "$oldValue + $newValue"
    }
    println(map1)// {1=one, 2=two, 3=three, 0=TWO}

    map1.merge(2, "TWO") { oldValue, newValue ->
        "$oldValue + $newValue"
    }
    println(map1)// {1=one, 2=two + TWO, 3=three, 0=TWO}

    // map
    // it will not changes in existing map
    val listPair = map1.map { (key, value) ->
        key to "${value.toUpperCase()}!"
    }
    println(map1)// {1=one, 2=two + TWO, 3=three, 0=TWO}
    println(listPair) // [(1, ONE!), (2, TWO + TWO!), (3, THREE!), (0, TWO!)]
    println(listPair.toMap()) // {1=ONE!, 2=TWO + TWO!, 3=THREE!, 0=TWO!}

   // mapKeys function is used to create a new map with keys transformed by the provided lambda function.
    // no changes in existing map
    val mappedKeys = map1.mapKeys { (key, value) ->
        key * 10
    }
    println(mappedKeys)

    val destinationMap = mutableMapOf<Int, String>()

    // mapKeysTo
    //    // no changes in existing map
    map1.mapKeysTo(destinationMap) { (key, _) ->
        key * 10
    }
    println(destinationMap) // {10=one, 20=two + TWO, 30=three, 0=TWO}

    // mapNotNull
    val mutableMap = mutableMapOf(
        1 to "One",
        2 to null,
        3 to "Three",
        4 to null
    )

    val filteredMap = mutableMap
        .mapNotNull { (key, value) ->
            value?.let { key to it }
        }
        .toMap()
    println(filteredMap) // {1=One, 3=Three}


   // mapTo: If you want to transform your list into a different type of list then use mapTo
    val transformedList = mutableListOf<String>()

    map1.mapTo(transformedList) { (key, value) ->
        "Key: $key, Value: $value"
    }
    println(transformedList)

    //mapValues - returns a new map with the transformed values.
    //  no changes in existing map
    val originalMap = mapOf(
        "apple" to 5,
        "banana" to 3,
        "cherry" to 8
    )

    val doubledValues = originalMap.mapValues { (_, value) -> value * 2 }

    println(doubledValues) // {apple=10, banana=6, cherry=16}

    //mapValuesTo :allows to specify a destination map where the transformed entries will be stored.

    val doubledValues2 = mutableMapOf<String, Int>()

    originalMap.mapValuesTo(doubledValues2) { (_, value) -> value * 2 }

    println(doubledValues2) // {apple=10, banana=6, cherry=16}




}