// A coroutine is an instance of suspendable computation. 
// It may suspend its execution in one thread and resume in another one.
//Coroutines can be thought of as light-weight threads

// example 1
fun main() = runBlocking{
    
    println(currentCoroutineContext())
    launch{
        // launch a new coroutine and continoue 
        delay(100L)
        println("Hello World1 ")
        println(currentCoroutineContext())
    }
    launch{
        // launch a new coroutine and continoue 
        delay(100L)
        println("Hello World2 ")
        println(currentCoroutineContext())
    }
    println("Hello world3")
}

// launch -> coroutine Builder , it launches new coroutine concurrently , with rest of code 
// delay() - it suspends the coroutine for specific time , it does not block the underlying thread, but allows other coroutine to run and use the underlying thread for their code 

// runBlocking is also coroutine builder , it is bridge b/q non coroutine world of regular main and and code with coroutine inside runblocking 
//The name of runBlocking means that the thread that runs it (in this case â€” the main thread) gets blocked for the
// duration of the call, until all the coroutines inside runBlocking { ... } complete their execution


// Structured concurrency 
// Coroutines follow a principle of structured concurrency which means that new coroutines can be only launched in a
// specific CoroutineScope which delimits the lifetime of the coroutine

// suspend function 

fun main() = runBlocking{
    launch{
        print(doWorld())
    }
    println("Hello")
}

// suspend function
suspend fun doWorld():Int {
    delay(1000L)
    println("World!")
    return 0
}


// ==================================
// scope builder 
// can create your own scope using the coroutine scope builder 
// runBlocking and coroutineScope builders may look similar because they both wait for their body and all its children to
// complete
// runblocking - blocks the current thread for waiting , that's why it's regular function 
// coroutineScope - just suspends,releasing the underlying thread for other usages



fun main()= runBlocking{
    println(currentCoroutineContext())//BlockingCoroutine
    myWorld()
}
suspend fun myWorld() = coroutineScope{
    println(currentCoroutineContext())//ScopeCoroutine
    launch{
        delay(1000L)
        println("World")
        println(currentCoroutineContext()) // StandaloneCoroutine
    }
    println("World2")
}

// =======================================================
// scope Builder and cocurrency 
// A coroutineScope builder can be used inside any suspending function to perform multiple concurrent operations. Let's
// launch two concurrent coroutines inside a doWorld suspending function:


fun  main() = runBlocking{
    doWorld()
    println("Done")
}
// Concurrently executes both sections
suspend fun doWorld() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}


/*output
Hello
World 1
World 2
Done
 */

//  an explicit job 
//  ========================
// launch coroutine builder returns a Job object that is handle to the launched coroutine 
// and can be used  to explicitly wait for it's completion .


fun main() = runBlocking{
    
    // launch coroutine and keep reference to it's job
    val job1 = launch{
        // 
        delay(1000L)
        println("H1")
    }
    println("H2")
    val job2 = launch{
        // 
        delay(1000L)
        println("H3")
    }
    job1.join() // wait until child coroutine completes
    job2.join()
    
    println("Done")
}
/*
H2
H3
H1
Done
*/

// coroutine ARE light weight
// It launches 100K coroutines and, after 5 seconds, each coroutine prints a dot.
// Now, try that with threads (remove runBlocking, replace launch with thread, and replace delay with Thread.sleep ).
// What would happen? (Most likely your code will produce some sort of out-of-memory error)

fun main() = runBlocking{
    repeat(100000) { // launch a lot of coroutines
        launch {
            delay(100L)
            println("print")
        }
    }
}


// cancelation and timeouts 
// ==============================
// Cancelling coroutine execution ->
// The launch function returns a Job that can be used to cancel the running coroutine:


// As soon as main invokes job.cancel, we don't see any output from the other coroutine because it was cancelled. There
// is also a Job extension function cancelAndJoin that combines cancel and join invocations.


fun main() = runBlocking {
    //sampleStart
    val job = launch {
        repeat(1000) { i ->
            println("job:downloading $i ...")
            delay(500L)
            
        }
    }
delay(1300L) // delay a bit
println("main: I'm tired of waiting!")
job.cancel() // cancels the job
job.join() // waits for job's completion
println("main: Now I can quit.")
//sampleEnd
}

