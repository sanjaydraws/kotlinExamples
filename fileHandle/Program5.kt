import java.io.FileInputStream

//stream  (sequesnce of data  )


/***
 * Byte stream
 * 1. inputStream - used for reading (ex. it could be file, image , audio, video,webpage)
 * 2. outputStream -  writing data to a file, image, audio,. OutputStream writes data to the destination one at a time.
 */
// character stream

fun main() {
    try {
//        val fileIn = FileInputStream("f:\\xyz.txt")
        val inStream =  FileInputStream("hi.txt")
        var i = 0
        while (inStream.read().also { i = it } != -1) {
            print(i.toChar())
        }
        inStream.close()
    }catch (e:Exception){
        System.out.println(e);

    }

}
