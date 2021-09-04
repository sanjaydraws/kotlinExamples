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
    println(filter4) //  kotlin.Unit


    //partition - it it will return pair of list , first melements are matches in seperate and that are not matched goes in another list 
    val numbers5 = listOf("one", "two", "three", "four", "five")
    val (matched, rest) = numbers5.partition { predicate -> predicate.length>3 }
    println(matched) // [three, four, five]
    println(rest) // [one, two]  

    // function that uses predicate to filter collection 
    // any() -> it returns true  if atleast one element matches 
    println(numbers5.any{ it.startsWith("t")}) // true 
    // none() -> returns true if no elements matches with given predicate , if matches then return false 
    println(numbers5.none{ it.startsWith("o")}) //false
    // all() - it returns true if all element matches with given predicate 
    println(numbers5.all { it.length > 3}) // false 


    // all() returns true for any predicate for emptylist 
    println(emptyList<Int>().all { it > 5 }) // true 


    // any()  ,none() for without predicate 
    // any() - return true if elements in list , false for empty list 
    println(numbers5.any()) // true 
    println(emptyList<Int>().any()) // false 

    // none() -> return true if elements present in list , true for empty list 
    println(numbers5.none()) // false 
    println(emptyList<Int>().none()) // true 





}
// inline fun <T> Iterable<T>.filterIndexed(predicate: (index: Int, T) -> Boolean): List<T>
