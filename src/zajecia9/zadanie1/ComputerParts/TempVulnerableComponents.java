package zajecia9.zadanie1.ComputerParts;

public abstract class TempVulnerableComponents extends ComputerPart {
    public TempVulnerableComponents(String model, String producer, String serialNo) {
        super(model, producer, serialNo);
    }

    public abstract void clockingUp(int increase);
}
