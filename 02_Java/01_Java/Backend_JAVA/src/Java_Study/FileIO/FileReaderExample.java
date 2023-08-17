package Java_Study.FileIO;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:/Temp/text.txt")) {

            int readCharNo;
            char[] cbuf = new char[100];

            while ( (readCharNo = fr.read(cbuf)) != -1) {
                String data = new String(cbuf, 0, readCharNo);
                System.out.print(data);

//                System.out.println(cbuf);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
