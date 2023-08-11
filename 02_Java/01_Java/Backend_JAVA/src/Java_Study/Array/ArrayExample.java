package Java_Study.Array;

public class ArrayExample {
    public static void main(String[] args){
        String[] names = {"강만두", "김만두", "최만두", "신만두", "오만두"};

        int[] arr = new int[100];
        int[] arr2 = {1,2,3,4,5};

        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println();

        // advanced for, for each 문 -> 엑셀의 그것과 비슷하고 파이썬의 반복문과 유사
        for (String s: names){
            System.out.println(s);
        }
    }
}
