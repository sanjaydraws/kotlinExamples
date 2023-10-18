package collectionKt.list.MapsProgram


// remove duplicates sentence in kotlin
fun removeDuplicates(sentence: String): String {
    val words = sentence.split(" ")
    val uniqueWords = HashSet<String>()

    for (word in words) {
        uniqueWords.add(word)
    }

    return uniqueWords.joinToString(" ")
}

fun main() {
    val sentence = "hello world world kotlin kotlin world"
    val result = removeDuplicates(sentence)

    println(result)
}