// Cancellation is cooperative -> 
// All the suspending functions in kotlinx.coroutines are cancellable. 
// However, if a coroutine is working in a computation and does not check for
// cancellation, then it cannot be cancelled,
// Run it to see that it continues to print "I'm sleeping" even after cancellation until the job completes by itself after five
// iterations.

fun main() = runBlocking {
    //sampleStart
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
    var nextPrintTime = startTime
    var i = 0
    while (i < 5) { // computation loop, just wastes CPU
    // print a message twice a second
    if (System.currentTimeMillis() >= nextPrintTime) {
    println("job: I'm sleeping ${i++} ...")
    nextPrintTime += 500L
    }
    }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion
    println("main: Now I can quit.")
    //sampleEnd
    }



    // Making computation code cancellable
    // isActive is an extension property available inside the coroutine via the
    // CoroutineScope object.
    fun main() = runBlocking {
        var startTime = System.currentTimeMillis()
        var job = launch(Dispatchers.Default){
            var nextPrintTime = startTime
            var i = 0 
            while(isActive){
                //cancelable computational loop 
                // print a message twice a second 
                if(System.currentTimeMillis() >= nextPrintTime){
                    println("job: Im sleeping ${i++}..")
                    nextPrintTime += 500L
                }
            }
        }
        delay(1300L) // delay a bit 
        println("I'm tired of waiting ")
        job.cancelAndJoin() // cancel the job and waits for it completion
        print("main : now i can quit")
    }
    

    // Closing resources with  finally

    // cancellable suspending function throw CancelationException which can be handled 
    import kotlinx.coroutines.*
    fun main() = runBlocking {
        val job = launch{
            try{
                repeat(100){
                    i -> 
                    println("job: im sleeping $i")
                    delay(500L)
                }
            }
            finally{
                println("job: i'm running finally")
            }
        }
        delay(1300L)// delay a bit 
        println("main: i'm tired of waiting ")
        job.cancelAndJoin()
        println("main: Now I can Quit")
    }
    




    // Run non-cancellable  block Any attempt
    //     in the rare case when you need to suspend in a cancelled
    // coroutine you can wrap the corresponding code in withContext(NonCancellable) {...} using withContext function and
    // NonCancellable context as the following example shows:
    import kotlinx.coroutines.*
    fun main() = runBlocking {
        val job = launch{
            try{
                repeat(100){
                    i -> 
                    println("job: im sleeping $i")
                    delay(500L)
                }
            }
            finally{
                withContext(NonCancellable){
                    println("job: i'm running finally")
                    delay(100L)
                    println("job: And I've just delayed for 1 sec because I'm non-cancellable")
                }
            }
        }
        delay(1300L)// delay a bit 
        println("main: i'm tired of waiting ")
        job.cancelAndJoin()
        println("main: Now I can Quit")
    }
    
 /**
  * job: im sleeping 0
job: im sleeping 1
job: im sleeping 2
main: i'm tired of waiting 
job: i'm running finally
job: And I've just delayed for 1 sec because I'm non-cancellable
main: Now I can Quit
   */   




//   Timeout
// =================
/*The most obvious practical reason to cancel execution of a coroutine is because its execution time has exceeded
some timeout. While you can manually track the reference to the corresponding Job and launch a separate coroutine to
cancel the tracked one after delay*/

// example
fun main() = runBlocking{
    withTimeout(1300L){
        repeat(1000){
            i -> println("I'm sleeping $i")
            delay(500L)
        }
    }
}

/* 
I'm sleeping 0
I'm sleeping 1
I'm sleeping 2
Exception in thread "main" kotlinx.coroutines.TimeoutCancellationException: */ 


// use the withTimeoutOrNull function that is similar to withTimeout but returns null on timeout
// instead of throwing an exception:



fun main() = runBlocking{
    val result = withTimeoutOrNull(1300L){
         repeat(1000){
             i -> println("I'm sleeping $i")
             delay(500L)
         }
         "Done" // will get cancelled before it produces this result
     }
    println("Result is $result")
 }

 /* 
 I'm sleeping 0
I'm sleeping 1
I'm sleeping 2
Result is null */


