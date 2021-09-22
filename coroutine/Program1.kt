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


