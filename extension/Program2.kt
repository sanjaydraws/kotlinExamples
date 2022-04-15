


//Label Reference in Kotlin
//Any expression in Kotlin may be marked with label
//These labels are really helpful when dealing with nested loops or nested functions.
fun main() {
    //   for(i in 1..3){
    //        for(j in 5..7){
    //            if(j == 6) break
    //            println(j)
    //        }
    //        if(i == 2)
    //        println(i)
    //    } // 5 5 2 5
    
       loop@ for(i in 1..3){
            for(j in 5..7){
                if(j == 7) break@loop
                println(j)
            }
            if(i == 2) continue@loop
            println(i)
        }  // 5 6
    
    
    
    
        someFunction()
        some2()
    }
    /***
    With function literals, local functions and object expression,
    functions can be nested in Kotlin. Qualified returns allow us to
    return from an outer function.
     **/
    fun someFunction(){
    //    listOf(1,2,3,4,5).forEach {
    //        if(it==3) return
    //        print( "${it} ")
    //    } // 1,2
    
        // also use implicit label don't need to define label
        listOf(1,2,3,4,5).forEach lambda@{
            if(it==3) return@lambda
            print( "${it} ")
        }  // 1245
    
      println()
        listOf(1,2,3,4,5).forEach {
            if(it==3) return@forEach
            print( "${it} ")
        } // 1245
    
         println()
    //   in above ex. replace the lambda expression with an anonymous function.
    //     return in  anonymous function
    //    will return anonymous function only rest code execute
        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
            if (value == 3) return
            print("$value ")
        }) // 1245
    
    
    
    }
    fun some2(){
        println()
        //    to break the loop or function execution based on some condition, we can use a nested labmda expression along with label referencing.
        run loop@{
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) return@loop
                print(it)
                print(" ")
            }
        }
        println("it's printed") // 1 2 it's printed
    
    }