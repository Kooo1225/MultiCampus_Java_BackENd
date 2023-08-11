package Java_Study.String;

import java.util.Scanner;

public class With {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        if (fileName.endsWith(".mp3")){
            System.out.println(".mp3 File");
        }
        else{
            System.out.println("Not .mp3 File");
        }

    }
}
