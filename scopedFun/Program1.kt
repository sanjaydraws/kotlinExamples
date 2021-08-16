//scoped function are function that execute a block of code within th context of an object 
// The context of the object can be referred to as “it” or “this”  


class Cat {
    var color:String = "white"
    var voice:String = "MEow"
    var  bread:String = "Persian  Cat"
    
    fun getInfo() = print("\n color: $color\n " +  "contact number: $voice\n" + "bread $bread")
    
   
}
fun  letOperationFun(){
    // let operation perform on cat object and returns string value not an object
    //  return@let is only for code readability 
    val cat = Cat().let{
        return@let  "cat ${it.color} ${it.voice} ${it.bread}"
    }
    print(cat)
}
fun letOperationFun2(){
    // return no value 
    val cat = Cat().let { 
        it.color= "yellow"
     }
     print(cat) //cat white MEow Persian
}
// context of object can be renamed 
fun letOperationFun3(){
    val cat = Cat().let { 
        catDetails -> { catDetails.color = "Violet" 
                catDetails.bread = "nothing"
           }
     }
     print(cat)
}

// if color it 's not null then inside block code will be run 
fun letOperationFun4(){
    // val name = Cat().color?.let{
    //     "$it"
    // }
    // print(name)

}
// used to perform an opration on the result of call chain 
fun letOperation5(){
    // val x = mutableListOf("One", "Two","Three", "Four", "Five")
    // val res = x.map { it.length }.filter { it>3 }
    // print(res)

    // print the result 
    // x.map { it.length }.filter{it>3}.let { 
        // print(it)
        
    //  }
}
fun main() {
    var number:Int? = null 
    letOperationFun()
    letOperationFun2() //Catkotlin.Unit
    letOperationFun3() // Catkotlin.Unit 
    letOperationFun4() // white
    // letOperation5() //[5, 4, 4]

    var x = number?.let { 
        val number2 = it + 1
        number2
     }  ?: 34
     print(x) // 34 
       
}