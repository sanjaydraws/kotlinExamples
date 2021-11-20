
/**
 * functional same interface can  have multiple non abstract method but only one abstract method
 *
 * */

// functional interface example
interface CatchAble {
    fun invoke()
}

// functional interface example
fun interface FunctInterface{
    fun invoke(list: List<Int>) :List<Int>
}


fun main(){

    // if we don't use SAM conversion
    val run  = object : CatchAble {
        override fun invoke() {
            print("Invoking Runnable ") // Invoking Runnable

        }
    }
    run.invoke()

    // if don't SAM use SAM conversion
    val fi = object :FunctInterface{
        override fun invoke(list: List<Int>): List<Int> {
            return  list.filter { pre -> pre %2 ==0 }
        }
    }
    print(fi.invoke(listOf(2,5,1,5,79,0))) // [2, 0]

    // using same conversion
    val fi2 = FunctInterface {
        it.filter { pre -> pre %2 == 0 }
    }
    print(fi2.invoke(listOf(2,5,1,5,79,0))) // [2, 0]




}