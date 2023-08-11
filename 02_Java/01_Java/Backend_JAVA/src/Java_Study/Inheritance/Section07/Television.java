package Java_Study.Inheritance.Section07;

public class Television implements RemoteControl {
    private int volume;

    public void turnOn(){
        System.out.println("TV on");
    }

    public void turnOff(){
        System.out.println("TV off");
    }

    public void setVolume(int Volume){
        if (volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if (volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else{
            this.volume = volume;
        }
    }
}
