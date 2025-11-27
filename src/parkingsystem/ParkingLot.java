package parkingsystem;

public class ParkingLot {
    private final int CAPACITY;
    private final Vehicle[] PARKING_SLOTS;
    private double TotalRevenue;
    private double[] parkingCharges = new double[3];
    private int occupiedSlots = 0;

    public ParkingLot(int capacity, double[]  parkingCharges){
        this.CAPACITY = capacity;
        this.parkingCharges = parkingCharges;
        this.PARKING_SLOTS = new Vehicle[capacity + 1];
    }

    private double getCharges(String vehicleType){
        if(vehicleType.equals("Bike")){
            return parkingCharges[0];
        }
        else if(vehicleType.equals("Car")){
            return parkingCharges[1];
        }
        return parkingCharges[2];
    }

    public int addVehicle(Vehicle vehicle){
        if(occupiedSlots >= CAPACITY){
            return -1;
        }
        for (int i = 1; i < PARKING_SLOTS.length; i++){
            if (PARKING_SLOTS[i] == null){
                PARKING_SLOTS[i] = vehicle;
                TotalRevenue = getCharges(vehicle.getVehicleType());
                occupiedSlots++;
                return i;
            }
        }
        return -1;
    }

    public Vehicle getParkedVehicle(int slotNumber){
        if(slotNumber >= CAPACITY || slotNumber < 1){
            return null;
        }
        return PARKING_SLOTS[slotNumber];
    }

    public void removeVehicle(int slotNumber){
        if(slotNumber >= CAPACITY || slotNumber < 1){
            System.out.println("Invalid Slot Number");
            return;
        }
        PARKING_SLOTS[slotNumber] = null;
        occupiedSlots--;
    }

    public boolean isEmpty(){
        return occupiedSlots == 0;
    }

    public boolean isFull(){
        return occupiedSlots == CAPACITY;
    }

    public int getNumberOfOccupiedSlots() {
        return occupiedSlots;
    }

    public void ChangeParkingCharges(int index, double newCharges){
        if(index > 2 || index < 0){
            System.out.println("Invalid index Number");
            return;
        }
        parkingCharges[index] = newCharges;
    }

    public double getTotalRevenue() {
        return TotalRevenue;
    }

    public double[]  getParkingCharges() {
        return parkingCharges;
    }
}
