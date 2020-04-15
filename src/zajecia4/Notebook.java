package zajecia4;

public class Notebook {
    private String producer;
    private String model;
    private byte randomAccessMemory;
    private short centralProcessingUnit;
    private boolean hasOS;

    public Notebook(String producer, String model, short centralProcessingUnit) {
        this.producer = producer;
        this.model = model;
        this.centralProcessingUnit = centralProcessingUnit;
    }

    public Notebook(String producer, String model, short centralProcessingUnit, byte randomAccessMemory) {
        this(producer, model, centralProcessingUnit);
        this.randomAccessMemory = randomAccessMemory;
    }

    public Notebook(String producer, String model, short centralProcessingUnit, byte randomAccessMemory, boolean hasOS) {
        this(producer, model, centralProcessingUnit, randomAccessMemory);
        this.hasOS = hasOS;
    }

    public void setRandomAccessMemory(byte randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public void setHasOS(boolean hasOS) {
        this.hasOS = hasOS;
    }
}
