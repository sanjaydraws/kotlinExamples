// reading from a file

fun readLineByLineUsingForEachLine(fileName:String?) = File(fileName).forEachLine { println(it) }

// file gets closed when processing completed
fun readFileAsLinesUsingUseLines(fileName: String?):List<String> = File(fileName).useLines { it.toList() }

fun main() {

    readLineByLineUsingForEachLine("output.txt")
    println(readFileAsLinesUsingUseLines("output.txt")) // [Hello World What is going on ?, kotlin, He, is, d]


}