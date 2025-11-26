package BankingSystem;

public class SavingAccount extends Account {
    private static final double WITHDRAWAL_LIMIT = 1000000;
    public SavingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public double getWithdrawalLimit() {
        return WITHDRAWAL_LIMIT;
    }
    public String getAccountType(){
        return "Saving Account";
    }

    public static class Customer {
        private long customerId;
        private String customerName;
        private long phoneNumber;
        private Account account;
    }
}
