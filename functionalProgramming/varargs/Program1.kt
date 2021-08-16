
// in java looks like 
// public void println(String.. args) { } 

// allow function to accept number of arguments 
fun printAnimal(vararg animals:String):Unit{
    
    for (animal in animals) {
        print("\n $animal")
    }
}
fun printAnimal2(a1: String, vararg animals:String):Unit{
    print("first -> $a1") // first argument goes in starting parameter 
    for (animal in animals) {
        print("\n $animal")
    }
}

fun passFun(vararg funs:()->Unit){
   for (f in funs) {
       f()
   }
}
fun f1(){
    print("function 1 , ")
}
fun f2(){
    print("function 2")
}

fun <T> printAny(vararg varg: T) {
    varg.forEach { println(it) }
}

fun main(args: Array<String>) {
    printAnimal("Lion", "Cheetah", "Cat", "Hayena")
    print("\n")
    printAnimal2("Elephant","Lion", "Cheetah", "Cat", "Hayena")
    passFun(::f1,::f2)

    printAny(34,56,89)
}



// ?? can we pass function  in varargs s