// kotlinc List1.kt -include-runtime -d  List1.jar
// java -jar List1.jar

// Lambdas Expressions are essentially anonymous functions that we can treat as values 
// val lambdaName : Type = { argumentList -> codeBody }
// The only part of a lambda that isn’t optional is the codeBody.
// The argument list can be skipped when defining at most one argument and the Type can often be inferred by the Kotlin compiler. We don’t always need a variable as well, the lambda can be passed directly as a method argument.
fun main(){
    // val square = { number :Int -> number * number } 
    // print(square(3))


    // val magnitude100String = {
    //     input:Int -> val magnitude =  input * 3 
    //     magnitude.toString()
    // }
    // print(magnitude100String(10))
    


    // We must explicitly declare the type of our lambda expression. If lambda returns no value then we can use: Unit
    // Lambdas examples with return type –

    // val lambda1: (Int) -> Int = { a -> a *a} 
    // print(lambda1(2))

    // val lambda2:(String,String)-> String = {a ,b -> a + b} 
    // print(lambda2("Hi", "World")) 

    // val lambda3: (Int)-> Unit = {a-> print(a) }
    // lambda3(3)

    // ==================================================================
    // Lambdas can be used as class extension:
    //it represents the implicit name of single parameter and we will discuss later.
    // val lambda4:String.(Int) ->String = {
    //     print(this)
    //     print(it)
    //     this + it
    // } 
    // val result = "Hello".lambda4(50) 
    // print(result)// Hello50 

    // ==================================================
    // Kotlin program using shorthand form of lambda function –
    // val numbers = arrayOf(1, -2, 3, -4, 5)
    // print(numbers.filter { it > 9 })   // [1,3,5] it not added resukt is []


    // Kotlin program using longhand form of lambda function –

    // println(numbers.filter { item -> item >0 }) //[1,3,5]

    


    

}