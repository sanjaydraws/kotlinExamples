package visibilityModifier.y

import visibilityModifier.x.A

class B : A() {
    fun useProtectedMethod() {
        protectedMethod() // Accessing the protected method from the superclass A
    }
}

fun main() {
    val bObject = B()
    bObject.useProtectedMethod()
}