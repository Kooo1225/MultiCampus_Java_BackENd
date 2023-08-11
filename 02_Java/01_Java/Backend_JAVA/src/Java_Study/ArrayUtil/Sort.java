package Java_Study.ArrayUtil;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] scores = { 99, 97, 98};

        Arrays.sort(scores);

        for (int i = 0; i < scores.length; i++){
            System.out.printf("Score[%d] : %d\n", i, scores[i]);
        }

        String[] names = { "홍길동", "박동수", "김민수" };
        Arrays.sort(names);

        for (String i : names) {
            System.out.println(i);
        }
    }
}
