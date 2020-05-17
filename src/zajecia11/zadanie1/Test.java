package zajecia11.zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/employees.txt");
        List<Employee> employees = FileOperation.getEmployeeList(file);
        FileOperation.saveEmployeeStatisticsToFile("src/zajecia11/zadanie1/statistics", employees);
    }
}

