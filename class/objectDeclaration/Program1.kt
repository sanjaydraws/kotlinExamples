// object -- . it's easy to create singleton 
// cannot be used on the right hand side of an assignment  statement.
// it's initialized on first time access , it's thread safe 

class Gson(){
}

object AppModule {
    const val url = "https://dev.to/sanjaydraws"

    fun funct1(){
        println("this is funct1")
    }

    @object foo {
        return Gson()
    }

}

fun main(args: Array<String>) {
    
    println(AppModule) // Main@4f023edb 
    println(AppModule) //Main@4f023edb 
    println(AppModule.url) // https://dev.to/sanjaydraws 
    println(AppModule.foo)
    println(AppModule.foo)


}