
fun getUserList(): List<User> {
    val users:ArrayList<User> = ArrayList()
    users.add(User(name = "JB", 23))
    users.add(User(name = "Shawn", 24))
    users.add(User(name = "LAra", 25))
    users.add(User(name = "Chris", 26))
    users.add(User(name = "Kon", 27))
    users.add(User(name = "Chris", 26))
    users.add(User(name = "Krab", 27))

    return users
}

fun main() {

    val  lastindex =  getUserList().lastIndex
    println(getUserList().get(lastindex))
    println(getUserList().lastIndexOf(User(name = "Kon", 27))) // last occurence of the object
    println(getUserList().last()) //User(name=Krab, age=27)
    //Returns the last element matching the given predicate.
    // if not found gice exception
    println(getUserList().last {
        it.age ==27
    })//User(name=Krab, age=27)
    println(getUserList().lastOrNull()) //User(name=Krab, age=27)

    // if not matches give null
    println(getUserList().lastOrNull{
        it.age == 90
    }) //User(name=Krab, age=27)

    println(getUserList().subList(0, 2)) //[User(name=JB, age=23), User(name=Shawn, age=24)]

    // give all values except n  last values
    println(getUserList().dropLast(2)) //[User(name=JB, age=23), User(name=Shawn, age=24), User(name=LAra, age=25), User(name=Chris, age=26), User(name=Kon, age=27)]
    println(getUserList().dropLastWhile {
        it.age == 27
    }) //[User(name=JB, age=23), User(name=Shawn, age=24), User(name=LAra, age=25), User(name=Chris, age=26), User(name=Kon, age=27), User(name=Chris, age=26)]

    //Returns the last element matching the given predicate, or null if no such element was found.
    println(getUserList().findLast {
        it.age == 34
    }) // null

    println(getUserList().indexOfLast {
        it.age == 20
    }) // -1  other returns index when matches with given predicates


    //Returns a list containing last n elements.
    println(getUserList().takeLast(2)) //[User(name=Chris, age=26), User(name=Krab, age=27)]
    println(getUserList().takeLastWhile {
        it.age == 23
    }) // []

    println(getUserList().takeLastWhile {
        it.age == 27
    }) // [User(name=Krab, age=27)]

    



}