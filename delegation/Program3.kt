// standard delegates 
// lazy property - it used to create an object that is initialized only first access  to the property value and store vaue and return 

// lazy is just a function function 
// public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> T): Lazy<T> =
//         when (mode) {
//             LazyThreadSafetyMode.SYNCHRONIZED -> SynchronizedLazyImpl(initializer)
//             LazyThreadSafetyMode.PUBLICATION -> SafePublicationLazyImpl(initializer)
//             LazyThreadSafetyMode.NONE -> UnsafeLazyImpl(initializer)
//         }

// by default lazy is synchronized the value is computed only in one thread ,and value will be same in all thread 
// LazyThreadSafetyMode.PUBLICATION  multiple thread can execute simutanesly 
// LazyThreadSafetyMode.None  -> unsafe thread 


val ourValue:String by lazy(LazyThreadSafetyMode.NONE){
    println("Hello World") 
    callAnother() // only first time run
    "\nHello what is going on "
}

 fun callAnother(){
    print("another fun ")
}

 fun main(args: Array<String>) {
     println(ourValue) //Hello what is going on
     println(ourValue) //Hello what is going on
     println(ourValue) //Hello what is going on
    
}


