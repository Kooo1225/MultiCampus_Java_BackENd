package Java_Study.FileIO;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (InputStream is = System.in) {
            Reader reader = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(reader);

            System.out.print("Input : ");
            String lineString = br.readLine();

            System.out.println("Output : " + lineString);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
