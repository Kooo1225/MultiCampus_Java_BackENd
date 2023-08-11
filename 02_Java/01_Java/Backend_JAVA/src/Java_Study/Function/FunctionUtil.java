package Java_Study.Function;

import java.util.Scanner;
import java.util.Random;

public class FunctionUtil {
    public static void getScore(int[] score){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Score : ");
        for(int i = 0; i<score.length; i++){
            score[i] = sc.nextInt();
        }
    }

    public static void showScore(int[] score){
        for (int i :score){
            System.out.printf("%d ", i);
        }
    }

    public static int getSum(int[] score){
        int sum = 0;

        for (int i :score){
            sum += i;
        }

        return sum;
    }

    public static double getAvg(int sum, int len){
        return (double) sum / len;
    }

    public static int FindMinValue(int[] data, int start, int end){
        int min = data[start];
        int minIx = start;
        for (int i = start; i < end; i++){
            if (min > data[i]) {
                min = data[i];
                minIx = i;
            }
        }
        return minIx;
    }

    public static int FindMaxValue(int[] data, int start, int end){
        int max = data[start];
        int maxIx = start;
        for (int i = start; i < end; i++){
            if (max < data[i]){
                max = data[i];
                maxIx = i;
            }
        }
        return maxIx;
    }

    public static void swap(int[] data, int ix1, int ix2){
        int temp = data[ix1];
        data[ix1] = data[ix2];
        data[ix2] = temp;
    }

    // length 길이의 배열을 생성하고
    // until 까지의 랜덤한 값을 채움
    // 배열을 리턴
    public static int[] getRandomArray(int length, int until){
        int[] data = new int[length];
        Random r = new Random(5);

        for (int i = 0; i < data.length; i++){
            data[i] = r.nextInt(until);
        }

        return data;
    }
}
