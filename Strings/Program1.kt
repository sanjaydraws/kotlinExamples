/**
 *  extract string from substring
 */

fun String?.safeSubstring(startIndex: Int, endIndex: Int): String?{
    return try {
        this?.substring(startIndex = startIndex , endIndex =endIndex) ?: ""
    }catch (e:Exception){
        print(e.printStackTrace())
        ""
    }
}

fun main(args: Array<String>) {
    val x:String? = null 
    print(x.safeSubstring(0, 1)) 
    print("dhjsjhd".safeSubstring(0,4)) // dhjs 
}