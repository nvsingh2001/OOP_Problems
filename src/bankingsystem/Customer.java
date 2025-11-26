package bankingsystem;

public class Customer {
    private final long CUSTOMER_ID;
    private String fullName;
    private String email;
    private String phoneNumber;
    Account[] accounts = new Account[10];
    private int numberOfAccounts;

    public Customer(long customerID, String fullName, String email, String phoneNumber) {
        this.CUSTOMER_ID = customerID;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        numberOfAccounts = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addAccount(Account account){
        if(numberOfAccounts < accounts.length){
            accounts[numberOfAccounts++] = account;
        }
    }

    public void removeAccount(Account account){
        if(numberOfAccounts > 0){
            accounts[numberOfAccounts--] = account;
        }
    }

    public Account getAccount(long accountNumber){
        for(int i = 0; i < numberOfAccounts; i++){
            if(accounts[i].getAccountNumber() == accountNumber){
                return accounts[i];
            }
        }
        return null;
    }
}
