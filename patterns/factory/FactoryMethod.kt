
/**
 * Factory Method or Factory Pattern 
 *
 * provides a way to access functionality without caring about implementation
 * */

sealed class Country{
    object Canada:Country()
}

object Spain:Country()
class Greece(val someProperty:String):Country()
data class USA(val someProperty:String):Country()


class Currency(val code:String)


object CurrencyFactory{
    fun currencyForCountry(country: Country):Currency=
        when(country){
            is Spain -> Currency("EUR")
            is Greece -> Currency("EUR")
            is USA -> Currency("USD")
            is Country.Canada -> Currency("CAD")
        }

}

fun main() {
    currencyTest()
}
fun currencyTest(){
    val greekCurrency:String = CurrencyFactory.currencyForCountry(Greece("")).code
    println("Greek Currency $greekCurrency")
    val usaCurrency:String = CurrencyFactory.currencyForCountry(USA("")).code
    println("USA Currency $usaCurrency")

}
