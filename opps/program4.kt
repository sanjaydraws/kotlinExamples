// Calling parent class secondary constructor from child class secondary constructor –

open class Parent { 
    constructor (emp_id: Int, emp_name: String, emp_salary: Double) { 
        var id: Int = emp_id 
        var name: String = emp_name 
        var salary : Double = emp_salary 
        println("Employee id is: $id") 
        println("Employee name: $name") 
        println("Employee salary: $salary") 
        println() 
    } 
} 
class Child : Parent { 
    constructor (emp_id : Int, emp_name: String):super(emp_id,emp_name,500000.55){ 
        var id: Int = emp_id 
        var name: String = emp_name 
        println("Employee id is: $id") 
        println("Employee name: $name") 
    } 
} 
fun main() { 
    Child(18018, "Sagnik") 
} 