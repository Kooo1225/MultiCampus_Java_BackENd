package Java_Study.Function;

public class CallByReferenceEx {
    public static void main(String[] args){
        int[] data = {100, 200};

        swap(data);

        System.out.printf("%d %d\n", data[0], data[1]);
    }
    static void swap(int[] data){
        int temp = data[0];
        data[0] = data[1];
        data[1] = temp;

    }
}
