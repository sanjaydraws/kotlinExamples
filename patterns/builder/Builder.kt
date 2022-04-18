
/**
 * Builder pattern when we have multiple parameters to initialize
 * some of params might be optional ,can build our class with optional params
 * for many parameters, it's impractical to build all constructor
 *
 * kotlin solves this problem partially with named parameter
 * but doesn't work with java code
 *
 *
 * */

//The Builder Pattern solves a very common problem in the object-oriented programming of how to flexibly create an immutable object without writing many constructors.
//

class Component private constructor(builder:Builder){
    var param1:String? = null
    var param2:String? = null
    var param3:String? = null


    class Builder{
      private  var param1:String? = null
      private  var param2:String? = null
      private  var param3:String? = null

      fun setParam1(param1:String) = apply { this.param1 = param1 }
      fun setParam2(param1:String) = apply { this.param2 = param1 }
      fun setParam3(param1:String) = apply { this.param3 = param1 }
      fun build() = Component(this)

      fun getParam1() = param1
      fun getParam2() = param2
      fun getParam3() = param3

    }
    init {
        param1 = builder.getParam1()
        param2 = builder.getParam2()
        param3 = builder.getParam3()
    }
}

fun main() {
    val component  =  Component.Builder()
        .setParam1("some Value1")
        .setParam2("someValue2")
        .setParam3("someVal;ue3")
        .build()

    println(component.param1)
    println(component.param2)
}