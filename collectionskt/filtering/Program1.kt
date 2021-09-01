// Filter by predicate
// predicate in filter only check the value of elements 
fun main(args: Array<String>) {
    val numbers1 = listOf(1,2,3,4,5,6)
    val numbers2 = listOf(0,5,3,4,3,2)

    // return list  of elemenet that if number1's elements present in number2 list 
    val filterNum = numbers1.filter { predicate ->
           numbers2.contains(predicate)
    }
    print(filterNum) //[2, 3, 4, 5]

    val numMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filterMap = numMap.filter { (key ,value) ->
        key.startsWith("k") && value >2
    }
    print(filterMap) // {key3=3, key11=11}


    // to use elements position use filterIndexed()
    val filterIndexed = numbers1.filterIndexed {
         index,element -> (index>1) && element > 2
     }
     print(filterIndexed) // [3, 4, 5, 6] 

     // to filter collection on  false  condition use filterNot()
     val f = numbers1.filterNot { 
         it > 3
      } 
      print(f) // [1, 2, 3] 


    // filterIsInstance() : returns collection of given type 
    val numbers3 = listOf("1",null, "Hello", "World","3.20")
    val filter3= numbers3.filterIsInstance<String>().forEach  {
        print(it.uppercase()+ " " )  // 1 HELLO WORLD 3.20
    }
    print(filter3) //  kotlin.Unit 

    // filterNotNull() returns all non-null elements
    val numbers4 = listOf("1",null, "Hello", "World","3.20")
    val filter4 = numbers4.filterNotNull().forEach{
        print(it + " ") // 1 Hello World 3.20
    }
    print(filter4) //  kotlin.Unit





}
// inline fun <T> Iterable<T>.filterIndexed(predicate: (index: Int, T) -> Boolean): List<T>
