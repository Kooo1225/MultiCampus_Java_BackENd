package Java_Study.Inheritance.Section07;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("Mute");
        }
        else{
            System.out.println("Disabled Mute");
        }
    }

    static void changeBattery(){
        System.out.println("Change Battery");
    }
}
