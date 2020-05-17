package zajecia11.zadanie1;

import java.util.List;

public class EmployeeStatistics {

    public static int getEmployeeNumber(List<Employee> employeeList) {
        return employeeList.size();
    }

    public static int getEmployeeNumberInDepartment(List<Employee> employeeList, String department) {
        int counter = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getDepartment().equalsIgnoreCase(department))
                counter++;
        }
        return counter;
    }


    public static double getAverageSalary(List<Employee> employeeList) {
        double salarySum = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            salarySum += employeeList.get(i).getSalary();
        }
        return salarySum / employeeList.size();
    }

    public static double getMaxSalary(List<Employee> employeeList) {
        double maxSalary = employeeList.get(0).getSalary();
        for (int i = 0; i < employeeList.size(); i++) {
            if (maxSalary < employeeList.get(i).getSalary()) {
                maxSalary = employeeList.get(i).getSalary();
            }
        }
        return maxSalary;
    }

    public static double getMinSalary(List<Employee> employeeList) {
        double minSalary = employeeList.get(0).getSalary();
        for (int i = 0; i < employeeList.size(); i++) {
            if (minSalary > employeeList.get(i).getSalary()) {
                minSalary = employeeList.get(i).getSalary();
            }
        }
        return minSalary;
    }

}
