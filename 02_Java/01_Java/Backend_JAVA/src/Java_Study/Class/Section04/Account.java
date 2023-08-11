package Java_Study.Class.Section04;

public class Account {
    String name;
    String accountName;
    int balance;

    public Account(String n, String an, int b){
        name = n;
        accountName = an;
        balance = b;
    }

    public void deposit(int amount){
        balance += amount;

        System.out.printf("%s이 %d원을 입금.\n", name, amount);
    }

    public void widthDraw(int amount){
        if (amount > balance){
            System.out.println("잔액이 부족합니다.");
        }
        else{
            balance -= amount;
            System.out.printf("%s이 %d원을 출금.\n", name, amount);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
