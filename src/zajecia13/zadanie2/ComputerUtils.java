package zajecia13.zadanie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComputerUtils {
    public static List<Computer> getComputersData() {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Mac", 2800, 16));
        computers.add(new Computer("HP", 3200, 8));
        computers.add(new Computer("Dell", 4100, 4));
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
