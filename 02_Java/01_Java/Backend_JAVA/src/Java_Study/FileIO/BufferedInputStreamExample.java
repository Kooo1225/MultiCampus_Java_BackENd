package Java_Study.FileIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        try(FileInputStream fis1 = new FileInputStream("C:/Temp/TestImg.png")) {
            start = System.currentTimeMillis();

            while(fis1.read() != -1) {}

            end = System.currentTimeMillis();
            System.out.println("사용하지 않을 때 : " + (end - start) + "ms");
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try(FileInputStream fis1 = new FileInputStream("C:/Temp/TestImg.png")) {
            BufferedInputStream bis = new BufferedInputStream(fis1);
            start = System.currentTimeMillis();

            while(bis.read() != -1) {}

            end = System.currentTimeMillis();
            System.out.println("사용하지 않을 때 : " + (end - start) + "ms");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
