package Java_Study.Function;

public class CallByValueEx {
    public static void main(String[] args){
        int x = 100;
        int y = 200;

        swap(x,y);

        System.out.printf("x : %d \ny : %d\n", x, y);
    }

    static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;

        return;

    }
}
