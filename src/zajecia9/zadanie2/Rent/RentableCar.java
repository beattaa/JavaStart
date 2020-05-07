package zajecia9.zadanie2.Rent;

import zajecia9.zadanie2.Vehicles.Car;

public class RentableCar extends Car implements Rentable {
    private Person person;
    private boolean isRented;

    public RentableCar(String name, int year, int seats) {
        super(name, year, seats);
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
        if (isRented == false) {
            person = new Person(firstName, lastName, id);
            this.isRented = true;
        } else
            System.out.println("The car has been already rented");
    }

    @Override
    public void handOver() {
        person = null;
        this.isRented = false;
    }

    @Override
    public boolean isRent() {
        return this.isRented;
    }
}
