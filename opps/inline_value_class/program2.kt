@JvmInline
value class UserProfile(val username: String) {
    init {
        require(username.isNotEmpty()) {
            "Username shouldn't be empty"
        }
    }
    constructor(firstName: String, lastName: String) : this("$firstName $lastName") {
        require(lastName.isNotBlank()) {
            "Last name shouldn't be empty"
        }
    }

     val length: Int
        get() = username.length

    // Function to display user profile information
    fun displayProfileInfo() {
        println("Username: $username")
    }
}

fun main() {
    // Create UserProfile objects
    val userProfile1 = UserProfile("JohnDoe")
    val userProfile2 = UserProfile("JaneSmith")

    // Access the wrapped values and display profile information
    println("User 1 - Username: ${userProfile1.username}")
    userProfile1.displayProfileInfo()
    println("username length ${userProfile1.length}") 

    println("User 2 - Username: ${userProfile2.username}")
    userProfile2.displayProfileInfo()
    println("username length ${userProfile2.length}") 

}