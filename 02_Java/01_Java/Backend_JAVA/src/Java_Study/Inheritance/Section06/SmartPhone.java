package Java_Study.Inheritance.Section06;

public class SmartPhone extends Phone{
    public SmartPhone(String owner){
        super(owner);
    }

    public void internetSearch(){
        System.out.println("Searching Internet");
    }
}
