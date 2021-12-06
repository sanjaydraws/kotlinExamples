import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.FileWriter


// Java FileWriter and FileReader classes are used to write and read data from text files
//  It is recommended not to use the FileInputStream and FileOutputStream classes if you have to read and write any textual information as these are Byte stream classes.
fun main() {

    var ch:Int ? = null
    var fr:FileReader ? = null
    val str = "Hello World What is going on ? "
    val file = File("Hello1.txt")
    // creates the file
    file.createNewFile()

    val fw = FileWriter(file);
//    val fw = FileWriter("output.txt"); // also create file

    for (element in str)
        fw.write(element.code)

    println("Writting success")
    fw.close()

    try {
         fr = FileReader(file)
    }catch (e:FileNotFoundException){
        println("File Not Found Exception")
    }


    while (fr?.read().also { ch = it } != -1)
        print(ch?.toChar())
    fr?.close()
}