package Java_Study.Function;

public class FunctionExample2 {
    public static void main(String[] args){
        int[] num = new int[5];

        FunctionUtil.getScore(num);
        int max = num[0];
        int min = num[0];

        for (int j : num) {
            if (max < j) { max = j; }
        }

        for (int j : num) {
            if (min > j) { min = j; }
        }

        System.out.printf("Max : %d\n", max);
        System.out.printf("Min : %d\n", min);

    }
}
