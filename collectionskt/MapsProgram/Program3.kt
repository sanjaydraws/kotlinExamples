package collectionKt.list.MapsProgram

//sum of all items in a dictionary
fun main() {
    val inputMap = mapOf(
        'a' to 100,
        'b' to 400,
        'c' to 500
    )

    // Method 1 :
    val sum1 = inputMap.values.sum()

    println("Sum of all items in the dictionary: $sum1") // Sum of all items in the dictionary: 1000
   //    Method 2: Using fold function
    val sum2 = inputMap.values.fold(0) { acc, value -> acc + value }
    println(sum2)

    val sum3 = inputMap.values.reduce { acc, value -> acc + value }
    println(sum3)

//    Method 4: Using forEach function
    var sum4 = 0

    inputMap.values.forEach { value ->
        sum4 += value
    }
    println("Method 5 - Sum of all items in the dictionary: $sum4")

//    Method 5: Using a Loop
    var sum = 0

    for (value in inputMap.values) {
        sum += value
    }


}
