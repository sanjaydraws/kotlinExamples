package collection.maps
/**
 * immutable map
 * */

fun main() {
    val m1 = mapOf<Int,String>(12 to "a", 1 to "b")
    val m2 = mapOf("name" to "kali", "age" to 23)
    println(m2) //{name=kali, age=23}
    println(m2.size) //2
    println(m2.keys) //[name, age]
    println(m2.entries) // [name=kali, age=23]
    println(m2.any()) // true // if have at least one entry
    println(m2.values) // [kali, 23]

    // get values
    println(m2.get("12")) // null
    println(m2["name"]) // kali
    println(m2.getValue("name"))// kali //get exception if key not found

    // get default value if key doesn't have value
    println(m2.getOrDefault("name","DefaultName"))

    // Key and value contains
    println(m2.containsKey("name")) // true
    println(m2.contains("name")) // true
    println(m2.containsValue(23))// true

    //  If the key is not present in the map, it returns the result of a lambda function
    val count = m2.getOrElse("name",{
        0
    })
    println("count $count")

    // iterate map
    println("onEach")
    m2.onEach {
        print("${it.key} ${it.value} ")
    }// name kali age 23
    println("onEachIndexed")
    m2.onEachIndexed { index, entry ->
        print(" $index $entry" )
    }// 0 name=kali 1 age=23
    println()
    for((k,v) in m2){
        print("$k = $v ")
    }//name = kali age = 23
    println()
    m2.forEach { key, value ->
        print("$key -> $value")
    }//name -> kaliage -> 23
    println()


    // copy one map to another
    // method1
    val map1 = mapOf(
        "A" to 1,
        "B" to 2,
        "C" to 3
    )

    val map2 = map1.toMap()
    // method2
    val map3 = mutableMapOf<String, Int>()
    map3.putAll(map1)

}