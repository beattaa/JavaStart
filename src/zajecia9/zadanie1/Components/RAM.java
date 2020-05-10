package zajecia9.zadanie1.Components;

import zajecia9.zadanie1.ComputerParts.TempVulnerableComponents;
import zajecia9.zadanie1.ComputerParts.TemperatureTooHighException;

public class RAM extends TempVulnerableComponents {
    public static int CLOCKING_UP_FACTOR = 15;
    private final int memory;

    public RAM(String model, String producer, String serialNo, double clocking, double temp, double maxTemp, int memory) {
        super(model, producer, serialNo, clocking, temp, maxTemp);
        this.memory = memory;
    }

    public void clockingUpRAM(int increase) {
        clockingUp(increase, this, CLOCKING_UP_FACTOR);
    }

    public double getClocking() {
        return clocking;
    }

    public double getTemp() {
        return temp;
    }

}
