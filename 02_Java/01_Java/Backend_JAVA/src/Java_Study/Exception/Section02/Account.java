package Java_Study.Exception.Section02;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws BalanceInsufficientException {
        if (balance < money){
            throw new BalanceInsufficientException("잔액이 " + (money - balance) + "원 부족합니다");
        }
        balance -= money;
    }
}
