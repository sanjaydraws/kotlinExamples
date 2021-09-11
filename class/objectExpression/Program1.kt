//  Object Exoression 
// when you need to create an object of  a modification of some class that time without creating a subclass ,this case can be handled using object expressions and declarations 
// object expression - create an object of anonymous classes

// instance of anonymous class are called anonymous object becaus they are defined by an expression 

// creating anonymous object 

fun main(args: Array<String>) {
    val x = object{
        val prop1 = "object"
        val prop2 = "expr"

      override  fun toString() = "$prop1 $prop2"
      fun hello(){
          println("Hello world")
      }
    }
    
    // print an object  called toString()
    println(x) // object expr
    x.hello() // Hello world 


}