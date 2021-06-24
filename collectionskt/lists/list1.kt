// takes array of particular type or mixed type or null parameters. 
// Null parameters is used when there is a need to create empty instance of MutableList.
// returns the instance of MutableList Interface.
fun main(){
    //declaring a mutable list of integers 
    // val mutableList1 = mutableListOf<Int>(1,2,46,7)
    // mutableList1.add(67)
    // print(mutableList1) //[1, 2, 46, 7]
   
    
    // //declaring a mutable list of strings 
    // val mutableListB = mutableListOf<String>("Geeks","for" , "geeks")
    // println(mutableListB) 

       
    // //declaring an empty mutable list of integers 
    // val mutableListC = mutableSetOf<Int>() 
    // print(mutableListC) //  []
    
    
   
//    =========================================
    // // val mutableList2 = mutableListOf(1,2,46,7)
    // // mutableList1.add("str")// type mismatch: inferred type is String but Int was expected
    // val captains = mutableListOf(1,2,3,4,"Kohli","Smith", 
    // "Root","Malinga","Dhawan","Rohit")
 
    // print(captains)// [1, 2, 3, 4, Kohli, Smith, Root, Malinga, Dhawan, Rohit]
    // captains.add(45)
    



 

// ================================================================

    var mutablelist=mutableListOf("Geeks", "For","rohit","kohli")
    
    // mutablelist.remove("For")
    // mutablelist.remove(mutablelist[1])
    // print(mutablelist)

// ==============================================================
// indexOf() , lastIndexOf()-> get the index of the specified element
// elements at some specific index using elementAt() function.
    
   println(mutablelist.elementAt(2)) // rohit 
   println(mutablelist.indexOf("smith")) // if not exist -1
   println(mutablelist.indexOf("For")) // 1 
   println(mutablelist.lastIndexOf("For")) // 2 

   println(mutablelist.first())
   println(mutablelist.last())

   println(mutablelist.contains("For"))//  true
   println(mutablelist.contains("Fo")) // false
   println(mutablelist.containsAll(setOf("Geeks", "For"))) // true
   println(mutablelist.containsAll(setOf("Geeks", "for"))) // false  

   









    
}