package Java_Study.FileIO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/Temp/text.txt")) {
            int data;
            while ( (data = fis.read()) != -1 ) {
                System.out.write(data);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
