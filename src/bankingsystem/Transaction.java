package bankingsystem;

public class Transaction {
    private String type;
    private double amount;
    private double balance;
    public Transaction(String type, double amount, double balance) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", balance=" + balance +
                '}';
    }
}
