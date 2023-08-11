package Java_Study.String;

public class GetBytes {
    public static void main(String[] args) {
        String str = "안녕하세요";

        byte[] bytes = str.getBytes();
        System.out.println("Byte1 Length : " + bytes.length);

        String str1 = new String(bytes);
        System.out.println("Bytes -> String : " + str1);
    }
}
