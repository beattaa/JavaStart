package zajecia7.zadanie1;

public class Car extends Vehicle {
    public boolean isAirCondition;

    public Car(String name, int fuelTank, double fuelConsumption) {
        super(name, fuelTank, fuelConsumption);
    }

    public boolean isAirCondition() {
        return isAirCondition;
    }

    public void turnOnAirCondition() {
        this.fuelConsumption += 0.8;
        this.isAirCondition = true;
    }
}
