
fun main() {
    val str = "Hello"

    if(str is String){
        print(str.length) //5
    }
    if(str !is String) print("it's  not string") else print(str.length)

    //smart cast
    example1(23)
    example2("Hey")
    example3(23)
    example4("sddsd")
    example5("ewew") // 8

    // unsafe cast
    val y = 23
    val z = "Hello"
//    val x :String  = y as String //java.lang.ClassCastException
//    val x :String? = y as String? //java.lang.ClassCastException

    // safe nullable cast
    // use safe cast operator as? that returns null on failure 
    val x:String? = y as? String
    print(x) // null
}

fun example1(x:Any){
    if(x is String){
        println(x.length) // automatically cast to string
    }
}

fun example2(x:Any){
    if(x !is String) return
    println(x.length) // 3
}

fun example3(x:Any){
//    x is automatically cast to string on the right-hand side of `||`
    if ( x !is String || x.length == 0) return
}
fun example4(x:Any){
    // x is automatically cast to string on the right-hand side of `&&`
    if( x is String && x.length > 0 )
        println(x.length)
}
fun example5(x:Any){
    when(x){
        is Int -> println(x)
        is String -> print(x.length*2)
        is IntArray -> println(x.sum())
    }
}