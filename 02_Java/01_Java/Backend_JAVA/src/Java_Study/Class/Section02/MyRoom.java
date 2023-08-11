package Java_Study.Class.Section02;

public class MyRoom {
    public static void main(String[] args){
        TV myTV = new TV();
        myTV.ch = 100;
        myTV.vol = 50;
        myTV.onOff = true;
        System.out.println(myTV);

        TV yourTV = new TV();
        yourTV.ch = 200;
        yourTV.vol = 60;
        yourTV.onOff = false;
        System.out.println(yourTV);

    }
}
