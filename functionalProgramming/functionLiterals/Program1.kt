// Function literals can be assigned to a variable just like other literals:
// simply write the code in enclose braces 

val literal = {
    print("Hello World ")
}
val literal2 = { msg: String -> print(msg) }

fun main(args: Array<String>) {
    literal() // Hello World 
    literal2("Hello How are you ")

    
}