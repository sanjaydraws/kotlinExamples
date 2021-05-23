import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// writing a line of text to file 
/**
 * Program1
 */
public class Program1 {
    public static void main(String[] args) throws IOException {
        String str = "Hii";
        File file = new File("file.txt");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(str);
        }finally{
            if(bw!=null){
                bw.close();
            }
        }
    }
}