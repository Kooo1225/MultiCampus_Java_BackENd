package Java_Study.Array;

import java.util.Scanner;

public class ArrayExample5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];

        for (int i =0; i <score.length; i++){
            score[i] = sc.nextInt();
        }

        for (int x:score){
            System.out.print(x + " ");
        }

        System.out.println();

        int sum = 0;

        for (int x:score){
            sum += x;
        }

        System.out.println("Sum : " + sum);
        System.out.println("Avg :" + (double)sum / score.length);

        int sum2 = 0;

        for (int x:score){
            if (x >= 300){
                sum2 += x;
            }
        }

        System.out.println("Upper 300 Sum : " + sum2);


        for (int i =0;i<score.length;i++){
            if (score[i] >= 300){
                System.out.println("Upper 300 : " + i);
            }

        }
    }
}
