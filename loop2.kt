

fun main(){

    var name = "Hello"

    var name2 = "World"

    for(alphabet in name)
       print("$alphabet ")

    // traversing string with using index property 
    for( i in name2.indices)
       print(name2[i] + " ")

    for((index, value) in name2.withIndex())
      println("$index -> $value")

    
     // read only, fix-size 
     var collection = listOf(1,2,3,"listOf", "mapOf", "setOf") 
  
     for (element in collection) { 
         println(element) 
     } 
       
       

}