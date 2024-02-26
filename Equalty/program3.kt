class Person(val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other){
            print("1->")
            return true
        } 
        if (other !is Person) {
            print("2 ->")
            return false
        }
        print("3->")
        return this.age == other.age
    }

    // You should also override hashCode when overriding equals
    override fun hashCode(): Int {
        return age
    }
}

fun main() {
    val p1 = Person(25)
    val p2 = Person(25)
    val p3 = Person(30)
    val p4 = p1

    println(p1 == p2) // true, because the content (age) is the same
    println(p1 == p3) // false, because the content (age) is different

    println(p1.hashCode()) //25
    println(p2.hashCode()) // 25
    println(p3.hashCode()) //30 
    // if equals method not override in normal class it will gives false for  above comaprison
    println(p1 == p2) // 3->true
    println(p1.equals(p2)) //3->true
    println(p1 == p1) // 1->true
    // important 
    println(p1 === p2) //false equal method not run
    println(p1 == p4) // 1->true
    println(p1 === p4) //true
    
    val s1 = "Hello"
    val s2 = "Hello"
    println(s1 == s2) // true
    println(s1.equals(s2)) // true
    println(s1 === s2) // true
}
