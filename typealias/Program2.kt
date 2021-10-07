
 // provide alias for Function type 

 val lamb = { x:Int, y:Int, z:Int -> print("$x $y $z") } 

 typealias MyHandler = (Int, Int, Int) -> Unit
 fun my(f:MyHandler){
     f.invoke(20,21,22)
 }
 fun main(){
     my(lamb)
 }
 
 
 
 