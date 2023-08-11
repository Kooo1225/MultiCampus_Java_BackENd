package Java_Study.Function;

public class FunctionExample {
    public static void main(String[] args){
        int[] score = new int[5];

        FunctionUtil.getScore(score);
        FunctionUtil.showScore(score);
        int sum = FunctionUtil.getSum(score);
        double avg = FunctionUtil.getAvg(sum, score.length);

        System.out.printf("Sum : %d\nAvg : %f", sum,avg);
    }


}
