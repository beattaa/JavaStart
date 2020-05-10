package zajecia9.zadanie1.ComputerParts;

public abstract class TempVulnerableComponents extends ComputerPart {

    public double clocking;
    public double temp;
    public final double maxTemp;

    public TempVulnerableComponents(String model, String producer, String serialNo, double clocking, double temp, double maxTemp) {
        super(model, producer, serialNo);
        this.clocking = clocking;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }

    public void clockingUp(int increase, TempVulnerableComponents tvc, int clockingUpFactor) {
        int up = increase / 100 * clockingUpFactor;
        if (up + tvc.temp > tvc.maxTemp) {
            throw new TemperatureTooHighException("Cannot increase Processor's clocking, because the temperature will be too high");
        } else {
            tvc.temp += up;
            tvc.clocking += increase;
        }
    }

    public double getClocking() {
        return clocking;
    }

    public double getTemp() {
        return temp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }
}
