package zajecia7.SklepInternetowy;

public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String printInfo() {
        return "Employee: " +
                getFirstName() + " " + getLastName() + " " + getAddress().toString() +
                "salary = " + salary;
    }

}
