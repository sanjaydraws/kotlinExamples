
data class User(val firstName:String? = null , val age:Int? = null )



sealed class Resource<T>(
    val data:T? = null ,
    val message:String? = null 
){
     class Success<T>( data:T? = null, message:String? = null ):Resource<T>(data,message) 
    class Loading<T>(data:T? = null ):Resource<T>(data)
    class Error<T>(message:String,data:T? = null ):Resource<T>(data, message)
}

fun getUserData():Resource<User>{
    return  Resource.Success(User("Justin",45), message ="Suceess")
}


fun main(args: Array<String>) {

    val r =getUserData()
    print(r.data)
    print(r.message) 

    when(r.message){
       "Suceess" ->{
            print("Success")
        }


    }


}

