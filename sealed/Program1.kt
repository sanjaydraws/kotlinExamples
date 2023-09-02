
/**
 * sealed class can have limited set of subclass
 * uses to represent set of possible states
 * ability to hold data and have more complex behavior.
 * abstract -> can not create instance directly
 * classes can have constructors, properties, and methods like regular classes.
 *  must be defined within the same Kotlin file where the sealed class is declared.
 * Sealed classes restrict the inheritance hierarchy by allowing only a predefined set of subclasses.
 *
 * useful in scenarios where you want to represent a fixed set of states or outcomes and ensure that all possible cases are handled explicitly in your code.
 * useful in Representing States or Results:
 * Pattern Matching and Exhaustiveness:  work well with Kotlin's when expression, ensuring that you handle all possible cases in a concise and safe manner.  helps prevent runtime errors and enforces better code readability.
 *
 * */
sealed class Result
data class Success(val value:Int):Result()
data class Error(val message:String):Result()

fun processResult(result: Result) {
    when (result) {
        is Success -> println("Success: ${result.value}")
        is Error -> println("Error: ${result.message}")
    }
}

fun main(){
    val succesResult = Success(42)
    val errorResult = Error("something went wrong")

    processResult(succesResult)
    processResult(errorResult)
}