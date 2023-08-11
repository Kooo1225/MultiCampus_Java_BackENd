package Java_Study.Inheritance.Section06;

public abstract class Animal {
    public String kind;

    public void breathe(){
        System.out.println("Breathe");
    }

    public abstract void sound();
}
