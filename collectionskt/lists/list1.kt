package collectionKt

// takes array of particular type or mixed type or null parameters.
// Null parameters is used when there is a need to create empty instance of MutableList.
// returns the instance of MutableList Interface.

// listOf(...) is a Kotlin function that creates an immutable list 

/**
List                           |    Mutable List                        | ArrayList
interface,ordered collection      Interface,extends List                   pecific implementation of the MutableList
of elements

only for readOnly                can be modified,add,remove,set posible       uses a dynamically resizable array to store elements.add,remove

can not modify                        possible                                   possible
*/
fun main(){

    //declaring an empty mutable list of integers
    val mutableListC = mutableListOf<Int>()
    println(mutableListC) //  []

    //declaring a mutable list of integers
     val mutableList1: MutableList<Int>  = mutableListOf<Int>(1,2,46,7)
     mutableList1.add(67)
     mutableList1.add(2,23)
     print(mutableList1) //[1, 2, 23, 46, 7, 67]
     mutableList1.forEach{
        print(" $it")
     } //1 2 23 46 7 67
    println()
    mutableList1.removeAt(2)
    println(mutableList1) // [1, 2, 46, 7, 67]
    println(mutableList1.remove(67)) // if remove return true
    println(mutableList1)
    mutableList1.replaceAll { 5 }
    println(mutableList1) // [5, 5, 5, 5]
    println("zero index ${mutableList1[0]} ${mutableList1.get(0)}") //to get index // zero index 5 5
    mutableList1.set(0,89) // set value
    mutableList1[2] = 102
    print(mutableList1) // [89, 5, 102, 5]
    // add another list

    mutableList1.addAll(listOf<Int>(8, 9, 10))
    println(mutableList1) // [89, 5, 102, 5, 8, 9, 10]

    mutableList1.addAll(setOf<Int>(18, 19, 110))
    println(mutableList1) // [89, 5, 102, 5, 8, 9, 10, 18, 19, 110]

    val someMap = mapOf<Int, Int>(1 to 8, 2 to 9, 3 to 10)
    println("keys ${someMap.keys}") // keys [1, 2, 3]
    mutableList1.addAll(someMap.keys) //
    println(mutableList1) //[89, 5, 102, 5, 8, 9, 10, 18, 19, 110, 1, 2, 3]

    println(mutableList1.size) //13





//    =========================================
    // // val mutableList2 = mutableListOf(1,2,46,7)
    // // mutableList1.add("str")// type mismatch: inferred type is String but Int was expected
     val captains = mutableListOf<Any>(1,2,3,4,"Kohli","Smith",
     "Root","Malinga","Dhawan","Rohit")

     println(captains)// [1, 2, 3, 4, Kohli, Smith, Root, Malinga, Dhawan, Rohit]
     captains.add(45)
     println(captains)//[1, 2, 3, 4, Kohli, Smith, Root, Malinga, Dhawan, Rohit, 45]






// ================================================================

// ==============================================================
// indexOf() , lastIndexOf()-> get the index of the specified element
// elements at some specific index using elementAt() function.

    val mutablelist = mutableListOf<Any>("kohli", "Rohit","Surya","Rohit" )
    println(mutablelist.elementAt(2)) // Surya
    println(mutablelist.indexOf("smith")) // if not exist -1
    println(mutablelist.indexOf("Rohit")) // 1
    println(mutablelist.lastIndexOf("Hello")) // if not exist return -1
    println(mutablelist.lastIndexOf("Rohit")) // 3

    println(mutablelist.first()) // kohli
    println(mutablelist.last()) //Rohit

    println(mutablelist.contains("Gill"))//  false
    println(mutablelist.contains("kohli")) // true
    println(mutablelist.containsAll(setOf("kohli", "Rohit"))) // true
    println(mutablelist.containsAll(setOf("Rohit", "kohli"))) // true
}