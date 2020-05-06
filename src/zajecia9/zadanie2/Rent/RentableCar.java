package zajecia9.zadanie2.Rent;

import zajecia9.zadanie2.Vehicles.Car;

public class RentableCar extends Car implements Rentable {
    public static Person NONE = null;
    private Person person;
    private boolean isRented;
    private String id;

    public RentableCar(String name, int year, int seats, String id) {
        super(name, year, seats);
        this.id = id;
        this.person = NONE;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        if (person == null)
            return "RentableCar{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    ", currently not rented" +
                    '}';
        else return "RentableCar{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rented by " + person.toString() +
                '}';

    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        person = new Person(firstName, lastName);
        this.id = id;
        this.isRented = true;

    }

    @Override
    public void handOver() {
        person = NONE;
        this.isRented = false;
    }

    @Override
    public boolean isRent() {
        return this.isRented;
    }
}
