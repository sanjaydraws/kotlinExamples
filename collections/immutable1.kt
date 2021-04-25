// Immutable means that it supports only read-only functionalities and can not be modified its elements. Immutable Collections and their corresponding methods are:

// List – listOf() and listOf<T>()
// Set – setOf()
// Map – mapOf()

// List – It is an ordered collection in which we can access to elements or items by using indices – 
// It is a collection of unordered elements also it does not support duplicate elements.
fun main(){
    val immutableList = listOf("Hello", "World", "Rahul", 34)
    val immutableSet = setOf(5,3,3,0,0,"jb", "sk", "sk")
    val immutableMap = mapOf(1 to "justin", 2 to "lkl", 3 to "uiu", 4 to 67) 
    for(item in immutableList)
      println(item)

      for(item in immutableSet)
      println(item)

      for (key in immutableMap.keys)
        println(immutableMap[key])


        


}