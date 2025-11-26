package BankingSystem;

abstract class Account {
    protected long accountNumber;
    protected double balance;
    protected Transactions transactions;
    public Account(long accountNumber, double balance) {this.accountNumber = accountNumber;this.balance = balance; this.transactions = new Transactions();}
    public abstract double getWithdrawalLimit();
    public void deposit(double amount) {
        if(amount <= 0){
            System.out.println("Deposit Amount Cannot be <= 0");
            return;
        }
        balance += amount;
        System.out.printf("Amount of ₹%.2f has been deposited to your account.\n",amount);
        transactions.add(new Transaction("Deposit",amount,balance));
    }
    public void withdraw(double amount) {
        if(amount > getWithdrawalLimit()) {
            System.out.printf("Amount to withdraw is greater than withdrawal limit.\nWithdrawal amount should be less than ₹%.2f\n",getWithdrawalLimit());
            return;
        }
        if(amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        if(amount <= 0) {
            System.out.println("Withdrawal amount cannot be <= 0.");
            return;
        }
        balance -= amount;
        System.out.printf("Amount of ₹%.2f has been withdrawn successfully.",amount);
        transactions.add(new Transaction("Withdraw",amount,balance));
    }
    public double getBalance() { return balance; };
    public long getAccountNumber() { return accountNumber; };
}
