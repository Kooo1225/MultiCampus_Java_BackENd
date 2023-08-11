package Java_Study.Object.Section03;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("blue", "홍길동", "12345" , 25, true);

        Member cloned = original.getMember();
        cloned.password = "67890";

        System.out.println(original);
        System.out.println(cloned);
    }
}
