package Java_Study.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "C:/Temp/TestImg.png";
        String targetFileName = "C:/Temp/TestImg_copy.png";

        try(FileInputStream fis = new FileInputStream(originalFileName);
            FileOutputStream fos = new FileOutputStream(targetFileName);)
        {
            int readByteNo;
            byte[] readBytes = new byte[100];
            while ( (readByteNo = fis.read(readBytes)) != -1) { fos.write(readBytes, 0, readByteNo);}
            fos.flush();
            System.out.println("Copy Done");
        }
        catch(Exception e){
            e.printStackTrace();
        }




    }
}
