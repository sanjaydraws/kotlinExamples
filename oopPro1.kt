// A class in Kotlin can have at most one primary constructor, and one or
//  more secondary constructors. The primary constructor initializes the class, 
//  while the secondary 
// constructor is used to initialize the class and introduce some extra logic.


// The parameters are optional in the primary constructor. 

// class Employee  {
//     var name:String = ""
//     var x:Int = 0
//     fun insertName(n : String){
//         this.name = n
//         print(name)
//     }
// }

// fun main() {
//   var obj = Employee()
//    obj.insertName("Hello World")
  
   
// }


// primary and secondary constructor 


// class Add constructor (a:Int, b:Int){
//    var c = a + b
//    fun msg(){
//        println(c)
//    }
// }

// fun main() {
//   var obj = Add(4,5)
//   println(obj.c)
//   obj.msg()
  
   
}




// class Add constructor (a:Int, b:Int){
// //   primary constructor with initializer block –
//     var id: Int
//     init{
//         id = a 
//         println("Hello World $id")
//     }
//    var c = a + b
//    fun msg(){
//        println(c)
//    }
// }

// fun main() {
//   var obj = Add(4,5)
//   println(obj.c)
//   obj.msg()
  
   
// }


// Secondary Constructor –   Secondary constructors allow initialization of variables and allow to provide some logic to the class as well.


// class Add {
//     var c: Int
//     constructor(a:Int, b:Int){
//          c = a + b
//         print("$c");
//     }
// }

// fun main() {
//     var x = Add(5,7)
//     print(x.c)
   
// }

// Calling one secondary constructor from another –  ???

// class Add {
    
//     constructor(a:Int, b:Int):this(a,b,7){
//        print("Second")
//         var c = a + b
//         print("$c")
//     }
//     constructor(a:Int, b: Int, c:Int){
//         println("first")
//         var sumthree = a+ b +c
//         print("$sumthree")
        
//     }
// }

// fun main() {
//      Add(5,7)
     
   
// }

// Calling parent class secondary constructor from child class secondary constructor –

