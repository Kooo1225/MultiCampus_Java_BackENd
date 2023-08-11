package Java_Study.Inheritance.Section01;

public class CellPhone {
    String model;
    String color;

    CellPhone(String model, String color){
        super();

        this.model = model;
        this.color = color;
    }

    public void powerOn() {
        System.out.println("Power On!");
    }
    public void powerOff() {
        System.out.println("Power Off!");
    }
    public void bell() {
        System.out.println("Ring Ring!");
    }
    public void sendVoice(String message) {
        System.out.println("Me : " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("Another : " + message);
    }

    public void hangUp() {
        System.out.println("Hang Up the Call!");
    }

}
