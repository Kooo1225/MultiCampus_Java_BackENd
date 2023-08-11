package Java_Study.Class.Section05;

public class AccountUse {

    public static void main(String[] args){
        Account a1= new Account("홍길동","990115", 10000);
        Account a2= new Account("고길동","910115", 10000);

        System.out.println(a1.getMoney());

        a2.setMoney(200000);

        System.out.println(a2.getMoney());

    }
}
