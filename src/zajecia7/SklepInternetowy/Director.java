package zajecia7.SklepInternetowy;

public class Director extends Employee {
    private double bonus;

    public Director(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double totalPayment() {
        return bonus + getSalary();
    }

    @Override
    public String printInfo() {
        return "Director: " +
                getFirstName() + " " + getLastName() + " " + getAddress().toString() +
                "salary = " + getSalary() + "bonus: " + bonus + " total payment = " + totalPayment();
    }

}
