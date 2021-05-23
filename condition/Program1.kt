

enum class Day {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;


    companion object{
        fun doOnDay(day :Day ){
            when (day){
                Day.Sunday ->  print("Do something on sunday ")
                Day.Monday, Day.Tuesday -> print("Do something on Monday,tuesday ")
                else -> print("Nothing")
            }
        }
    }
}


fun main( ){
  // when statement mathes using == operator 
  val x:String = "English"
  val y:String = "Sarah"
  val names = listOf("John", "Sarah", "Tim", "Maggie") 

//   when(x){
//     "English" -> print("How are you?")
//     "German" -> print("Wie geht es dir?")
//     else -> print("I don't know that language yet :(")
//   }

  when(y){
      in names -> print("it prints when y is presen in list ") 
    //   !in 1..10 -> print("Argument was not in the range from 1 to 10")
    //   is String -> print(x.length) // Due to smart casting, you can use String-functions here
  }

//   =========================================
//   When-statement as expression
    // val greet = when(y) {
    //     "English" -> "How are you?"
    //     "German" -> "Wie geht es dir?"
    //     else -> "I don't know that language yet :("
    // }
    // print(greet)

    // =====================================

    // val str = if (condition) "Condition met!" else "Condition not met!"
    // val str = if (y == "sarah"){
    //     "Condition1 met!"
    //     } else if (y == "john") {
    //     "Condition2 met!"
    //     } else {
    //     "Conditions not met!"
    //     }
    //     print(str)

    // ===================================================
    //  When-statement instead of if-else-if chains

    //else is option like in if else branch 
    // when {
    //     y.length == 0 -> print("The string is empty!")
    //     y.length < 6 -> print("The string is short!")
    //     // else -> print("The string is long!")
    //     }

    // =============================================
    // can use multibranch like if elese 
    // when {
    //     condition -> {
    //          //  doSomething()
    //          //doSomeMore()
    //     }
    //     else -> doSomethingElse()
    //     }
   
    // compare with multiple condition
   
    



    // ========================================
    // When-statement with enums
    // Day.doOnDay(Day.Tuesday)

    

}
