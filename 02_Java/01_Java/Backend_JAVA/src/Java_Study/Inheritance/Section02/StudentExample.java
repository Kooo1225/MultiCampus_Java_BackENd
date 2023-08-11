package Java_Study.Inheritance.Section02;

public class StudentExample {

    public static void main(String[] args){
        Student s1 = new Student("홍길동", "1234567-1234567", 1);

        System.out.printf("Name : %s\n", s1.name);
        System.out.printf("SSN : %s\n", s1.ssn);
        System.out.printf("studentNo : %d\n", s1.studentNo);
    }
}
