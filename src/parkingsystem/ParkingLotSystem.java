package parkingsystem;

import java.util.Scanner;

public class ParkingLotSystem {

    private static final int CAPACITY = 50;

    static Vehicle registerVehicle(Scanner input){
        int choice;
        String plateNumber, color, model;
        Vehicle vehicle = null;
        do{
            parkingMenu();
            choice = input.nextInt();
            if(choice > 4 || choice < 1){
                System.out.println("Invalid choice");
                continue;
            }
            if(choice == 4) return vehicle;
            System.out.print("\nEnter your plate number: ");
            plateNumber = input.next();
            System.out.print("\nEnter your color: ");
            color = input.next();
            System.out.print("\nEnter your model: ");
            model = input.next();
            if(choice==1){
                vehicle = new Truck(plateNumber, color, model);
            }else if(choice==2){
                vehicle = new Bike(plateNumber, color, model);
            } else {
                vehicle = new Car(plateNumber, color, model);
            }
            break;
        }while(true);
        return vehicle;
    }

    static void parkingMenu(){
        System.out.println("1. Truck");
        System.out.println("2. Bike");
        System.out.println("3. Car");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    static void menu(){
        System.out.println("Welcome to Parking System:");
        System.out.println("1. Park a Vehicle");
        System.out.println("2. Exit a Vehicle");
        System.out.println("3. Get Information about parked Vehicle");
        System.out.println("4. Check Total number of occupied slots");
        System.out.println("5. Check Total Revenue");
        System.out.println("6. Check Parking Charges");
        System.out.println("7. Change Parking Charges");
        System.out.println("8. Quit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(CAPACITY,new double[]{50,100,200});
        Scanner input = new Scanner(System.in);
        do{
            menu();
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    if(parkingLot.isFull()){
                        System.out.println("Parking Lot Full");
                    }else{
                        Vehicle vehicle = registerVehicle(input);
                        if(vehicle!=null){
                            int slotNumber = parkingLot.addVehicle(vehicle);
                            System.out.println("Vehicle added successfully and can be parked at " + slotNumber + ".");
                        }
                    }
                    break;
                case 2:
                    if(parkingLot.isEmpty()){
                        System.out.println("Parking Lot Empty");
                    }else{
                        System.out.print("Enter the slot Number: ");
                        int slotNumber = input.nextInt();
                        parkingLot.removeVehicle(slotNumber);
                        System.out.println("Vehicle removed successfully and Slot Number " + slotNumber + " is free now.");
                    }
                    break;
                case 3:
                    if(parkingLot.isEmpty()){
                        System.out.println("Parking Lot Empty");
                    }else{
                        System.out.print("Enter the slot Number: ");
                        int slotNumber = input.nextInt();
                        Vehicle vehicle = parkingLot.getParkedVehicle(slotNumber);
                        if(vehicle!=null){
                            System.out.println(vehicle);
                        }else {
                            System.out.println("Slot Number " + slotNumber + " is Empty or Invalid");
                        }
                    }
                    break;
                case 4:
                    if(parkingLot.isEmpty()){
                        System.out.println("Parking Lot Empty");
                    }else{
                        System.out.println("Total number of occupied slots: " + parkingLot.getNumberOfOccupiedSlots());
                    }
                    break;
                case 5:
                    System.out.println("Total Revenue: " + parkingLot.getTotalRevenue());
                    break;
                case 6:
                    double[] getParkingCharges = parkingLot.getParkingCharges();
                    System.out.println("Parking Charges: ");
                    System.out.println("Bike: " + getParkingCharges[0]);
                    System.out.println("Car: " + getParkingCharges[1]);
                    System.out.println("Truck: " + getParkingCharges[2]);
                    break;
                case 7:
                    System.out.println("Change Parking Charges For:");
                    System.out.println("1. Bike");
                    System.out.println("2. Car");
                    System.out.println("3. Truck");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    switch(input.nextInt()){
                        case 1:
                            System.out.print("\nEnter new parking charges for bike: ");
                            parkingLot.ChangeParkingCharges(0, input.nextDouble());
                            break;
                        case 2:
                            System.out.print("\nEnter new parking charges for car: ");
                            parkingLot.ChangeParkingCharges(1, input.nextDouble());
                            break;
                        case 3:
                            System.out.print("Enter new parking charges for truck: ");
                            parkingLot.ChangeParkingCharges(2, input.nextDouble());
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }while(true);
    }
}
