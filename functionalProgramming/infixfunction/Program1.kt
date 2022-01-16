/**
* infix function
 * calling without using parenthesis and dot.
 * must be member or extension function
 * must have single parameter no varargs or no default value
 * to, bitwise operators , String::zip ,String::matches
* */



// custom function
fun<T> List<T>.combineWith(other:List<T> ):List<T>{
    val combined:MutableList<T> = mutableListOf<T>()
    combined.addAll(this)
    combined.addAll(other)
    return combined
}
// good approach
 infix fun <T> List<T>.improvedCombinedVersion(other:List<T>):List<T>{
    return this + other
}


fun main() {

    val all:List<Int> = listOf(1,2,4).combineWith(listOf(0,5,6))
    println(all) //[1, 2, 4, 0, 5, 6]

    println(listOf(1,3,0) improvedCombinedVersion(listOf(1,4,5))) //[1, 3, 0, 1, 4, 5]


}