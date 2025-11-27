package parkingsystem;

public class Vehicle {
    private String plateNumber;
    private String color;
    private String Model;
    private final String VEHICLE_TYPE;

    public Vehicle(String plateNumber, String color, String Model, String vehicleType) {
        this.plateNumber = plateNumber;
        this.color = color;
        this.Model = Model;
        this.VEHICLE_TYPE = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VEHICLE_TYPE='" + VEHICLE_TYPE + '\'' +
                ",plateNumber='" + plateNumber + '\'' +
                ", color='" + color + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }

    public String getVehicleType() {
        return VEHICLE_TYPE;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
