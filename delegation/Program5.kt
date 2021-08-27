// vetoable - 

import kotlin.properties.Delegates

class Person1{
    var ourValue by Delegates.vetoable("Hello") {
        property, oldValue, newValue -> 
        newValue.length > oldValue.length  // condition should be true to assign new value 
    }
}


fun main(args: Array<String>) {
    val p1 = Person1()
    p1.ourValue = "World"  // Hello
    p1.ourValue = "Worlds"
    println(p1.ourValue) // Worlds 


}