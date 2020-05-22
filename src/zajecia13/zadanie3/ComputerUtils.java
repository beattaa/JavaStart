package zajecia13.zadanie3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComputerUtils {
    public static List<Computer> getComputersData() {
        List<Computer> computers = new ArrayList<>();

        Computer computer1 = new Computer("Mac");
        computer1.setCpu(2800);
        Computer computer2 = new Computer("HP");
        computer2.setCpu(3200);
        Computer computer3 = new Computer("Dell");
        computer3.setMemory(4);

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);

        return computers;
    }

    public static void sortComputersByUser(List<Computer> computers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz kategorie porownania: \n 1-nazwa \n 2-CPU \n 3-RAM");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Collections.sort(computers);
                break;
            case 2:
                Collections.sort(computers, Computer.getCpuComparator());
                break;
            case 3:
                Collections.sort(computers, Computer.getMemoryComparator());
                break;
            default:
                System.out.println("Niepoprawny wybór");
        }
    }
}
