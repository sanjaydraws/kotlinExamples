// Kotlin functions can be stored in variables and data structures.
// can be passed as arguments to and returned from other higher-order functions. 

// higher order function - which can takes function or lamdas  as arguments

// two types of lambdas function can be passed 
// 1. which return Unit type 
// 2. which return String,Integer


// lambda expression returns nothing
var lambda = {
    println("\nHello world")
}

// takes argument and return 
val lambda2 = { x:Int, y:Int -> x * y } 

//passging function to higher order function 
fun f1(s:String):Unit{
    print(s)
}
fun f2(i1:Int, i2:Int):Int{
    return i1+i2 
}


fun highOrderFun( lmbd : () ->Unit){
    // lmbd()
    lmbd.invoke() // to invoke 
    // lmbd.takeIf { predicate }    
}
fun highOrderFun2(lmbd :(Int, Int) -> Int){
    val r = lmbd.invoke(90,3)
    print(r)  
}

// passing function 
fun higherOrderFun3(x:Int,y:Int,str:String, l1:(String) ->Unit, l2 :(Int,Int) ->Int){
    val r= l2.invoke(x, y)
    print("\n $r")
    l1.invoke("\n $str")
}

// return another function from higher order function 
fun higherOrderFun4(): ((Int, Int) -> Int){
    return ::f2 
}

fun main() {
    // lambda()
    highOrderFun(lambda)
    highOrderFun2 (lambda2) // 270 
    higherOrderFun3(12,2, "my string", ::f1,::f2)
    // higherOrderFun3(x, y, l1) { l2 }

    val square = higherOrderFun4()
    print("\n" + square(3,90)) // 93

    

    
}



// read 
// takeIf ,takeUnless , to , runCatching , also,apply, tun let  when 
// ex  lmbd.takeIf 
