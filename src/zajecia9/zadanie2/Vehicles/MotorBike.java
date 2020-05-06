package zajecia9.zadanie2.Vehicles;

public class MotorBike extends Vehicle {
    private final int maxSpeed;

    public MotorBike(String name, int year, int maxSpeed) {
        super(name, year);
        this.maxSpeed = maxSpeed;
    }
}
