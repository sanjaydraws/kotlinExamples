
// Any is the supertype of all other datatypes.
//
///
/**Variance
 1. Declaration-site variance(using in and out)
 2. Use-site variance: Type projection

 out keyword -> use on generic type to assign this reference to any of it's supertype
  the out value can only produced by the given class but can not consumed
 in keyword -> used to assign it to the reference of it's subtype
 used to only on the parameter type that is consumed, not produced

 */
class Example< T,  V> constructor(t1:T, t2:V? = null ){

    val t1 = t1
    val t2 = t2

}

class Example1<out T,  out V > constructor(t1:T, t2:V? = null ){
    val t1 = t1
    val t2 = t2
}
class  Example3<in T>{
    fun secureToString(value: T?): String? {
        // only consuming a value of T type
        return value?.toString() ?: ""
    }
}
fun main() {


    // omit type arguments
    val e = Example(1, 23)
//    val ref:Example<Any,Any> = e // use out keyword on generics types
    println(e.t1)
    println(e.t2)

    val e1 = Example1(1, 23)
    val ref1:Example1<Any,Any> = e1 // assing to it's supertype


    //assign a reference of type Number to the reference of its subtype
    val e2:Example3<Number> = Example3()
    val ref:Example3<Int> = e2
    
}