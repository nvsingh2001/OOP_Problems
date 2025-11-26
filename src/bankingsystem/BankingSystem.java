package bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1234,"Naman Vinay Singh", "namavinaysingh24@gmail.com","7908254373");

        Account account1 = new SavingAccount(1,0);
        customer1.addAccount(account1);
        account1.deposit(10000000);
        account1.withdraw(10000000);
        account1.withdraw(1000000);
        System.out.printf("%.2f\n",account1.getBalance());
        account1.transactions.printStatements();

        Account account2 = new CurrentAccount(2,0);
        customer1.addAccount(account2);
        account2.deposit(10000000);
        account2.withdraw(10000000);
        account2.transactions.printStatements();
    }
}
