package collectionKt.list.MapsProgram

fun findDuplicateCharacters(inputString: String): List<Char> {
    val charFrequency = mutableMapOf<Char, Int>()
    val duplicates = mutableListOf<Char>()

    for (char in inputString) {
        if (charFrequency.containsKey(char)) {
            charFrequency[char] = charFrequency[char]!! + 1
        } else {
            charFrequency[char] = 1
        }
    }

    for ((char, frequency) in charFrequency) {
        if (frequency > 1) {
            duplicates.add(char)
        }
    }

    return duplicates
}

fun main() {
    val inputString = "programming"
    val duplicates = findDuplicateCharacters(inputString)

    if (duplicates.isNotEmpty()) {
        println("Duplicate characters: $duplicates")
    } else {
        println("No duplicate characters found.")
    }//Duplicate characters: [r, g, m]

}
