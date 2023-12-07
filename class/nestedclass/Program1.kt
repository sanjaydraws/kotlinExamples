


class Outer {
    private val outerProperty: Int = 10
    
    class Nested {
        fun accessOuterProperty(outer: Outer) {
            println("Accessing outer property: ${outer.outerProperty}")
        }
    }
}

fun main() {
    val outer = Outer()
    val nested = Outer.Nested()

    nested.accessOuterProperty(outer) // Output: Accessing outer property: 10
}

