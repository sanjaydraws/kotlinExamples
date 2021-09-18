

fun main(args: Array<String>) {
    val l:List<String> = listOf("Hello","World", "Soething", "Near", "Quote", "Dear")
    print(l.filterContains("e",ignoreCase= true))
}

fun List<String>?.filterContains(chars :String, ignoreCase:Boolean = false):List<String>?{
    return try{
        this?.filter {
            it.contains(chars, ignoreCase = ignoreCase)
        }
        return this
    } catch(e:java.lang.Exception){
        ArrayList()
    }
}
