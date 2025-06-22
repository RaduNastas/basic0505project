package javaPro.lesson2.bankAccount;


public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("The initial balance cannot be negative.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("The replenishment amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient funds or incorrect amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

}