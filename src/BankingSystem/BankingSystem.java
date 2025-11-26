package BankingSystem;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer(1234,"Naman Vinay Singh", "namavinaysingh24@gmail.com","7908254373");
        Account a1 = new SavingAccount(1,0);
        c1.addAccount(a1);
        a1.deposit(10000000);
        a1.withdraw(10000000);
        a1.deposit(1000000);
        System.out.printf("%.2f\n",a1.getBalance());
        a1.transactions.printStatements();
        Account a2 = new CurrentAccount(2,0);
        c1.addAccount(a2);
        a2.deposit(10000000);
        a2.withdraw(10000000);
        a2.transactions.printStatements();
    }
}
