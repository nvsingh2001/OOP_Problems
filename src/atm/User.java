package atm;

public class User {
    private final int USERID;
    private final int PIN;
    private double balance;
    private int faildedAttempts;

    public User(int userID,int pin, double balance) {
        this.USERID = userID;
        this.PIN = pin;
        this.balance = balance;
        this.faildedAttempts = 0;
    }

    public int getUserID() {
        return USERID;
    }

    public void setFaildedAttempts(int faildedAttempts) {
        this.faildedAttempts = faildedAttempts;
    }

    public int getFaildedAttempts(){
        return faildedAttempts;
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
