// object -- . it's easy to create singleton 
// cannot be used on the right hand side of an assignment  statement.
// it's initialized on first time access , it's thread safe 

object Main {
    const val url = "https://dev.to/sanjaydraws"

    fun funct1(){
        println("this is funct1")
    }

}

fun main(args: Array<String>) {
    
    println(Main) // Main@4f023edb 
    println(Main) //Main@4f023edb 
    println(Main.url) // https://dev.to/sanjaydraws 
    Main.funct1() // this is funct1 

    


}