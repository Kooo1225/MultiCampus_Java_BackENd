package Java_Study.Class.Section01;

public class Myroom {
    public static void main(String[] args){
        Phone p1 = new Phone();
        p1.DoInternet();
        p1.color = "Black";
        p1.shape = "Folder";

        Phone p2 = new Phone();
        p2.DoKakaoTalk();
        p2.color = "Yellow";
        p2.shape = "Square";
    }
}
