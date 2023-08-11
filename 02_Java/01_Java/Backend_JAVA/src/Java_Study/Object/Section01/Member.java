package Java_Study.Object.Section01;

public class Member {
    public String id;
    public int age;

    public Member(String id, int age){
        this.id = id;
        this.age = age;
    }

    public boolean equals(Object obj){
        if (obj instanceof Member){
            Member member = (Member) obj;
            if (id.equals(member.id) && age == member.age) {
                return true;
            }
        }
        return false;
    }
}
