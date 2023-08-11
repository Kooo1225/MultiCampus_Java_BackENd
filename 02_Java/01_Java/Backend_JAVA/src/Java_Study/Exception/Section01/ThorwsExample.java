package Java_Study.Exception.Section01;

public class ThorwsExample {
    public static void main(String[] args) {
        try{
            findClass();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}