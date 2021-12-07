package fileh

import java.io.File

// reading from a file

fun readLineByLineUsingForEachLine(fileName:String?) = File(fileName).forEachLine { println(it) }

// file gets closed when processing completed
fun readFileAsLinesUsingUseLines(fileName: String?):List<String> = File(fileName).useLines { it.toList() }


//Once we have a BufferedReader, we can read all the lines in it:
fun readFileAsLinesUsingBufferedReader(fileName: String): List<String>
        = File(fileName).bufferedReader().readLines()
fun readFileAsLinesUsingReadLines(fileName: String): List<String>
        = File(fileName).readLines()

// have input stream , convert that into bytes then into a complete string
fun readFileTextUsingInputStream(fileName: String?)=
    File(fileName).inputStream().readBytes().toString(Charsets.UTF_8)

// read the entire content of the file as string
// isn’t recommended for huge files and has imitation of 2 GB file size.
fun readFileDirectlyAsText(fileName: String?):String =
    File(fileName).readText(Charsets.UTF_8)

fun main() {

    readLineByLineUsingForEachLine("output.txt")
    println(readFileAsLinesUsingUseLines("output.txt")) // [Hello World What is going on ?, kotlin, He, is, d]
    println(readFileAsLinesUsingBufferedReader("output.txt"))
    println(readFileAsLinesUsingReadLines("output.txt"))
    println(readFileTextUsingInputStream("output.txt"))
    println(readFileDirectlyAsText("output.txt"))


}