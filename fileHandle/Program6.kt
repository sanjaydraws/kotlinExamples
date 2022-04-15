import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

@Throws(Exception::class)
fun copyContent(a: File?, b: File?) {
    val `in` = FileInputStream(a)
    val out = FileOutputStream(b)
    try {
        var n: Int

        // read() function to read the
        // byte of data
        while (`in`.read().also { n = it } != -1) {
            // write() function to write
            // the byte of data
            out.write(n)
        }
    } finally {
        if (`in` != null) {

            // close() function to close the
            // stream
            `in`.close()
        }
        // close() function to close
        // the stream
        if (out != null) {
            out.close()
        }
    }
    println("File Copied")
}

fun main() {

      copyContent(File("sourcefile.txt"), File("output.txt"))
}