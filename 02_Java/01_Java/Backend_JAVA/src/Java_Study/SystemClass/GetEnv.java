package Java_Study.SystemClass;

public class GetEnv {
    public static void main(String[] args) {
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("Java_Home : " + javaHome);
    }
}
