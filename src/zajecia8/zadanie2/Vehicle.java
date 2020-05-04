package zajecia8.zadanie2;

public class Vehicle {
    public String name;
    public int fuelTank;
    public double fuelConsumption;
    public boolean isAirCondition;

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
        if (this.isAirCondition == true)
            return this.fuelConsumption += 0.8;
        else
            return this.fuelConsumption;
    }

    public void turnOnAirCondition() {
        this.isAirCondition = true;
    }

    public boolean isAirCondition() {
        return isAirCondition;
    }

    public double getAverageMilage() {
        return 100 * fuelTank / getFuelConsumption();
    }

}
