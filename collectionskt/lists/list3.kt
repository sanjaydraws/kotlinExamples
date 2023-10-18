/**
difference between mutable list vs ArrayList

 //Returns an empty new [MutableList].
 //@sample samples.collections.Collections.Lists.emptyMutableList
 @SinceKotlin("1.1")
 @kotlin.internal.InlineOnly
 public inline fun <T> mutableListOf(): MutableList<T> = ArrayList()

two way to create mutable list
1. ArrayList constructor or arrayListOf<T>()(Array List is implementation of Mutable list)
2. using mutableListOf<T>()

 ArrayList
->Resizable-array implementation of the List interface.
->ArrayList is a specific implementation of the MutableList interface.
->ArrayList is a type of MutableList and
it inherits all the functions and properties defined in the MutableList interface.
 
* */

fun main() {
    // creating MutableList
    val l1 = mutableListOf<Any>("23","23",34)
    val l2 = mutableListOf<String>("rohit", "rishabh")
    val l3:MutableList<String> = arrayListOf<String>("Virat","Ishaan")
//    val l5:MutableList<String> = ArrayList<String>("Gill",) // not possible
    val l5: MutableList<String> = ArrayList(listOf("Gill", "Smith", "Root"))
    val l6 = mutableListOf<Int>() // empty
    val l4 = l3
    println(System.identityHashCode(l4)) // 1721931908
    println(System.identityHashCode(l3)) // 1721931908

    l3.replaceAll{ "Samson" }
    println(System.identityHashCode(l4)) // 1721931908
    println(System.identityHashCode(l3)) // 1721931908
    println(l3) //[Samson, Samson]
    println(l4)  // [Samson, Samson]
    val l7: MutableList<String> = l3.toMutableList() // copy list address should be different
    println(System.identityHashCode(l7)) // 1128032093
    println(System.identityHashCode(l3)) // 1721931908

    l3.replaceAll{ "Gill" }
    println(l3) // [Gill, Gill]
    println(l7)  //[Samson, Samson]
    val l8 = l3
    l8.replaceAll{ "l" }
    println(l4)

    // convert mutable list to list
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    val immutableList: List<Int> = mutableList.toList()


    // creating ArrayList
    val al1 = ArrayList<Int>()
    val al2:ArrayList<Int> = ArrayList()
    val al3 = arrayListOf<Any>(1,2,"5")
    /** in java
    ArrayList<Object> al3 = new ArrayList<>();
    al3.add(1);
    al3.add(2);
    al3.add("5");
     * */
    val al4 = al3 // if change anything effect on both list
    println(System.identityHashCode(al3)) // 1721931908
    println(System.identityHashCode(al4)) // 1721931908

    // copy arraylist
//    changes in one list won't affect the other)
    val al5 = ArrayList(al3)

    // declare List type
//    val al6:List<String> = ArrayList<String>("Hello","Hola") // not possible
    val al6:List<String> = ArrayList<String>(listOf("Hello", "Hola"))
    val al7 = al5.toList()

    // convert arraylist to list
    val myList: List<Int> = listOf(1, 2, 3, 4, 5)
    val myArrayList: ArrayList<Int> = ArrayList(myList)



}