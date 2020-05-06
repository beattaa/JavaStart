package zajecia9.zadanie1.Computer;

import zajecia9.zadanie1.Components.HardDisk;
import zajecia9.zadanie1.Components.Processor;

public class Computer {
    private final Processor processor;
    private final zajecia9.zadanie1.Components.RAM RAM;
    private final HardDisk hardDisk;

    public Computer(Processor processor, zajecia9.zadanie1.Components.RAM RAM, HardDisk hardDisk) {
        this.processor = processor;
        this.RAM = RAM;
        this.hardDisk = hardDisk;
    }

    public Processor getProcessor() {
        return processor;
    }

    public zajecia9.zadanie1.Components.RAM getRAM() {
        return RAM;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void processorClockingUp(int increase) {
        processor.clockingUp(increase);
    }

    public void RAMClockingUp(int increase) {
        RAM.clockingUp(increase);
    }
}
