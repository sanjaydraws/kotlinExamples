// each function is an object, and it captures a closure

// Non-Local control Flow
// if we want to return from a lambda expression then the Kotlin compiler does not allow us to do so.
//  With the help of the inline keyword, we can return from the lambda expression itself
//   and exit the function in which inlined function is called.

/* 
var l = {
    println("Hello world")
    return 
}

fun main(){
    // l() //'return' is not allowed here
}

 */


 
inline fun inlineFunc(l1 :() -> Unit, l2:() ->Unit){
    l1.invoke()
    l2.invoke()
}
fun main(){
    inlineFunc({
    println("Hello world")
    return 
},{println("My World")})
}


// Noinline
// want only some of the lambdas passed to an inline function to be inlined, we can mark some of the function parameters with the noinline modifier.


/*
inline fun inlineFunc(noinline l1 :() -> Unit, l2:() ->Unit){
    l1.invoke()
    l2.invoke()
}
fun main(){
    inlineFunc({
    println("Hello world")
    return 
},{println("My World")})
  // 'return' is not allowed here
}
 */


// Reified Type Parameters


// sometimes we need to access the type of parameter passed during the
//  call. We have to simply the pass of the parameter at the time function calling and we can retrieve the type of 
//  the parameter using a reified modifier.

inline fun <reified T> func(){
    print(T::class)
}
fun main(){
    func<String>()
}


// Inline Properties
// The inline modifier can be used on accessors of properties that don’t have a backing field. 

fun main(){
    print(flag) // true 
}

fun foo(i:Int):Int{
    var a = i 
    return a
}

inline var flag :Boolean 
   get() = foo(10) == 10
   set(flag) {flag}
