package zajecia9.zadanie1.Components;

import zajecia9.zadanie1.ComputerParts.TempVulnerableComponents;
import zajecia9.zadanie1.ComputerParts.TemperatureTooHighException;

public class Processor extends TempVulnerableComponents {
    public static int CLOCKING_UP_FACTOR = 10;
    private double clocking;
    private double temp;
    private final double maxTemp;

    public Processor(String model, String producer, String serialNo, double clocking, double temp, double maxTemp) {
        super(model, producer, serialNo);
        this.clocking = clocking;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }

    public void clockingUp(int increase) {
        int up = increase / 100 * CLOCKING_UP_FACTOR;
        if (up + temp > maxTemp) {
            throw new TemperatureTooHighException("Cannot increase Processor's clocking, because the temperature will be too high");
        } else {
            temp += up;
            clocking += increase;
        }
    }

    public double getClocking() {
        return clocking;
    }

    public double getTemp() {
        return temp;
    }

}
