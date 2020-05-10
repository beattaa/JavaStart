package zajecia9.zadanie1.Components;

import zajecia9.zadanie1.ComputerParts.ComputerPart;

public class HardDisk extends ComputerPart {
    private final int memory;

    public HardDisk(String model, String producer, String serialNo, int memory) {
        super(model, producer, serialNo);
        this.memory = memory;
    }
}
