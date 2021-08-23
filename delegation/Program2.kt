

import kotlin.text.trim
import kotlin.reflect.KProperty
// Delegated properties
// Delgate is just class ,that allows us to seperate all logic of getter and setters sot it can be   reused code
// so  if want to use same code for mare than one property ,then don't need to apply same code for every property  ex:

// class User{
//     var firstName:String? =null 
//         set(value){
//             if(value!= null )
//                 field = value.trim()
//         }
    
//     var lastName:String? = null 
//         set(value){
//             if(value!= null )
//                 field = value.trim()
//         }

// }

class User{
        var firstName:String? by TrimDelegate()       
        var lastName:String? by TrimDelegate() 

        // to print object 
        override fun toString():String{
            return "$firstName $lastName"  
        } 
}


class TrimDelegate {
    var trimmedString:String ? = null 

    // thisRef is calling object 
    operator fun setValue( thisRef:Any,property:KProperty<*>, value:String?){
        // (thisRef as User).firstName // to access member 
        value?.let { 
            trimmedString = it.trim()
         }   
    }
    operator fun getValue(thisRef:Any, property:KProperty<*>):String?{
        return trimmedString
    }

}


fun main(args: Array<String>) {

    val user1 = User()
    user1.firstName = "  justin "
    user1.lastName = " Bieber    "
    print(user1.firstName ) // justin 
    print("\n$user1")//justin Bieber

}