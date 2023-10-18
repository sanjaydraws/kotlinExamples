package collectionKt.list

data class Employee(val name: String, val age: Int)

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(6,1, 2, 3, 4, 5)

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 2, 3,)
    val fruits = listOf("apple", "banana", "cherry", )
    val fruits2 = listOf("apple", "banana", null, "cherry", null)

    val employee = listOf(
        Employee("Alice", 30),
        Employee("Bob", 25),
        Employee("Charlie", 35)
    )
    println("Random Element: ${numbers.random()}")//Random Element: 5


    println("Random Element: ${numbers.random()}") // Random Element: 6
    println("Random Element (or null if list is empty): ${numbers.randomOrNull()}")//Random Element (or null if list is empty): 5

    // reduce
    val sum = list.reduce { acc, element -> acc + element }
    println("Sum of elements: $sum") // Sum of elements: 15

    // reduceOrNull()
    val result1 = listOf<Int>().reduceOrNull { acc, element -> acc + element }
    println("Result (or null if list is empty): $result1")//Result (or null if list is empty): null



    val product = list.reduceIndexed { index, acc, element -> acc + (element * index) }
    println("Product of elements with indices: $product") // Product of elements with indices: 41

    // reduceIndexedOrNull()
    // return null if list empty
    val result2 = list.reduceIndexedOrNull { index, acc, element -> acc + (element * index) }
    println("Result (or null if list is empty): $result2")// Result (or null if list is empty): 41

    //reduceRight(): t it starts with the last element and combines elements from right to left.
    val result3 = list.reduceRight { element, acc -> element + acc }
    println("Result of reducing from the right: $result3") // Result of reducing from the right: 15

    val result4 = list.reduceRightIndexed { index, element, acc -> element + (acc * index) }
    println("Result of reducing from the right with indices: $result4")//Result of reducing from the right with indices: 1

    val result5 = listOf<Int>().reduceRightIndexedOrNull { index, element, acc -> element + (acc * index) }

    println("Result (or null if list is empty): $result5")//Result (or null if list is empty): null

//    reduceRightOrNull
    val result6 = listOf<Int>().reduceRightOrNull { element, acc -> element + acc }

    println("Result (or null if list is empty): $result6")//Result (or null if list is empty): null

    //requireNoNulls: Returns an original collection containing all the non-null elements,
    // get exception if found any null element
    println("All elements are non-null. ${fruits.requireNoNulls()}") // All elements are non-null. [apple, banana, cherry]

    println("Reversed List: ${list.reversed()}") // Reversed List: [5, 4, 3, 2, 1]

    //runningFold
    val runningSum = list.runningFold(0) { acc, element -> acc + element }
    println("Running Sum: $runningSum") // Running Sum: [0, 1, 3, 6, 10, 15]

    //runningFoldIndexed()
    val runningProduct = list.runningFoldIndexed(1) { index, acc, element -> acc * (element + index) }
    println("Running Product with Indices: $runningProduct") // Running Product with Indices: [1, 1, 3, 15, 105, 945]


    //runningReduce()
    // acc takes first element
    val runningSum2 = list2.runningReduce { acc, element -> acc + element }
    println("Running Sum: $runningSum2") //Running Sum: [6, 7, 9, 12, 16, 21]

   //    runningReduceIndexed()
    val runningProduct3 = list2.runningReduceIndexed { index, acc, element -> acc * (element + index) }
    println("Running Product with Indices: $runningProduct3")//Running Product with Indices: [6, 12, 48, 288, 2304, 23040]

    //scan
    val runningSum3 = list2.scan(0) { acc, element -> acc + element }
    println("Running Sum: $runningSum3") // Running Sum: [0, 6, 7, 9, 12, 16, 21]

    //scanIndexed()
    val runningProduct2 = list2.scanIndexed(1) { index, acc, element -> acc * (element + index) }
    println("Running Product with Indices: $runningProduct2")//Running Product with Indices: [1, 6, 12, 48, 288, 2304, 23040]

    //shuffled()
    println("Shuffled List: ${list2.shuffled()}") // Shuffled List: [4, 6, 5, 3, 2, 1]

    //single
    println("Single Element: ${listOf(1).single()}") // Single Element: 1
