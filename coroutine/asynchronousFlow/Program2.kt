

fun simple(): Flow<Int> = flow { // flow builder
    for (i in 1..3) {
    delay(100) // pretend we are doing something useful here
    emit(i) // emit next value
    }
    }
    fun main() = runBlocking<Unit> {
    // Launch a concurrent coroutine to check if the main thread is blocked
    launch {
    for (k in 1..3) {
    println("I'm not blocked $k")
    delay(100)
    }