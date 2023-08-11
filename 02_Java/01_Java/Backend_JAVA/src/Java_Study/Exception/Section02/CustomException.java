package Java_Study.Exception.Section02;

public class CustomException {
    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(50000);

        try {
            a.withdraw(60000);
        }
        catch (BalanceInsufficientException e) {
            String message = e.getMessage();

            System.out.println(message);
            System.out.println();

            e.printStackTrace();
        }
    }
}
