// Observable Properties 
//lambda will be triggerd every time when value of property will be changed. 
import kotlin.properties.Delegates
class Personn{
    var ourValue: String by Delegates.observable("Hello World"){ property ,oldValue,newValue ->
         print("\n prop $property ")
         print("\n oldValue $oldValue ") 
         print("\n newValue $newValue ")
    }
}
fun main(args: Array<String>) {
    val p = Personn()
    print(p.ourValue)  // Hello World 
    p.ourValue = "change world"

}

// output
// Hello World
//  prop property ourValue (Kotlin reflection is not available)
//  oldValue Hello World
//  newValue change world