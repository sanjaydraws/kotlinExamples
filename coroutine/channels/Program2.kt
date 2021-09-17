
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun main()  = runBlocking{
    val channel = Channel<Int>()
    launch{
        for(x in 1..5) channel.send( x *x)
        channel.close() // we are done sending
    }
   // here we print received values using for loop 
   // until channel is closed 
   for(y in channel) println(y)
   println("Done")
    
}