package atm;

import java.util.Scanner;

public class ATMMachine {
    private final static User[] USERS = new User[5];

    static User getUser(int userID){
        User user = null;
        for (User value : USERS) {
            if (value.getUserID() == userID) {
                user = value;
            }
        }
        return user;
    }

    static boolean isAccountLocked(User user){
        return user.getFaildedAttempts() >= 5;
    }

    static User login(Scanner input){
        System.out.println("-------------------");
        System.out.println("Login: ");
        System.out.println("-------------------");
        System.out.print("\nEnter your userID: ");
        int userID = input.nextInt();

        System.out.print("\nEnter your PIN: ");
        int pin = input.nextInt();

        User user = getUser(userID);

        if(user == null){
            System.out.println("Invalid USERID");
            return null;
        }

        if(isAccountLocked(user)){
            System.out.println("Account is locked");
            return null;
        }

        if(user.getPIN() != pin){
            System.out.println("Invalid PIN");
            user.setFaildedAttempts(user.getFaildedAttempts() + 1);
            return null;
        }
        return user;
    }

    static void menu(){
        System.out.println("ATM Machine Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Quit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        USERS[0] = new User(34567,2001,5000);
        USERS[1] = new User(34568,2000,8000);
        USERS[2] = new User(34569,2002,9000);
        USERS[3] = new User(34570,2009,15000);
        USERS[4] = new User(34571,2402,15000);

        do{
            User user = login(input);
            if(user == null){
                continue;
            }
            menu();
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("\nYour balance is ₹%.2f\n",user.getBalance());
                    break;
                case 2:
                    System.out.print("\nEnter the amount you want to withdraw: ");
                    double amount = input.nextDouble();
                    if(user.getBalance() < amount){
                        System.out.println("Insufficient balance");
                    }else{
                        user.setBalance(user.getBalance() - amount);
                        System.out.printf("\nYou have withdrawn ₹%.2f\n", amount);
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount you want to deposit: ");
                    double deposit = input.nextDouble();
                    if(deposit <= 0){
                        System.out.println("Invalid deposit amount");
                    }
                    user.setBalance(user.getBalance() + deposit);
                    System.out.printf("You have withdrawn ₹%.2f\n", deposit);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }while(true);
    }
}
