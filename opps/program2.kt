// have more secondary constructor with diferent parameter

class Add{
    var c :Int ;
    constructor (a :Int, b:Int){
        c = a + b 
        var x = a + b 
        println("the $c")
    }
    fun func(){
        println(c)
        // println(x) //error 
    }
}

fun main(){
    var add = Add(4,5)
    println(add.c)
    // print(add.x)  error
    // add.func()// error 
}
