package Java_Study.Inheritance.Section06;

public abstract class Phone {
    public String owner;

    public Phone(String owner){
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("Turn on the Phone");
    }

    public void turnOff() {
        System.out.println("Turn off the Phone");
    }
}
