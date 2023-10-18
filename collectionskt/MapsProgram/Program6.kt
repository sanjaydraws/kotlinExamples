package collectionKt.list.MapsProgram

// merge two maps

fun main() {
    val dict1 = mapOf(
        'a' to 100,
        'b' to 89
    )

    val dict2 = mapOf(
        'd' to 61,
        'c' to 49
    )

    val mergedMap = dict1 + dict2

    println(mergedMap) // {a=100, b=89, d=61, c=49}


}
