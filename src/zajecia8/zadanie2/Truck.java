package zajecia8.zadanie2;

public class Truck extends Car {

    public int load;

    public Truck(String name, int fuelTank, double fuelConsumption) {
        super(name, fuelTank, fuelConsumption);
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

}
