package carsimulation;

class Car {
    protected int speed;
    protected double fuel;
    protected double distance;
    protected double mileage;

    public Car(int speed, double mileage, double fuel) {
        this.speed = speed;
        this.mileage = mileage;
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getDistance() {
        return distance;
    }

    public void drive(int hours){
        if(fuel <= 0 && fuel < distance/mileage){
            System.out.println("Not enough fuel");
            return;
        }
        distance += speed * hours;
        double fuelConsumed = distance/mileage;
        fuel -= fuelConsumed;
        System.out.printf("Distance travelled : %.2f Km\n", distance);
        System.out.printf("Fuel Consumed: %.2f L\n", fuelConsumed);
    }

    public void getStatus(){
        System.out.println("Car Status");
        System.out.printf("Fuel: %.2f L\n", fuel);
        System.out.printf("Total Distance travelled: %.2f Km\n", distance);
    }
}
