package zajecia9.zadanie1.ComputerParts;

public abstract class ComputerPart {
    private final String model;
    private final String producer;
    private final String serialNo;

    public ComputerPart(String model, String producer, String serialNo) {
        this.model = model;
        this.producer = producer;
        this.serialNo = serialNo;
    }


}
