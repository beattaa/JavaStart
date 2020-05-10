package zajecia9.zadanie1;

import zajecia9.zadanie1.Computer.Computer;
import zajecia9.zadanie1.Components.HardDisk;
import zajecia9.zadanie1.Components.Processor;
import zajecia9.zadanie1.Components.RAM;

public class Test {
    public static void main(String[] args) {
        Processor processor = new Processor("Procesor No 1", "ABC Company", "1234", 3000, 20, 40);
        RAM RAM = new RAM("RAM", "DEF Company", "4321", 64, 25, 70, 80);
        HardDisk hardDisk = new HardDisk("Hard disc", "GHI Company", "5678", 128);

        Computer myComputer = new Computer(processor, RAM, hardDisk);

        myComputer.processorClockingUp(100);
        System.out.println(myComputer.getProcessor().getTemp());
//        myComputer.processorClockingUp(200);
//        System.out.println(myComputer.getProcessor().getTemp());
        myComputer.RAMClockingUp(100);
        System.out.println(myComputer.getRAM().getTemp());

    }
}
