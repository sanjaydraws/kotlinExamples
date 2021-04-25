fun main(){
   
    
    // for(i in 0..6)
    //   print("$i ")

    // println("++++++++++++++++++++")
    // for(i in 1..11 step 3)
    //   print(i)

    // //   You can not iterate through Range from top to down without using DownTo :

    // for(i in 5..1){
    //     print("$i ") // doesn't works 
    // }
    // println("++++++++++++++++++++")

    // for(i in 15 downTo 1 step 5){
    //     print("$i ")
    // }


    // =====================================================

    var numbers = arrayOf(1,2, 3, 4,5,6,7,8,9, 10)
    // Traverse an array without using index property:

    for(num in numbers){
        if(num %2 == 0){
            print("$num")
        }
    }

    // Traverse an array with using index property:

    var planets = arrayOf("Earth", "Mars", "Venus")
    for(i in planets.indices){
        println(planets[i])
    }
    

    // Traverse an array using withIndex() Library Function:
    println(planets.withIndex())

    for((index, value) in planets.withIndex()){
        println("$index -> $value")
    }
    



    


}