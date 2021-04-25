fun main( ){
    println("Hello")

    val array1 = arrayOf(1, 2,3,4)
    // val array2 = arrayOf<Int>(1 ,2,3)

    for( i in 0..array1.size-1){
        print(array1[i])
    }

   // lambda 
    val num = Array(3, {i->i*1})
//     print(num)
    for(i in 0..num.size-1){
        print(num[i])
    }
    
    // get and set  
     val x = num.get(1)
     num.set(1,90)
    println("\n"+x)
    println("\n"+num[1])



}