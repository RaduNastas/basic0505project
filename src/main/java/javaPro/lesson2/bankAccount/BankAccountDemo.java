package javaPro.lesson2.bankAccount;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500);

        bankAccount.deposit(1000);
        bankAccount.withdraw(150);
        System.out.println("Баланс: " + bankAccount.getBalance());
    }

}