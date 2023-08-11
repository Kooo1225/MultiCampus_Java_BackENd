package Java_Study.Array;

public class ArrayExample3 {
    public static void main(String[] args){
        // 두 문장은 서로 다르지만 같은 문장
        int[] arr = {1,2,3,4};
        int[] arr2 = new int[] {5,6,7,8};

        // 이게 가능하다고 함;
        arr = new int[] {10,11,12};
    }
}
