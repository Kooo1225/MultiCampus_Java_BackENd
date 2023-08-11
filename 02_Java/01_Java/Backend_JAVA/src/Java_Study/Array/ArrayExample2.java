package Java_Study.Array;

public class ArrayExample2 {
    public static void main(String[] args){
        int[] score = new int[1000];
        System.out.println(score);

        score[0] = 100;
        score[10] = 200;
        score[999] = 1000;

        System.out.printf("1 Value : %d\n", score[0]);
        System.out.printf("11 Value : %d\n", score[10]);
        System.out.printf("1000 Value : %d\n", score[999]);
        System.out.printf("500 Value : %d\n", score[499]);

    }
}
