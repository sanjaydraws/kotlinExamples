import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun main()  = runBlocking{
    val channel = Channel<Int>()
    launch{
        for(x in 1..5) channel.send( x *x)
    }
    // here we print five received integers
    repeat(5) {
        print("djksj")
        println(channel.receive())
    }
    println("Done")
 
    
    /* 
    djksj1
djksj4
djksj9
djksj16
djksj25
Done
    */

    
}