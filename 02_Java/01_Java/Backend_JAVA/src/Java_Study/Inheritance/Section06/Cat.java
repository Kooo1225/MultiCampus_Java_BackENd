package Java_Study.Inheritance.Section06;

public class Cat extends Animal{
    public Cat(){
        this.kind = "포유류";
    }

    public void sound(){
        System.out.println("매옭");
    }

    public void sound2(){
        System.out.println("애옭");
    }
}
