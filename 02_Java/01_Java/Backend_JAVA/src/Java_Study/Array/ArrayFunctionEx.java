package Java_Study.Array;

import Java_Study.Function.FunctionUtil;

import java.util.function.Function;

public class ArrayFunctionEx {
    public static void main(String[] args){
        int[] data = FunctionUtil.getRandomArray(5, 500);

        for (int i = 0; i < data.length; i ++){
            int minIx = FunctionUtil.FindMinValue(data, i, data.length);
            FunctionUtil.swap(data, i, minIx);
        }

        FunctionUtil.showScore(data);

    }
}
