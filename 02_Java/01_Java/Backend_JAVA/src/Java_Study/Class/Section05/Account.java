package Java_Study.Class.Section05;

public class Account {
    private String name;
    private String ssn;
    private int balance;

    public Account(String name, String ssn, int balance){
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
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

    public int getMoney(){
        return balance;
    }

    public void setMoney(int balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountName='" + ssn + '\'' +
                ", balance=" + balance +
                '}';
    }
}
