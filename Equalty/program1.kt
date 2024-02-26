//== operator is used for structural equality, meaning it checks whether the content of two objects is the same. 
// === is the referential equality operator: It checks whether two references point to the exact same object in memory.
// In Kotlin, the == operator is equivalent to calling the equals method., By default, the equals method in Kotlin performs referential equality, meaning it checks whether the two references point to the same object in memory.


// equals is used for checking structural equality,
// equals : can override the equals function in your class.


// single line answer JAva 
// == : refrence comparison //address comparison
// euqals: content comparison  

//hashCode is a method defined in the Object class
//For every object Jvm generate unique number
// hash code is a numerical representation of the object's state. 
// Jvm using hashcode while saving object into hashing related structure like HashSet,HashMap and HashTable etc 

// an expression like a == b is translated to:
// a?.equals(b) ?: (b === null)

// In Kotlin there are two types of equality:

// Structural equality (== - a check for equals()) // Structural Equality means content should be same


// Referential equality (=== - two references point to the same object)
class Person(val age:Int){
}

fun main() {
    // for normal class by defalut if all properties values are same but will have different hashcode
    val p1 = Person(45) // 2093176254
    val p2 = Person(45) // 1389133897
    val p3 = Person(34) // 1534030866
    val p4 = p1
    println(p1 === p4) // true
    println(p1 === p2) // false
    println(p1.hashCode())
    println(p2.hashCode())
    println(p3.hashCode())
    println(p1 == p1) // true
    println(p1.equals(p1)) // true
    println(p1 == p2)// false
    println(p2 == p3) // false
    println(p1 === p2) // false
    println(p2 === p3) // false
    println(p1.equals(p2)) //false
    println(p2.equals(p3)) // false
    
    val s1 = "Hello" // 69609650
    val s2 = "Hello" // 69609650
    val s3 = "HelloWorld" // 69609680
    val s4 = s1 // 69609650
    println(s1.hashCode())
    println(s2.hashCode())
    println(s3.hashCode())
    println(s4.hashCode())
    println(s1 == s2) // true
    println(s2 == s3) // false

    print(s2 == s4) // true
    println(s2 == s3) // false
    println(s1 === s2) // true
    println(s2 === s3)//false
    println(s2.equals(s3)) // false
    println(s1.equals(s2)) // true
    println(s1 == s2) // true
    println(s1.equals(s1)) // true


    var x = 23 // hashcode23
    var y = 23 // hashcode 23
    var z = 234 // hashcode 234
    println(x.hashCode())
    println(y.hashCode())
    println(z.hashCode())
    println(x == y) // true
    println(x.equals(z)) // false 
    println(x.equals(y)) // true 
}