package employeemanagementsystem;

public enum Level {
    JUNIOR(1),
    MID(1.25),
    SENIOR(1.30),
    LEAD(1.40);

    private final double increment;

    Level(double increment) {
        this.increment = increment;
    }

    public double getIncrement() {
        return increment;
    }
}
