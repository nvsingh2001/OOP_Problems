package bankingsystem;

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
}
