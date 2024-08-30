package concurrency.synchronize.bank;

public class BankApp {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(500);

        Thread t1 = new Thread(() -> {
            try {
                account1.transfer(account2, 300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread 1");

        Thread t2 = new Thread(() -> {
            account1.deposit(200);
            account2.withdraw(100);
        }, "Thread 2");

        t1.start();
        t2.start();
    }
}
