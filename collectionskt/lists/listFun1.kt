package collectionKt.list

import java.lang.StringBuilder

//List: Lists are suitable for cases where you need to perform multiple operations that require processing the entire collection, or when the collection is small enough that memory usage is not a concern.
//
//Sequence: Sequences are best suited for cases where you have large datasets or potentially infinite streams of data, and you only need to process a subset of the elements.
fun main() {

    data class Person(val id: Int, val name: String,val hobbies: List<String>? = null,val age:Int? =null)
    val nullableNumbers: List<Int?> = listOf(1, null, 3, null, 5)
    val fruits = listOf("Apple", "Banana", "Cherry")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val numbers2 = listOf(1, 2, 2, 3, 4, 4, 5, 5)

    println("Element at index 3: ${numbers.getOrElse(3) { -1 }}")// Element at index 3: 4
    println("Element at index 10: ${numbers.getOrElse(10) { -1 }}")//Element at index 10: -1

    println("Element at index 2: ${numbers.getOrNull(2)}") // Element at index 2: 3
    println("Element at index 15: ${numbers.getOrNull(10)}")//Element at index 15: null

    println("Does the list contain 3? ${numbers.contains(3)}")

    println("Does the list contains all numbers? ${numbers.containsAll(listOf(3, 5))}") // Does the list contain all numbers? true
    println("The second fruit is ${fruits.indexOf("Mango")}") // The second fruit is -1// if doesn't exist

    println("Third Element: ${numbers.elementAt(2)}") // Third Element: 3

    //elementAtOrElse()
    val seventhElement = numbers.elementAtOrElse(6) { -1 }
    println("Seventh Element or -1 if index out of bounds: $seventhElement") // Seventh Element or -1 if index out of bounds: 7

//    elementAtOrNull()
    val seventhElement2 = numbers.elementAtOrNull(6)
    println("Seventh Element or null if index out of bounds: $seventhElement2")// Seventh Element or null if index out of bounds: 7

//    lastIndexOf()
    println("The index of last occurrence of 3 is ${numbers.lastIndexOf(3)}")


    //listIterator():An iterator over a collection that supports indexed access.
    val listIterator = numbers.listIterator()

    println()
    while (listIterator.hasNext()) {
        print("${listIterator.next()}" + " ")
    } // 1 2 3 4 5 6 7 8
    println()

    //subList
    val subList = numbers.subList(2, 5)
    println("Sublist: $subList") // Sublist: [3, 4, 5]

    //
    val allEven = numbers.all { it % 2 == 0 }
    println("Are all numbers even? $allEven") // Are all numbers even? false

    val anyOdd = numbers.any { it % 2 != 0 }
    println("Are there any odd numbers? $anyOdd") // Are there any odd numbers? true

    println()
    val iterable: Iterable<Int> = numbers.asIterable()
    iterable.forEach { print("$it ") } // 1 2 3 4 5 6 7 8
    println()

    // asReversed()
    val reversedNumbers = numbers.asReversed()
    println("Reversed List: $reversedNumbers") // Reversed List: [8, 7, 6, 5, 4, 3, 2, 1]

    println()
    //asSequence()
    val sequence = numbers.asSequence()
    sequence.forEach { print("$it ")  } // 1 2 3 4 5 6 7 8
    println()

    // associate()
    val indexedFruits: Map<String, Int> = fruits.associate { it to it.length }
    println("Indexed Fruits: $indexedFruits")// Indexed Fruits: {Apple=5, Banana=6, Cherry=6}


    //associateBy
    val fruitMap: Map<Int, String> = fruits.associateBy { it.length }
    println("Fruit Map: $fruitMap")// Fruit Map: {5=Apple, 6=Cherry}


    //associateByTo
    val fruitMap1 = mutableMapOf<Int, String>()
    val x = fruits.associateByTo(fruitMap1) { it.length }
    println("Fruit Map: $fruitMap1") // Fruit Map: {5=Apple, 6=Cherry}
    println(x) //{5=Apple, 6=Cherry}

    //associateTo
    val fruitMap2 = mutableMapOf<String, Int>()
    fruits.associateTo(fruitMap2) { it to it.length }
    println("Fruit Map: $fruitMap2")//Fruit Map: {Apple=5, Banana=6, Cherry=6}


    //associateWith()
     val fruitMap3 = fruits.associateWith { it.length }
        println("Fruit Map: $fruitMap3") //Fruit Map: {Apple=5, Banana=6, Cherry=6}

    // associateWithTo()
    val fruitMap4 = mutableMapOf<String, Int>()
    fruits.associateWithTo(fruitMap4) { it.length }
    println("Fruit Map: $fruitMap4")// Fruit Map: {Apple=5, Banana=6, Cherry=6}


    //binarySearch
    val index = numbers.binarySearch(5)
    println("Index of 5: $index") // Index of 5: 4

    //binarySearchBy
    val index2 = numbers.binarySearchBy(5) { it }
    println("Index of 5: $index2")//Index of 5: 4

    //chunked
    val chunks = numbers.chunked(3)
    println("Chunks: $chunks")//Chunks: [[1, 2, 3], [4, 5, 6], [7, 8]]

    //count()
    println("Number of elements: ${ numbers.count()}")// Number of elements: 8

    //distinct()
    println("Distinct Numbers: ${numbers2.distinct()}")// Distinct Numbers: [1, 2, 3, 4, 5]

    //distinctBy()
    val people = listOf(
        Person(1, "Alice"),
        Person(2, "Bob"),
        Person(1, "Charlie")
    )

    val distinctPeople = people.distinctBy { it.id }
    println("Distinct People: $distinctPeople") // Distinct People: [Person(id=1, name=Alice), Person(id=2, name=Bob)]

    //drop : Returns a list containing all elements except first n elements.
    val droppedNumbers = numbers.drop(2)
    println("Dropped Numbers: $droppedNumbers") // Dropped Numbers: [3, 4, 5, 6, 7, 8]


    val droppedNumbers2 = numbers.dropLast(2)
    println("Dropped Numbers: $droppedNumbers2") // Dropped Numbers: [1, 2, 3, 4, 5, 6]

    //Returns a list containing all elements except last elements that satisfy the given predicate.
    val droppedNumbers3 = numbers.dropLastWhile { it > 3 }
    println("Dropped Numbers: $droppedNumbers3")// Dropped Numbers: [1, 2, 3]

    //Returns a list containing all elements except first elements that satisfy the given predicate.
    val droppedNumbers4 = numbers.dropWhile { it < 3 }
    println("Dropped Numbers: $droppedNumbers4") // Dropped Numbers: [3, 4, 5, 6, 7, 8]

    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even Numbers: $evenNumbers") // Even Numbers: [2, 4, 6, 8]

    val evenNumbers2 = mutableListOf<Int>()
    numbers.filterTo(evenNumbers2) { it % 2 == 0 }
    println("Even Numbers: $evenNumbers2") // Even Numbers: [2, 4, 6, 8]


    // filterIndexed: Returns a list containing only elements matching the given predicate.
    val evenIndexedNumbers = numbers.filterIndexed { index, num -> index % 2 == 0 }
    println("Even Indexed Numbers: $evenIndexedNumbers") // Even Indexed Numbers: [1, 3, 5, 7]

    // filterIndexedTo() : Appends all elements matching the given predicate to the given destination.
    val evenIndexedNumbers2 = mutableListOf<Int>()
    numbers.filterIndexedTo(evenIndexedNumbers2) { index, _ -> index % 2 == 0 }
    println("Even Indexed Numbers: $evenIndexedNumbers2") // Even Indexed Numbers: [1, 3, 5, 7]

   // filterIsInstance
    val items = listOf(1, "two", 3, "four", 5)
    val strings = items.filterIsInstance<String>()
    println("Strings: $strings")//Strings: [two, four]

    //filterIsInstanceTo
    val strings2 = mutableListOf<String>()
    items.filterIsInstanceTo(strings2)
    println("Strings: $strings2") // Strings: [two, four]

    //filterNot
    val oddNumbers = numbers.filterNot { it % 2 == 0 } //
    println("Odd Numbers: $oddNumbers")//Odd Numbers: [1, 3, 5, 7]

    // filterNotTo
    val oddNumbers2 = mutableListOf<Int>()
    numbers.filterNotTo(oddNumbers2) { it % 2 == 0 }
    println("Odd Numbers: $oddNumbers2") // Odd Numbers: [1, 3, 5, 7]

    //filterNotNull
    val nonNullNumbers = nullableNumbers.filterNotNull() // Non-null Numbers: [1, 3, 5]
    println("Non-null Numbers: $nonNullNumbers")

   //    filterNotNullTo()
    val nonNullNumbers2 = mutableListOf<Int>(23,5)
    nullableNumbers.filterNotNullTo(nonNullNumbers2)
    println("Non-null Numbers: $nonNullNumbers2") // Non-null Numbers: [23, 5, 1, 3, 5]


    // find() : Returns the first element matching the given predicate, or null if no such element was found.
    println("First Even Number: ${numbers.find { it % 2 == 0 }}")

    // findLast: Returns the last element matching the given predicate,or null if no such element was found.
    val lastEvenNumber = numbers.findLast { it % 2 == 0 }
    println("Last Even Number: $lastEvenNumber")//Last Even Number: 8


    // return first element, get exception if list empty
    println("First Number: ${numbers.first()}") // First Number: 1

    //firstNotNullOf()
    // Returns the first non-null value produced by transform function
    //get exception if no non null values found
    println("First Not Null Element: ${listOf(null, "two", "three", "four").firstNotNullOf { it }}") //First Not Null Element: two
//   println("First Not Null Element: ${listOf(null,).firstNotNullOf { it }}") //First Not Null Element: two

    //firstNotNullOfOrNull:
    // Returns the first non-null value produced by transform function
    // return null if no non-null value was produced.
    println("First Not Null Element: ${listOf(null, "two", "three", "four").firstNotNullOfOrNull { it }}") //First Not Null Element: two


    //flatMap: Returns a single list of all elements yielded from
    // results of transform function being invoked on each element of original collection.
    val peoples = listOf(
        Person(1, "Josh",listOf("Swimming", "Reading"),34),
        Person(2,"kane",listOf("Guitar", "Cooking"),30)
    )
    val allHobbies = peoples.flatMap { it.hobbies?: listOf() }
    println(allHobbies) // [Swimming, Reading, Guitar, Cooking]

    val flattenedList = mutableListOf<String>()
    peoples.flatMapTo(flattenedList){
        it.hobbies ?: listOf()
    }
    println("flattenedList $flattenedList")//flattenedList [Swimming, Reading, Guitar, Cooking]

    //flatMapIndexed: applies a transformation to each element in a collection and flattens the results, similar to flatMap()
    val flattened = numbers.flatMapIndexed { index, element ->
        List(index + 1) { element }
    }
    println(flattened) // [1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8]

    // flatMapIndexedTo
    val result = mutableListOf<Int>()
    numbers.flatMapIndexedTo(result){
        index: Int, element: Int -> List(index+1){ element }
    }
    println(result)//[1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8]

    //flatten: it transforms a collection of collections into a single-level collection.
    val flattenedList2 = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    ).flatten()
    println("Flattened List: $flattenedList2")

    //fold: combines the elements of a collection into a single value
    // also can provide initial value of the accumulator (acc).
    val sum = numbers.fold(0) { acc, num ->
        acc + num
    }
    println("Sum of numbers: $sum") // Sum of numbers: 36


    //foldIndexed :similar to fold, but it also provides the index of the element being processed.
    val sum2 = numbers.foldIndexed(0) { index, acc, num ->
        if (index % 2 == 0) acc + num else acc
    }

    println("Sum of even-indexed numbers: $sum2")//Sum of even-indexed numbers: 16

    // foldRight :combines the elements of a collection into a single value by applying a given operation from right to left.
    val concatenatedString = numbers.foldRight("") { num, acc ->
        "$acc$num"
    }
    println("Concatenated string: $concatenatedString")//Concatenated string: 87654321

    //foldRightIndexed
    val product = numbers.foldRightIndexed(1) { index, num, acc ->
        if (index % 2 == 0) acc * num else acc
    }
    println("Product of even-indexed numbers (foldRightIndexed): $product")//Product of even-indexed numbers (foldRightIndexed): 105

    //groupBy
    val groupedByAge1 = peoples.groupBy { it.age }
    println("People grouped by age: $groupedByAge1")//People grouped by age: {34=[Person(id=1, name=Josh, hobbies=[Swimming, Reading], age=34)], 30=[Person(id=2, name=kane, hobbies=[Guitar, Cooking], age=30)]}

    //groupByTo()
    val groupedByAge2 = mutableMapOf<Int?, MutableList<Person>>()
    peoples.groupByTo(groupedByAge2) { it.age }
    println("People grouped by age: ${groupedByAge2}") // People grouped by age: {34=[Person(id=1, name=Josh, hobbies=[Swimming, Reading], age=34)], 30=[Person(id=2, name=kane, hobbies=[Guitar, Cooking], age=30)]}

    //groupingBy()
    val groupingByAge: Grouping<Person, Int?> = peoples.groupingBy { it.age }
    println("Grouping by age:$groupingByAge")//Grouping by age:collectionKt.list.Listfun1Kt$main$$inlined$groupingBy$1@63c12fb0

    groupingByAge.eachCount().forEach { (age, count) ->
        println("Age $age: $count people")
    }
    /**
    Age 34: 1 people
    Age 30: 1 people
     * */

    //ifEmpty :
    val result1 = listOf<Int>().ifEmpty { listOf(4, 5, 6) }
    println(result1)

    // indexOf()
    println("Index of 3: ${numbers.indexOf(3)}") // Index of 3: 2
    println("Last index of 2: ${ listOf(1, 2, 34, 2, 5).lastIndexOf(2)}")


    //indexOfFirst() : Returns index of the first element matching the given predicate, or -1 if the list empty
    val indexFirst = numbers.indexOfFirst { it > 2 }
    println("Index of first element greater than 2: $indexFirst") //Index of first element greater than 2: 2


    //indexOfLast() : find the index of the first element that satisfies a given condition,or -1 if the list empty
    val indexOfLast = numbers.indexOfLast { it > 2 }
    println("$indexOfLast $indexOfLast") //indexOfLast 7

