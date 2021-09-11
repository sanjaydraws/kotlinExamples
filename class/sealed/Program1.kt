// sealed class in kotlin 
//sealed class is abstract by itself,  sealed class can't be directly  instanstiated. can have abstract memebers 
// sealed class constructor can have two visibility protected(by default) or private 
 // sealed class are similar to enum class the set of value for an enum type is also restricted and each enum constant exist only as single instance
// subclass of sealed class can have multiple instance with its own state 


// to declare sealed class put  seled modifier before it's name 
sealed interface Expr 

sealed class MathExpr():Expr 

data class Const(val number:Double) :MathExpr()
data class Sum(val e1:Expr, val e2:Expr) :MathExpr()

object NotAnNumber: Expr 


