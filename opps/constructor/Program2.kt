// Note:init blocks gets called before the constructor of this class is called.

class Person() {
    init {
        println("init block run")
    }
    val fullName: String =""

    constructor(fullName: String) :this(){
        println("constructor run")
    }

    companion object {
        init {
            println("static initialization")
        }
    }
}

fun main() {
    var person1 = Person("Ishan Kishan")
}
/**
 static initialization
init block run
constructor run
 * */