package zajecia8.zadanie4;

public class ProAirConditioner implements AirConditioner {
    public static final double TARGET_TEMPERATURE = 16.00;
    public static double POWER = 2.00;

    public double fire(double temp, double cubage) {
        if (temp > TARGET_TEMPERATURE + POWER / cubage) {
            double newTemp = temp - POWER / cubage;
            return newTemp;
        }
        return temp;
    }
}
