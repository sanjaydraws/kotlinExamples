// print duplicate value with index
fun main() {
    val arr = arrayOf(2, 3, 4, 5, 6, 3, 6)
    val unique = HashSet<Int>()
    val duplicateIndicesMap = mutableMapOf<Int, MutableList<Int>>()

    for ((index, value) in arr.withIndex()) {
        if (!unique.add(value)) {
            // If the element is already in the set, it's a duplicate
            val indices = duplicateIndicesMap.getOrPut(value) { mutableListOf() }
            indices.add(index)
        }
    }

    for ((value, indices) in duplicateIndicesMap) {
        println("Duplicate $value found at indices: $indices")
    }
}
