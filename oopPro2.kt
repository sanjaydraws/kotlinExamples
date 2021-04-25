// inheritence 

open class baseClass{
    val name = "GeeksforGeeks"
    fun A(){ 
        println("Base Class") 
    } 
}
class derivedClass:baseClass(){
     fun B() { 
        println(name)           //inherit name property  
        println("Derived class")   
    } 
}


fun main() {
     val derived = derivedClass()
     derived.A()
   
}