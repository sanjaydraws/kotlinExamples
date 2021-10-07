
 typealias Predicate<T> = (T) -> Boolean
 
 fun foo(p: Predicate<Int>) = p(42)
 fun main(){
     val f1: (Int) -> Boolean = { it > 0 }    
     print(foo(f1)) // true 
     
     val p: Predicate<Int> = { it > 0 }
     println(listOf(1, -2).filter(p)) // prints "[1]"
 }
 
 
 
 