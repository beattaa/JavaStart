package zajecia8.zadanie2;

public class Vehicle {
    public String name;
    public int fuelTank;
    public double fuelConsumption;

    public Vehicle(String name, int fuelTank, double fuelConsumption) {
        this.name = name;
        this.fuelTank = fuelTank;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getAverageMilage() {
        return 100 * fuelTank / fuelConsumption;
    }
}
