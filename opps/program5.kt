

// we can remove the CompanionObject name and in place of the CompanionObject name,
//  we can use the keyword companion i.e. the default name of the companion object will be
//   Companion, 
// class CompanionClass {

//     companion object CompanionObject {

//     }
// }
// val obj = CompanionClass.CompanionObject 


class CompanionClass{
    fun callMe() = println("You are calling me with the help of class object")


    // also remove Test from here then we can call from class name 
    companion object Test{

        // only acces with the help of class name 
        var x:Int = 10
        fun callMe() = println("You are calling me help[ of class name")
    }
    // only one companian object allowed in one class 
    // companion object MyTest{
    //     fun myTestCallMe() = println("calling myTestCallMe")
    // }
}

 
fun main(){
    val obj = CompanionClass.Test 
    obj.callMe() // You are calling me help[ of class name
    val obj1 = CompanionClass() 
    obj1.callMe()  // You are calling me with the help of class object
    
    println(obj.x) // 10
   // println(obj1.x) // 

   CompanionClass.MyTest.myTestCallMe()

}