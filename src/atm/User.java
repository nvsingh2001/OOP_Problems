package atm;

public class User {
    private final int USERID;
    private final int PIN;
    private double balance;
    private int failedAttempts;

    public User(int userID,int pin, double balance) {
        this.USERID = userID;
        this.PIN = pin;
        this.balance = balance;
        this.failedAttempts = 0;
    }

    public int getUserID() {
        return USERID;
    }

    public void setFailedAttempts(int failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    public int getFailedAttempts(){
        return failedAttempts;
    }

    public int getPIN() {
        return PIN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
