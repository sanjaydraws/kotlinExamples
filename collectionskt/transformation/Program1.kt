
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
    
    


    
}


// mapIndexed(). to use elements index 
