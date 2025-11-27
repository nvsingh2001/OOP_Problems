package employeemanagementsystem;

public class Employee {
    private final int ID;
    private final String NAME;
    private String designation;
    private double salary;
    private Level level;

    public Employee(int id, String name, String designation, double salary, Level level) {
        this.ID = id;
        this.NAME = name;
        this.designation = designation;
        this.salary = salary;
        this.level = level;
    }

    public int getId() {
        return ID;
    }

    public String getName() {
        return NAME;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", level=" + level +
                '}';
    }
}
