package zajecia11.zadanie1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperation {

    public static List<Employee> getEmployeeList(File file) throws FileNotFoundException {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[;\r\n]+");

        while (scanner.hasNext()) {
            String name = scanner.next();
            String surname = scanner.next();
            String pesel = scanner.next();
            String department = scanner.next();
            String salary = scanner.next();
            double salaryDouble = Double.parseDouble(salary);
            employees.add(new Employee(name, surname, pesel, department, salaryDouble));
        }
        return employees;
    }

    public static void saveEmployeeStatisticsToFile(String fileName, List<Employee> employeeList) {
        try (
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {

            writer.write("Średnia wypłata: " + EmployeeStatistics.getAverageSalary(employeeList));
            writer.newLine();
            writer.write("Najmniejsza wypłata: " + EmployeeStatistics.getMinSalary(employeeList));
            writer.newLine();
            writer.write("Największa wypłata: " + EmployeeStatistics.getMaxSalary(employeeList));
            writer.newLine();
            writer.write("Łączna liczba pracowników: " + EmployeeStatistics.getEmployeeNumber(employeeList));
            writer.newLine();
            writer.write("Liczba pracowników w dziale IT: " + EmployeeStatistics.getEmployeeNumberInDepartment(employeeList, "it"));
            writer.newLine();
            writer.write("Liczba pracowników w dziale Management: " + EmployeeStatistics.getEmployeeNumberInDepartment(employeeList, "Management"));
            writer.newLine();
            writer.write("Liczba pracowników w dziale Support: " + EmployeeStatistics.getEmployeeNumberInDepartment(employeeList, "support"));
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
