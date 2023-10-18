package collectionKt.list.MapsProgram


//kotlin map with keys having multiple inputs to get access to the keys.
fun main() {
    val data = mapOf(
        Pair("apple", "red") to mapOf("a" to 1, "b" to 2, "c" to 3),
        Pair("banana", "yellow") to mapOf("x" to "good", "y" to "bad", "z" to "ok"),
        Pair("cherry", "red") to mapOf("m" to 10, "n" to 20, "o" to 30),
        Pair("grape", "green") to mapOf("p" to "small", "q" to "big", "r" to "tiny")
    )

    // Getting value from the nested map
    val value1 = data[Pair("apple", "red")]?.get("a")
    val value2 = data[Pair("banana", "yellow")]?.get("y")

    println("Value for ('apple', 'red'): $value1")
    println("Value for ('banana', 'yellow'): $value2")

}
