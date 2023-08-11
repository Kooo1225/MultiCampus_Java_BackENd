package Java_Study.Class.Section08;

public class SingleTon {
    private static SingleTon singleton = new SingleTon();

    private SingleTon(){}

    static SingleTon getInstance(){
        return singleton;
    }
}