//    intersect(): Returns a set containing all elements that are contained by both this collection and the specified collection.
    val intersection = numbers.intersect(listOf(12,34,1,3)) // Intersection of lists: [1, 3]
    println("Intersection of lists: $intersection")

    //isNotEmpty
    println("List  is not empty: ${listOf<Int>().isNotEmpty()}") // List  is not empty: false
    println("List  is not empty: ${listOf(23,5).isNotEmpty()}") // List  is not empty: true

    //isNullOrEmpty()
    println("List isNullOrEmpty: ${listOf<Int>().isNullOrEmpty()}")//List isNullOrEmpty: true

    // last() : return last element
    // get NoSuchElementException  if it's empty
    println("Last element: ${numbers.last()}") // Last element: 8

    //lastOrNull : return last element, returns null if list empty
    println("List lastOrNull element: ${listOf<Int>().lastOrNull()}")//List lastOrNull element: null

    // joinTo()
    val result2 = StringBuilder().apply {
        append("Fruits: ")
        fruits.joinTo(this,",")
    }.toString()
    println(result2) // Fruits: Apple,Banana,Cherry

    //joinToString //  is used to concatenate the elements of a collection (such as a list) into a single string.
    val result3 = fruits.joinToString(separator = ",",prefix = "Fruits : ")
    println("$result3") // Fruits : Apple,Banana,Cherry



}