
// Collection Transformation Operation 
// kotlin provide extension functions to create new collection from existing collection  based on transformation condition 

// Map -> it apllies lambda for each element of collection and returns list
data class Person(
    val id:Int? = null ,
    val firstName:String? = null ,
    val lastName:String? = null 
)

fun main(args: Array<String>) {
    val l  = setOf(1,2,3)
    println(l.map { transform -> transform *3 })  //[3, 6, 9] 
    println(l.map { it*9 }) // [9, 18, 27] 

    // mapIndexed(). to use elements index 
    // to apply a transformation that additionally use element and index as argument  
    println(l.mapIndexed { index, value -> value+ index }) // [1, 3, 5] 

    // apply map on list of objects 
    val persons :List<Person> = listOf(Person(1, "Justin" , "Bieber"),
    Person(2, "Peter" , "Parker"),
    Person(3, "Jolly" , "K"),
    Person(4, "Lian" , "Pane"))

    //returns list of person full name 
    val filterdPerson = persons.map { it -> "${it.firstName} ${it.lastName}" }
    println(filterdPerson) // [Justin Bieber, Peter Parker, Jolly K, Lian Pane] 


    // filter with map 
    // first it filter by id <3 then return person first name list that contains "j"
    // val filterById = persons.filter { it -> it.id?.compareTo(3) }.map { it -> it.firstName?.contains("j") }
    // println(filterById)
    
    
    // mapNotNull() function    if get null values on certain elements,that can be filtered.
    val l2 = setOf(1,null,3,4)
    println(l2.mapNotNull   { it }) // [1, 3, 4]
    val l3 = setOf(1,56,3,4)
    println(l3.mapIndexedNotNull { index, value -> if (index == 0) null else value * index }) //[56, 6, 12]


    // transformation of map 
    //mapKeys - to transform keys 
    //mapValues - to transform values 
    val animalMap =  mapOf(
         "Monkey" to 1 , "Lion" to 2, "Chimpanzee" to 3 
    )
    println(animalMap.mapKeys { it.key.uppercase() }) // {MONKEY=1, LION=2, CHIMPANZEE=3} 
    println(animalMap.mapValues   {it.value + it.key.length }) //{Monkey=7, Lion=6, Chimpanzee=13} 


    // Zip 
    //zip() extension function  use to  create pairs by picking elements from both collections from same indexing value 
    val teams = listOf("England", "Australia", "Newzeland")
    val players = listOf("liam", "Starc", "Kane")
    println(teams zip players) // [(England, liam), (Australia, Starc), (Newzeland, Kane)]

    // last element not included for larzer collection 
    val player2 = listOf("starc", "Kane") 
    println(teams.zip(player2)) //[(England, starc), (Australia, Kane)] 


    println(teams.zip(players){ team, player -> "${player.uppercase()}  from ${team}"} ) // [LIAM  from England, STARC  from Australia, KANE  from Newzeland]  

    // unZip() - it returns two  list(first elements of pair ,second elements of pair ) when has pair of list
    val pair = listOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4)
    println(pair.unzip())

    



    
}


