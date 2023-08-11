package Java_Study.Inheritance.Section01;

public class DmbCellPhone extends CellPhone{
    int channel;

    DmbCellPhone(String model, String color, int channel){
        super(model, color);

        this.channel = channel;
    }

    public void turnonDmb() {
        System.out.println("Channel : " + channel + " Stream Start!");
    }

    public void changeChangeDmb(int channel){
        this.channel = channel;
        System.out.println("Chnnel " + channel + " Change");
    }

    public void turnOffDmb(){
        System.out.println("Stop Dmb Stream");
    }
}
