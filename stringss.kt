fun main{
    var x = "Hekkk"
   var name:String = "Hell"
   var variable_name = String()//empty string

    println(x)
    println(name) 
    println(variable_name.length)



//    works for only x 
    for(i in x.indices){
        print(x[i] + " ")
    }

    println("value of n $x")


 
   // functions 
   println(x.length)
   println(x.get(3))
   println(x.subSequence(1,2))

// Returns 0 if str == string.
    var g = "GeeksForGeeks"
    var e = "Geeks"
    println(g.compareTo(e))  // 8


    // checking values 
       var x = "GeeksForGeeks"
    var y = "GeeksForGeeks"
    var z = "Geeks"
    
    println(x === y) // true , both are pointing to the same
    println(x==z)// false since values are not equal
   

}