
//converting ArrayList to HashMap
data class UserData(val id:Int? = null ,val name:String?=null)
fun main() {
    val users = ArrayList<UserData>()
    users.add(UserData(id = 1, name = "Jb"))
    users.add(UserData(id = 2, name = "Sk"))
    users.add(UserData(id = 3, name = "Ak"))
    users.add(UserData(id = 4, name = "Mk"))

    val map: MutableMap<Int, String> = HashMap()
    users.forEach { user -> map[user.id?:0] = user.name?:"" } // T.C ->   O(N)
    println(map) //{1=Jb, 2=Sk, 3=Ak, 4=Mk}



}