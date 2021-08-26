// Observable Properties 
import kotlin.properties.Delegates
class Personn{
    var ourValue: String by Delegates.observable("Hello World"){ property ,oldValue,newValue ->
         print("\n prop $property ")
         print("\n oldValue $oldValue")
         print("\n newValue $newValue ")
    }
}
fun main(args: Array<String>) {
    val p = Personn()
    print(p.ourValue)  // Hello World 
    p.ourValue = "change world"

}