public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000);
        account.deposit(500);
        account.withdraw(200);

        System.out.println(account.getOwner() + " has $" + account.getBalance());

        account.withdraw(2000);

        System.out.println(account.getOwner() + " has $" + account.getBalance());

        account.deposit(1000);

        System.out.println(account.getOwner() + " has $" + account.getBalance());
    }
}
