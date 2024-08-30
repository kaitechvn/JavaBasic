package concurrency.synchronize.bank;

// Notify, notifyAll
public class BankAccount {

    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method for depositing money
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
    }

    // Synchronized method for withdrawing money
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient balance.");
        }
    }

    public synchronized void transfer(BankAccount to, int amount) throws InterruptedException {
        while (this.balance < amount) {
            wait(); // Wait until there are sufficient funds
        }
        this.withdraw(amount);
        to.deposit(amount);
        notifyAll(); // Notify all waiting threads
    }

    public int getBalance() {
        return balance;
    }

}

