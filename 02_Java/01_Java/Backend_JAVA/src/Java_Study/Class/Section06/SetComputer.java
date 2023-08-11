package Java_Study.Class.Section06;

public class SetComputer {
    public static void main(String[] args){
        Computer c1 = new Computer(10000, "Lenovo", 28);

        Computer[] array = new Computer[100];

        for (int i = 0; i < 100; i++){
            array[i] = new Computer(1, "TestCompany", 24);
        }

        for (int i = 0; i < 100; i++){
            System.out.println(array[i]);
        }

        System.out.println(c1);
    }
}
