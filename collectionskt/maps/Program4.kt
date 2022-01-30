
// compute method to update
fun main() {
    // Create a Map and add some values
    val map: MutableMap<String, String> = HashMap()
    map["Name"] = "Justin"
    map["Address"] = "Canada"
    println("Map: $map")
    // remap the values using compute() method
    map.compute("Name") { key: String?, `val`: String? -> "$`val` Bieber" }
    map.compute(
        "Address"
    ) { key: String?, `val`: String? -> "$`val` Green Street " }
    println("New: $map")


    // example 2
    val map1: MutableMap<String, Int> = HashMap()
    map1["Key1"] = 12
    map1["Key2"] = 15

    println("Map: $map1")

    map1.compute("Key1") { key: String?, `val`: Int? -> if (`val` == null) 1 else `val` + 1 }
    map1.compute("Key2") { key: String?, `val`: Int? -> if (`val` == null) 1 else `val` + 5 }
    println("New Map: $map1")



}