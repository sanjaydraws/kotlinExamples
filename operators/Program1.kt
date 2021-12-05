
/**
 * operator can be defined as extension or member function , predefined set of operators
 * invoke operator,
 * in compiled to rangeTo
 * .. contains
 * destrucuring
 * set ,get enable index acees via []
 * plus , unaryPlus, not, inc, dec
 * */


data class NumericHolder(val a:Int, val b:Int):Comparable<NumericHolder>{
    override fun compareTo(other: NumericHolder): Int {
        return  (a -b ).compareTo(other.a + other.b)
    }
}
//data class NumericHolder(val a:Int, val b:Int){
//
//}

operator fun NumericHolder.plus(other: NumericHolder):NumericHolder{
    return NumericHolder(a + other.a , b + other.b)
}

operator fun NumericHolder.minus(other: NumericHolder):NumericHolder{
    return NumericHolder(a - other.a , b -other.b)
}
operator fun NumericHolder.inc():NumericHolder{
    return NumericHolder(a +1 , b + 1)
}
operator fun NumericHolder.dec():NumericHolder{
    return NumericHolder(a -1 , b -1)
}

operator fun NumericHolder.get(i :Int):Int{
    return when(i){
        0 -> a
        1 ->b
        else -> throw IndexOutOfBoundsException()
    }
}

operator fun NumericHolder.contains(i:Int):Boolean {
    return a == i || b == i
}
operator fun NumericHolder.invoke(){
    println(this)
}

/**
 * Redundant since type is a "Comparable<NumericHolder> already"
 * */
operator fun NumericHolder.compareTo(other: NumericHolder): Int {
    return this.compareTo(other)
}

/* 
fun rangeExample(subtracted:NumericHolder, added:NumericHolder){
    // uses extension operator `Comparable<T>::rangeTo`
    val holderRange:ClosedRange<NumericHolder> = subtracted..added
    for(e in holderRange){
        println(e)
        if(e.a == 5){
            break
        }
    }
}

operator fun ClosedRange<NumericHolder>.iterator():Iterator<NumericHolder> =
    object :Iterator<NumericHolder>{
        var current:NumericHolder = start
        override fun hasNext(): Boolean {
            return current <endInclusive
        }

        override fun next(): NumericHolder {
            return  current ++
        }
    }
*/

fun main() {
    val n1 = NumericHolder(0, 2)
    val n2 = NumericHolder(11,9)
    println(n1.compareTo(n2)) // 1

    val added :NumericHolder = NumericHolder(1,2) + NumericHolder(2,3)
    println(added) // NumericHolder(a=3, b=5)
    val subtract = NumericHolder(1,2)- NumericHolder(2,3)
    println(subtract) //NumericHolder(a=-1, b=-1)

    var nHolder:NumericHolder = NumericHolder(1,2)
    val incremented:NumericHolder = nHolder++
    println(nHolder) // NumericHolder(a=2, b=3)
    println(incremented) //NumericHolder(a=1, b=2)

    val dec:NumericHolder = nHolder--
    println(nHolder)//NumericHolder(a=1, b=2)

    // for get
    println(nHolder[0]) // 1
    println(nHolder[0] + nHolder[1]) // 3

    // for contains
    println( 5 in added) // true
    println( 5 !in added) // false

    // invoke will be called
    val invoked:Unit = added() //NumericHolder(a=3, b=5)
    println(invoked) //kotlin.Unit


    // example for compare to
//    println(added > subtract)
//    println(added >= subtract)
//    println(added < subtract)
//    println(added <= subtract)


    // rangeExample(subtract, added)





}
