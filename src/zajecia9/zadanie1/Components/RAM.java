package zajecia9.zadanie1.Components;

import zajecia9.zadanie1.ComputerParts.TempVulnerableComponents;
import zajecia9.zadanie1.ComputerParts.TemperatureTooHighException;

public class RAM extends TempVulnerableComponents {
    public static int CLOCKING_UP_FACTOR = 15;
    private final int memory;
    private double clocking;
    private double temp;
    private final double maxTemp;

    public RAM(String model, String producer, String serialNo, int memory, double clocking, double temp, double maxTemp) {
        super(model, producer, serialNo);
        this.memory = memory;
        this.clocking = clocking;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }

    public void clockingUp(int increase) {
        int up = increase / 100 * CLOCKING_UP_FACTOR;
        if (up + temp > maxTemp) {
            throw new TemperatureTooHighException("Cannot increase RAM's clocking, because the temperature will be too high");
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
