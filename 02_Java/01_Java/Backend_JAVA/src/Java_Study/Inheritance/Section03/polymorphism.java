package Java_Study.Inheritance.Section03;

public class polymorphism {

    public static void main(String[] args){
        Child c = new Child();

        Parent p = c;

        p.method01();
        p.method02();

        System.out.println(p);
        System.out.println(c);
    }
}
