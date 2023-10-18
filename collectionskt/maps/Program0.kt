
fun main() {

    val hm2 = HashMap<String,Int>()
    hm2.apply {
        put("A", 90)
        put("B", 190)
        put("c", 190)
    }
    val hm1 = HashMap<String,Int>()
    hm1.apply {
        put("A", 90)
        put("B", 190)
        put("c", 190)
    }
    println(hm1) //{A=90, B=190, c=190}

    for((k,v) in hm1){
        println("$k = $v")
    }
    println(hm1.entries) // [A=90, B=190, c=190]
    println(hm1.keys) //[A, B, c]
    println(hm1.any()) // true // if have at least one entry
    println(hm1.values)

    val hm3 = hm1.clone()
    println(hm3)
    hm2.onEach {
        print(it.key + "->" + it.value +" ") //A->90B->190c->190
    }
    hm2.onEachIndexed { index, entry ->
        print(" $index + -> + $entry") // 0 + -> + A=90 1 + -> + B=190 2 + -> + c=190
    }

    // ==================================================
    // put item in map
    val hm4 = HashMap<String, Any>()
    hm4.put("name", User("Jb"))
    hm4.put("phone Num","121212")
    println(hm4)

    // get map's item
//    1 . using getOrDefault
    val valueD = hm4.getOrDefault("D", 4) // Default value is 4
    println("valueD $valueD")
    //    2 . using forEach
    // 3. using getOrElse
    val valueE = hm4.getOrElse("E") { 4 } // Default value is 4
    println("valueE $valueE")
    //4. Using the Index Operator []
    println("value  ${hm4["nam"]}") // if key not fount get null value 

    val l:ArrayList<HashMap<String, Any>> = ArrayList()
    l.add(hm4)
    l.add(hm4)
    println(hm4) //{user1=User(name=Jb), user2=User(name=Jb1)}

    // copy one HashMap to Another HashMap
    // Create a new HashMap
    val hm5 = HashMap<String, Any>()

    // Copy the contents of the original HashMap to the new HashMap
    hm5.putAll(hm4)
    println(hm5) //{name=User(name=Jb), phone Num=121212}


}