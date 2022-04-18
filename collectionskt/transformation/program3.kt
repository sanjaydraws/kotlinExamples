



/**
 * Groups By
 * */

fun main() {
    val x = listOf("Peter", "Kevvin", "James","Parker")
    println(x.groupBy { it.first().uppercase()}) //{P=[Peter, Parker], K=[Kevvin], J=[James]}

    println(x.groupBy(keySelector = {
         it.lastIndex
    }, valueTransform = {it.lowercase()}))


//    println(x.first().)

}
