// The primary constructor cannot contain any code,
//  the initialization code can be placed in a separate initializer


class Add(val a:Int, val b:Int){
   val c= a+b 
}
class Minus constructor(val a:Int, val b:Int){
   val c =  a-b
}
// giving default value or initializer block
class Example(x :Int = 100, y:String="defalut value"){
    val id:Int 
    val name: String  // have to initize here or init block 
    init{
        println("firt thing run ")
        id = x 
        name = y
        println( "$x $y")
    }
}
fun main() 
{ 
    val add = Add(3,5)
    val min = Minus(4,5) 

    Example(3,"hello")
    println("The Sum of numbers 5 and 6 is: ${add.c}") 
    println("The Sum of numbers 5 and 6 is: ${min.c}") 
} 



