// data class 
// the main purpose of data class is hold data , in koltin compiler automatically creates following 
// getters and setters for the constructor parameters
// hashCode()
// equals()
// toString()
// copy()
// componentN() function 

// following condition should be fullfilled to create a data class
//  primary constructor needs to have at least one parameter.
// All primary constructor parameters need to be marked as val or var.
// Data classes cannot be abstract, open, sealed or inner.



 data class Person(val name:String?=null, val age:Int? = null ){

    var excludeProp:Int = 34

        

 }

 // to exclude a property for generated implementation declare it inside data class 

fun main(args: Array<String>) {
    // val p1 = Person ()
    var  p1 = Person ("Justin", 27)
    val p2 = Person ("Justin", 27)
    val p3 = Person ("Justin", 26)

    println(p1) // 
    println(p1 == p2) // true 
    println(p1 == p3) // false
    
    p1.excludeProp = 90
    println(p1.excludeProp) // 90 
    println(p2.excludeProp) // 34 

    // use copy() when want to change some of properties of object , rest properties are unchanged 

    val newPerson = Person("Karl Bruce", 18)
    val oldPerson = newPerson.copy(age = 90)
    println(oldPerson) // Person(name=Karl Bruce, age=90)

    //Data classes and destructuring declarations

    val p5 =  Person("Chris", 45)
    val (name , age ) = p5
    print("name = $name  age =$age") //name = Chris  age =45







    
}
