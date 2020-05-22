package zajecia13.zadanie2;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Computer> computers = ComputerUtils.getComputersData();
        ComputerUtils.sortComputersByUser(computers);
        System.out.println("Lista komputerow po posegregowaniu: \n" + computers);
    }
}
