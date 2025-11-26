package restaurant;

import java.util.Scanner;

public class RestaurantMenuSystem {

    static void orderFood(FoodItem foodItem, Scanner input) {
        int estimateOrderTime = foodItem.getPrepTime() + foodItem.getCookTime();
        System.out.println("Name: " + foodItem.getName());
        System.out.printf("Price: ₹%.2f\n",foodItem.getPrice());
        System.out.printf("Waiting Time: %d mins\n",estimateOrderTime);
        System.out.println("Confirm your order(y/n): ");
        String yesOrNo = input.next();
        if(yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Your burger will be ready in " + estimateOrderTime + " mins");
        }else{
            System.out.println("Thank you");
        }

    }

    static void menu(){
        System.out.println("Restaurant Menu");
        System.out.println("1. Order Burger");
        System.out.println("2. Order Pizza");
        System.out.println("3. Order Pizza");
        System.out.println("4. Quit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do{
            menu();
            choice = input.nextInt();
            switch(choice){
                case 1:
                    FoodItem burger = new Burger();
                    orderFood(burger,input);
                    break;
                case 2:
                    FoodItem pizza = new Pizza();
                    orderFood(pizza,input);
                    break;
                case 3:
                    FoodItem pasta = new Pasta();
                    orderFood(pasta,input);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }while(true);
    }
}