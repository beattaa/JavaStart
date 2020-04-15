package zajecia4.zadanie2;

public class Room {
    private double meterage;
    private double temperature;
    private boolean hasAirCondition;

    public Room(double meterage, double temperature, boolean hasAirCondition) {
        this.meterage = meterage;
        this.temperature = temperature;
        this.hasAirCondition = hasAirCondition;
    }

    public double getMeterage() {
        return meterage;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isHasAirCondition() {
        return hasAirCondition;
    }

    public boolean decreaseTemp() {
        if (this.temperature - 1 >= 15 && hasAirCondition) {
            this.temperature--;
            return true;
        } else {
            return false;
        }
    }
}
