//import java.io.BufferedInputStream;
//import java.io.FileInputStream;
import java.io.*;

public class BufferStream {
    public static void main(String[] args) {
        String srcfFile = "newfile.txt";
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcfFile))){
            //Read one byte at a time and display it
            byte byteData;
            while ((byteData = (byte) bis.read()) != -1){
                System.out.print((char) byteData);
            }
        }catch (Exception e2){
            e2.printStackTrace();
        }
    }
}
