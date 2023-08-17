package Java_Study.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args){
        File file = new File("C:/Temp/file.txt");

        // true 를 이용한 append 모드 활성화
        // close 가 가능한 객체들에 대해서만 try-write-resource 사용 가능
        try(FileWriter fw = new FileWriter(file, true);) {
            fw.write("FileWriter는 한글로된\r\n");
            fw.write("문자열을 바로 출력할 수 있다."+ "\r\n");

            fw.flush();
            System.out.println("File Save");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
