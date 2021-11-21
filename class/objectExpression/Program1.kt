//  Object Exoression 
//  need to create an object of some class with slight modification, without explicitly creating a new subclass for it , this case can be handled using object expressions(java uses anonymous inner class )
// object expression - create an object of anonymous classes

// instance of anonymous class are called anonymous object becaus they are defined by an expression 

// creating anonymous object 


// ex1

fun main(args: Array<String>) {
    val x = object{
        val prop1 = "prop1val"
        val prop2 = "prop2val"
        var prop3:String? = null


        override  fun toString() = "$prop1 $prop2"
        fun hello(){
            println("Hello world")
        }
    }

    // print an object  called toString()
    println(x) // object expr
    x.hello() // Hello world
    println(x.prop1) // prop1val
    x.prop3 = "prop3Val"
    println(x.prop3) //prop3Val


}