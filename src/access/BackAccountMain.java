package access;

public class BackAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.withdraw(-1000);
        bankAccount.withdraw(3000);
        System.out.println("balance: " + bankAccount.getBalance());
    }
}
