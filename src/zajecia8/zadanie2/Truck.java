package zajecia8.zadanie2;

public class Truck extends Car {

    public int load;

    public Truck(String name, int fuelTank, double fuelConsumption) {
        super(name, fuelTank, fuelConsumption);
    }

    public void setLoad(int load) {
        this.load = load;
        this.fuelConsumption += this.load / 100 * 0.5;
    }

    public int getLoad() {
        return load;
    }

    public void turnOnAirCondition() {
        this.fuelConsumption += 0.8;
        this.isAirCondition = true;
    }
}
