package zajecia9.zadanie2;

public class Car extends Vehicle {
    private final int seats;

    public Car(String name, int year, int seats) {
        super(name, year);
        this.seats = seats;
    }
}
