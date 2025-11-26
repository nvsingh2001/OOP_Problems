package carSimulation;

public class ElectricCar extends Car {
    public ElectricCar(int speed, double mileage, double battery) {
        super(speed, mileage, battery);
    }
    @Override
    public void drive(int hours) {
        if(fuel <= 0 && fuel < distance/mileage){
            System.out.println("Not enough fuel");
            return;
        }
        distance += speed * hours;
        double fuelConsumed = distance/mileage;
        fuel -= fuelConsumed;
        System.out.printf("Distance travelled : %.2f Km\n", distance);
        System.out.printf("Battery Consumed: %.2f %%\n", fuelConsumed);
    }

    @Override
    public void getStatus(){
        System.out.println("Electric Car Status");
        System.out.printf("Battery: %.2f %%\n", fuel);
        System.out.printf("Total Distance travelled: %.2f Km\n", distance);
    }
}

