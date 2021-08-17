

import kotlin.io.print
// kotlin support  delegation pattern using by keyword 
// it allows the derived class to access all the implemented public methods of an interface 
// through a specific object.

interface Base {
    fun print()
}

class BaseImpl(val x:String):Base{
    override fun print(){
        println("Printing impl")
    }
}
class BaseAnotherImpl():Base{
    override fun print(){
        println("Printing Another impl")
    }
}

// class Derived (val b:Base) :Base{
//     override fun print(){
//         b.print()  // delegating the responsebality  of b reference
//     }
// }

// kotlin spports this natively use this code
class Derived(b:Base):Base by b 



fun main(args: Array<String>) {
    val b1 = BaseImpl("Hell")
    Derived(b1).print()

    val b2 = BaseAnotherImpl()//Printing impl
    Derived(b2).print() // Printing Another impl    
}