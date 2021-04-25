
// Eliminate nulls from an Iterable and array
fun main() {
    // val a:List<Int?> = listOf(1, 2,3, null)
    // val b:List<Int> = a.filterNotNull() // to remove null 
    
    // for (i in b) {
    //     print(i)  // 123 
    // }



    // Null Coalescing / Elvis Operator

    // val x  = null 
    // val y  = 5
    // val z:String = y?:"Nothing here"  //"Nothing here" evaluate  if x is null than value is 
    // print(z)

    // It is also possible to throw exceptions using the same syntax to abort code execution.

    // val data:String? = null
    // val result:String = data?:throw IllegalArgumentException("Value Can't be null")
    // print(result)
    // // Reminder: NullPointerExceptions can be thrown using the assertion operator (e.g. data!!.second()!!)


    // Nullable and Non-Nullable types

    var string:String = "Hello World" // non nullable 
    var nullableString:String? = null // nullable 
    // string = nullableString  can't assign nullable to non nullable 
    nullableString = string // works 


}

// Nullable and Non-Nullable types
// // normal type like String are not nullable ,to  make them to hold null values,, you have to explicitly denote
// // that by putting a ? behind them: String?  




