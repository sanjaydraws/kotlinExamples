// type alias provide alternative name for existing type 
// if type name is longer can be introduces , it will not introduced new types, they are equailent to curusponding types


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
