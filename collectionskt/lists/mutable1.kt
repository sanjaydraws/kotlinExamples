// Mutable Collection supports both read and write functionalities. Mutable collections and their corresponding methods are:

// List – mutableListOf(),arrayListOf() and ArrayList
// Set – mutableSetOf(), hashSetOf()
// Map – mutableMapOf(), hashMapOf() and HashMap


fun main(){
    var mutableList = mutableListOf("sk", "Jb","34")
    mutableList[0] = "Jb"
    mutableList.add("abcd")
    for(item in mutableList)
      print(item)

    println("")
    var mutableSet = mutableSetOf<Int>(6, 10)
    mutableSet.add(45)
    mutableSet.add(5)
    for(item in mutableSet){ 
        println(item) 
    }
    
    var mutableMap = mutableMapOf<Int, String>(1 to "Mahi", 2 to "Hello")
   
    // modify 
    mutableMap.put(1, "praveen")
    // add
    mutableMap.put(4, "fdf")

    for(item in mutableMap.values)
       print(item)

    

    
}