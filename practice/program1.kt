// kotlin Program to Print an Integer Entered By the User

fun main(){
    print("Enter a User Name")
    val userInput = readLine()

    try{
        val = userInput?.toInt()
        if(userInput!=null){
            println("You entered: $userInteger")
        }else{
            println("Invalid Input. Please enter a valid integer")
        }
    }
    catch(e:NumberFormatException){
        println("Invalid input. Please enter a valid integer.")
    }
}