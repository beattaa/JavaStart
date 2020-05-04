package zajecia8.zadanie4;

public class Room {
    private double temperature;
    private final int cubage;
    private AirConditioner airConditioner;

    public Room(double temperature, int cubage) {
        this.temperature = temperature;
        this.cubage = cubage;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getCubage() {
        return cubage;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void fireAirConditioner() {
        double newTemp = airConditioner.fire(this.temperature, this.cubage);
        setTemperature(newTemp);
    }
}

