

data class User(
    var name:String?,
    var age:Int?,
   ){
       fun printUserData(){
           println("name $name")
       }
   }
   
   
   fun getList(): List<User> {
       val users:ArrayList<User> = ArrayList()
       users.add(User(name = "JB", 23))
       users.add(User(name = "Shawn", 24))
       users.add(User(name = "LAra", 25))
       users.add(User(name = "Chris", 26))
       users.add(User(name = "Kon", 27))
       return users
   }
   
   fun main() {
       val m = mutableListOf<User>()
   
       // perform  action on each element
       getList().forEach{
           println(it.age)
       }
       val x = getList().forEachIndexed{ index: Int, user: User ->
           if(user.age == 23)
               user.copy(name = "",age = 67)
       }
   
   
       val modList1 = ArrayList(getList()).getModifyList()
       println(modList1)
       val modList2 = ArrayList(getList()).getModifyList2()
       println(modList2)
   
   
   }
   
   
   // to modify age if contains
   fun  ArrayList<User>.getModifyList(): ArrayList<User> {
       this.forEachIndexed { index, user ->
           user.takeIf { it.age== 23}?.let {
   //            this[index] = it.copy(age = 90) //another way
               this[index].age = 45
           }?.apply {
             user.printUserData()
           }
       }
       return this
   }
   fun  ArrayList<User>.getModifyList2(): ArrayList<User> {
       this.forEachIndexed { index, user ->
           user.takeUnless { it.age== 23}?.let {
   //            this[index] = it.copy(age = 90) //another way
               this[index].age = 45
           }
       }
       return this
   }
   