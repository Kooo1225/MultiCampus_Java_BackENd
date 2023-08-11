package Java_Study.Inheritance.Section06;

public class PhoneExample {
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone("TestName");

        sp.turnOn();
        sp.internetSearch();
        sp.turnOff();

        Phone p = sp;

        p.turnOn();
        ((SmartPhone)p).internetSearch();
        p.turnOff();
    }
}
