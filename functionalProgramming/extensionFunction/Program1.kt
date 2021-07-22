// extension function 



// fun YourClass.yourNewfunction(param :Type){
//     // do your code
// }
class Animal {
    var color :String =""
    var count:Int = 2
    constructor(color:String, count:Int){
        this.color = color 
        this.count = count 
    }
}

fun Animal.printColor(){
    print(this.color)
    print(this.count)
}
 fun Animal.d(i:Int) -> {
   print(this.color)
}

fun main(args: Array<String>) {
    val a1 = Animal( "White", 5)
    a1.printColor()
    print(a1.printColor2())

}


// extension function with lambda 