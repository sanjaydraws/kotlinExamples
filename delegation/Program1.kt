

import kotlin.io.print
// kotlin support  delegation pattern using by keyword 
// it allows the derived class to access all the implemented public methods of an interface 
// through a specific object.

interface Base {
    val msg: String?
    fun print()
}

class BaseImpl(val x:String):Base{
    override val msg: String?  = x  
    override fun print(){
        println("Printing impl ${msg}}")
    }
}
class BaseAnotherImpl():Base{
    override val msg: String?  = null  
    override fun print(){
        println("Printing Another impl ")
    }
}

// class Derived (val b:Base) :Base{
//     override fun print(){
//         b.print()  // delegating the responsebality  of b reference
//     }
// }

// kotlin spports this natively use this code
// Overriding  member of an interface implemented by delegation
class Derived(b:Base):Base by b  {
    override val msg  = "2"   // can't access this property by b reference 

    override fun print(){
        print("\noverriding  print method of interface ")
        
    }
}



fun main(args: Array<String>) {
    val b1 = BaseImpl("Hell")
    Derived(b1).print()

    val b2 = BaseAnotherImpl()//Printing impl Hell
    Derived(b2).print() // Printing Another impl 
    
    // after overiding 
    val d = Derived(b1)
    d.print() // overriding  print method of interface
    print(d.msg) // 2 

zzzz

}