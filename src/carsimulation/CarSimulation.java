package carsimulation;

public class CarSimulation {
    public static void main(String[] args) {
        Car car = new Car(120,22.5,50);
        car.drive(2);
        car.getStatus();

        Car electricCar = new ElectricCar(80,5,100);
        electricCar.drive(2);
        electricCar.getStatus();
    }
}
