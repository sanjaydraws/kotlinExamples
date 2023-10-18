package collectionKt.list.MapsProgram


//kotlin Counter to find the size of largest subset of anagram words
fun findLargestAnagramSubsetSize(input: List<String>): Int {
    val groupedAnagrams = mutableMapOf<String, MutableList<String>>()

    for (word in input) {
        val sortedWord = word.toCharArray().sorted().joinToString("")
        if (groupedAnagrams.containsKey(sortedWord)) {
            groupedAnagrams[sortedWord]?.add(word)
        } else {
            groupedAnagrams[sortedWord] = mutableListOf(word)
        }
    }

    //If there are no groups, maxOrNull will return null,
    // so used Elvis operator ?: to provide a default value of 0.
    return groupedAnagrams.values.map { it.size }.maxOrNull() ?: 0
}

fun main() {
    val input = listOf("ant", "magenta", "magnate", "tan", "gnamate")
    val largestAnagramSubsetSize = findLargestAnagramSubsetSize(input)

    println(largestAnagramSubsetSize)
}
