fun sum(a : Int, b: Int): String{
    return ""
}

// defaultargument
fun dfFun1(a : Int=456, b: String="helko"){
    println(a)
    println(b)
}

fun main() {
    print(sum(7,8))
    var sum = arrayOf(3,4,2,4,23,4,23,4).sum()
    println(sum)

    dfFun1()
    dfFun1(2)
   
   
}