// Define inline classes for username and hashed password
@JvmInline
value class Username(val value: String)
@JvmInline
value class HashedPassword(val value: String)

// Function to authenticate a user
fun authenticateUser(username: Username, password: HashedPassword): Boolean {
    // In a real-world scenario, you would perform authentication logic here
    // For simplicity, let's just check if the lengths of username and password match
    return username.value.length > 0 && password.value.length > 0
}

fun main() {
    // Simulating Android usage in an activity or fragment

    // Create username and hashed password objects using inline classes
    val user1 = Username("john_doe")
    val password1 = HashedPassword("hashed_password_123")

    val user2 = Username("jane_smith")
    val password2 = HashedPassword("hashed_password_456")

    // Authenticate users using the inline classes
    val isAuthenticated1 = authenticateUser(user1, password1)
    val isAuthenticated2 = authenticateUser(user2, password2)

    // Display authentication results
    println("User 1 authenticated: $isAuthenticated1")
    println("User 2 authenticated: $isAuthenticated2")
}
