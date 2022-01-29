package collection.maps
/**
 *
 * */

data class User(val name:String)
fun main() {
    val m1 = mapOf<Int,String>(12 to "a", 1 to "b")
    val m2 = mapOf("name" to "kali", "age" to 23)
    println(m2)

    val hm2 = HashMap<String,Int>()
    hm2.apply {
        hm2["A"] = 90
        hm2["B"] = 190
        hm2["c"] = 190
    }
    val hm1 = HashMap<String,Int>()
    hm1.apply {
        hm1["A"] = 90
        hm1["B"] = 190
        hm1["c"] = 190
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
    val hm4 = HashMap<String, Any>()
    hm4.put("name", User("Jb"))
    hm4.put("phone Num", User("121212"))
    println(hm4)

    val l:ArrayList<HashMap<String, Any>> = ArrayList()
    l.add(hm4)
    l.add(hm4)
    println(hm4) //{user1=User(name=Jb), user2=User(name=Jb1)}






}