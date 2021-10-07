// type alias provide alternative name for existing type 
// if type name is longer can be introduces , it will not introduced new types, they are equailent to curusponding types

data class User(
    val name:String? = null,
    val number:List<Number> = ArrayList() 
)


data class User(
    val name:String? = null,
)

    typealias u = Int
    typealias l = ArrayList<String>
fun main(){
    val users:l = ArrayList()
    users.add("Jb")
    users.add("hdshj")
    print(users)
    val x:u = 34
    print(x)
}




/* 
// type alias for inner class 
class A {
inner class Inner
}
class B {
   inner class Inner
}
    typealias AInner = A.Inner
    typealias BInner = B.Inner

    */

 // provide alias for Function type 
 
 
val lamb = { x:Int, y:Int, z:Int -> print("$x $y $z") } 

typealias MyHandler = (Int, Int, Int) -> Unit
fun my(f:MyHandler){
    f.invoke(20,21,22)
}
fun main(){
    my(lamb)
}

typealias Predicate<T> = (T) -> Boolean


