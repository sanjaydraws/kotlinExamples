// If the compiler can infer that an object can't be null at a certain point, you don't have to use the special operators
// anymore:


fun main() {
    var string:String? = "Hello"
    var string1:String? = null
    // print(string.length) //compile error

    print(string1?.length) // null   not get compile time error 

    if(string !=null){
         // The compiler now knows that string can't be null
        print(string.length)
    }


    // Assertion 
    //     !! suffixes ignore nullability and returns a non-null version of that type. KotlinNullPointerException will be
    // thrown if the object is a null

    val message:String? = null
    val message1:String? = "3"   
    // println(message!!)//java.lang.NullPointerException at runtime app crash 
    print(message1) //3 


    





}