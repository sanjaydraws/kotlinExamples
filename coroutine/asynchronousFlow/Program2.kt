import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun simple():Flow<Int> = flow{
    // flow builder 
    for(i in 1..3){
        delay(100) // pretending we are doing something usefull here 
        emit(1)
    }
}

fun main() = runBlocking<Unit>{
    // Launch a concurrent coroutine to check if the main thread is blocked
    launch{
        for(k in 1..3){
            println("I am not blocked $k")
            delay(100)
        }
    }
    
    // collect the flow 
    simple().collect{
        value -> println(value)
    }
}
