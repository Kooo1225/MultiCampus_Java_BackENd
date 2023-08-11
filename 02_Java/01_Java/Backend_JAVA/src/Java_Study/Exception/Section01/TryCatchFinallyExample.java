package Java_Study.Exception.Section01;

public class TryCatchFinallyExample {
    public static void main (String[] args){
        try{
            Class clazz = Class.forName("java.lang.String2");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
        }
        finally{
            System.out.println("=============================================");
        }
        System.out.println("Program is Done!");
    }
}
