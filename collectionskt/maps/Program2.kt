
// copy one hashmap to another

fun <K, V> copyMap(original: Map<K, V>): Map<K, V>? {
    val second_Map: MutableMap<K, V> = HashMap()
    for ((key, value) in original) {
        // using put method to copy one Map to Other
        second_Map[key] = value
    }
    return second_Map
}
fun main() {
    val map1: MutableMap<String, Int> = HashMap()
    map1["A"] = 1
    map1["B"] = 2
    map1["C"] = 3

    val map2 = copyMap(map1)

    println(map2) //{A=1, B=2, C=3}
    val map3 : MutableMap<String, Int> = HashMap()
    map3.putAll(map1) // using putAll
    println(map3) // {A=1, B=2, C=3}

    // using copy constructor
    val map4 = HashMap<String,Int>(map1)
    println(map4) // {A=1, B=2, C=3}


}
