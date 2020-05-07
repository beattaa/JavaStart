package zajecia9.zadanie1.Components;

import zajecia9.zadanie1.ComputerParts.TempVulnerableComponents;
import zajecia9.zadanie1.ComputerParts.TemperatureTooHighException;

public class Processor extends TempVulnerableComponents {
    public static int CLOCKING_UP_FACTOR = 10;

    public Processor(String model, String producer, String serialNo, double clocking, double temp, double maxTemp) {
        super(model, producer, serialNo, clocking, temp, maxTemp);
    }

    public void clockingUpProcessor(int increase) {
        clockingUp(increase, this, CLOCKING_UP_FACTOR);
    }

    public double getClocking() {
        return clocking;
    }

    public double getTemp() {
        return temp;
    }

}
