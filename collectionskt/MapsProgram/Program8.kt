package collectionKt.list.MapsProgram


// print anagrams together in kotlin
fun groupAnagrams(arr: List<String>): List<List<String>> {
    val groupedAnagrams = mutableMapOf<String, MutableList<String>>()

    for (word in arr) {
        val sortedWord = word.toCharArray().sorted().joinToString("")
        if (groupedAnagrams.containsKey(sortedWord)) {
            groupedAnagrams[sortedWord]?.add(word)
        } else {
            groupedAnagrams[sortedWord] = mutableListOf(word)
        }
    }

    return groupedAnagrams.values.toList()
}

fun main() {
    val arr = listOf("cat", "dog", "tac", "god", "act")
    val groupedAnagrams = groupAnagrams(arr)

    groupedAnagrams.forEach { group ->
        println(group.joinToString(" "))
    }
}
//output
/**cat tac act
dog god
**/