//    println("Single Element: ${listOf(1,3).single()}") // exception if more than one element


    //singleOrNull()
    val singleElement = listOf<Int>().singleOrNull()
    println("Single Element (or null if list is empty): $singleElement")//Single Element (or null if list is empty): null


    val slicedList = list2.slice(listOf(1, 3, 4))
    println("Sliced List: $slicedList") // Sliced List: [1, 3, 4]

    val sortedList = employee.sortedBy { it.age }
    println("Sorted by Age: $sortedList")//Sorted by Age: [Employee(name=Bob, age=25), Employee(name=Alice, age=30), Employee(name=Charlie, age=35)]


    val sortedList2 = employee.sortedByDescending { it.age }
    println("Sorted by Age (Descending): $sortedList2") // Sorted by Age (Descending): [Employee(name=Charlie, age=35), Employee(name=Alice, age=30), Employee(name=Bob, age=25)]


    //sortedWith()
    val sortedList3 = employee.sortedWith(compareByDescending { it.age })
    println("Sorted by Age (Descending) with sortedWith: $sortedList3")//Sorted by Age (Descending) with sortedWith: [Employee(name=Charlie, age=35), Employee(name=Alice, age=30), Employee(name=Bob, age=25)]

    //subtract:
    // no changes in existing list
    val result7 = listOf(1, 2, 3, 4, 5).subtract(listOf(3, 4, 5, 6, 7))
    println("Result: $result7")//Result: [1, 2]


    println("Sum of elements after multiplying by 2: ${list2.sumBy { it * 2 }}")//Sum of elements after multiplying by 2: 42

    println("Total cost of items: ${ listOf(1.3, 2.1, 3.3).sumByDouble { it }}") // Total cost of items: 6.7
    println("Sum of squares of elements: ${listOf(1, 2, 3, 4, 5).sumOf { it * it }}")//Sum of squares of elements: 55

    println("Take first 3 elements: ${list2.take(3)}") // Take first 3 elements: [6, 1, 2]
    println("Take last 3 elements: ${list2.takeLast(3)}") // Take last 3 elements: [3, 4, 5]
    println("Take elements while greater than 3 from the end: ${list2.takeLastWhile { it > 3 }}")// Take elements while greater than 3 from the end: [4, 5]
    println("Take elements while less than 4 from the beginning: ${list2.takeWhile { it < 4 }}") //Take elements while less than 4 from the beginning: []


    //union :Returns a set containing all distinct elements from both collections.
    // no changes in existing list
    val combinedList = listOf(4, 5).union(listOf(4, 5))
    println("Combined List: $combinedList") // Combined List: [4, 5]

    val combinedList2 = listOf(4, 51).union(listOf(4, 5))
    println("Combined List: $combinedList2") // Combined List: [4, 51, 5]

    //unzip: to separate a list of pairs into two separate lists.
    val pairs = listOf(Pair("Alice", 30), Pair("Bob", 25), Pair("Charlie", 35))
    val (names, ages) = pairs.unzip()

    println("Names: $names") // Names: [Alice, Bob, Charlie]
    println("Ages: $ages") // Ages: [30, 25, 35]

    //to create a sliding window of elements from the original list.
    val result8 = list.windowed(size = 3, step = 2, partialWindows = true)
    println("Windowed Result: $result8") // Windowed Result: [[1, 2, 3], [3, 4, 5], [5]]


    println()
    for ((index, value) in fruits.withIndex()) {
        print("Index->$index: $value ")
    } // Index->0: apple Index->1: banana Index->2: cherry
    println()

    val zippedList1 = listOf("apple", "banana", "cherry").zip(listOf(1, 2, 3))
    println("Zipped List: $zippedList1")//Zipped List: [(apple, 1), (banana, 2), (cherry, 3)]

    val zippedList2: List<Pair<String, Int>> = listOf("apple", "banana").zip(listOf(1, 2, 3)) //
    println("Zipped List: $zippedList2") // Zipped List: [(apple, 1), (banana, 2)]
    println(list2.zipWithNext()) // [(6, 1), (1, 2), (2, 3), (3, 4), (4, 5)]


    //map()
    val squaredList = list2.map { it * it }
    println("Squared List: $squaredList") // Squared List: [36, 1, 4, 9, 16, 25]

    //    mapTo()
    val resultList1 = mutableListOf<Int>()
    list2.mapTo(resultList1) { it * it }
    println("Result List: $resultList1")//Result List: [36, 1, 4, 9, 16, 25]

    //mapNotNull() :  to apply a transformation and filter out null results.
    val notNullList = fruits2.mapNotNull { it }
    println("Not Null List: $notNullList")// Not Null List: [apple, banana, cherry]

    //mapNotNullTo(): similar to mapNotNull, but it adds the results to a specified destination collection.
    val resultList2 = mutableListOf<String>()
    fruits2.mapNotNullTo(resultList2) { it }
    println("Result List: $resultList2") // Result List: [apple, banana, cherry]

    //mapIndexed()
    val indexedList = fruits.mapIndexed { index, value -> "Item at index $index is $value" }
    println("Indexed List: $indexedList")//Indexed List: [Item at index 0 is apple, Item at index 1 is banana, Item at index 2 is cherry]


    //mapIndexedTo()
    val resultList3 = mutableListOf<String>()
    fruits.mapIndexedTo(resultList3) { index, value -> "Item $index is $value" }
    println("Result List: $resultList3") // Result List: [Item 0 is apple, Item 1 is banana, Item 2 is cherry]

    //mapIndexedNotNull()
    val indexedNotNullList = fruits2.mapIndexedNotNull { index, value -> value?.let { "Item $index is $it" } }
    println("Indexed Not Null List: $indexedNotNullList")//Indexed Not Null List: [Item 0 is apple, Item 1 is banana, Item 3 is cherry]

    //mapIndexedNotNullTo()
    val resultList4 = mutableListOf<String>()
    fruits2.mapIndexedNotNullTo(resultList4) { index, value -> value?.let { "Item $index is $it" } }
    println("Result List: $resultList4")// Result List: [Item 0 is apple, Item 1 is banana, Item 3 is cherry]



    //maxOf: to find the maximum value in the list.
    println("Maximum element: ${list.maxOf { it }}")// Maximum element: 5


    //maxOfOrNull:  to find the maximum value in the list, or return null if the list is empty.
    println("Maximum element (or null if list is empty): ${emptyList<Int>().maxOfOrNull { it }}")//Maximum element (or null if list is empty): null

    //maxByOrNull : to find the element in the list with the maximum value
    // or null if there are no elements.
    val oldestPerson = employee.maxByOrNull { it.age }
    println("Oldest Person: $oldestPerson") // Oldest Person: Employee(name=Charlie, age=35)

    //maxOfWith()
    val comparator = Comparator { a: Int, b: Int -> a - b }
    val max1 = listOf(5, 2, 8, 1, 6).maxOfWith(comparator){it}
    println("Maximum element with custom comparator: $max1") // Maximum element with custom comparator: 8

    //maxOfWithOrNull()
    val max2 = emptyList<Int>().maxOfWithOrNull(comparator){it}
    println("Maximum element with custom comparator: $max2") //Maximum element with custom comparator: null

    //maxWith()
    val maxElement = listOf(5, 2, 8, 1, 6).maxWithOrNull(comparator)
    println("Maximum element with custom comparator: $maxElement") // Maximum element with custom comparator: 8


}