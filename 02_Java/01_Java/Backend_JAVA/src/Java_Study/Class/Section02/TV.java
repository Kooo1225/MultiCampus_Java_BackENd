package Java_Study.Class.Section02;

public class TV {
    public int ch;
    public int vol;
    public boolean onOff;

    public void ChangeChannel(){
        int change = 1;
        System.out.println(ch + change + "ch moved");
    }

    public void OnYoutube(){
        System.out.println(vol + "vol on Youtube");
    }
}
