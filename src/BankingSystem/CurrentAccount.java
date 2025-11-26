package BankingSystem;

public class CurrentAccount extends Account {
    private static final double WITHDRAWAL_LIMIT = 10000000;
    public CurrentAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public double getWithdrawalLimit() {
        return WITHDRAWAL_LIMIT;
    }
    public String getAccountType(){
        return "Current Account";
    }
}
