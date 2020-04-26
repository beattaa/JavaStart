package zajecia7.SklepInternetowy;

public class Customer extends Person {

    private double totalPayments;

    public Customer(String firstName, String lastName, Address address, double totalPayments) {
        super(firstName, lastName, address);
        this.totalPayments = totalPayments;
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(double totalPayments) {
        this.totalPayments = totalPayments;
    }

    @Override
    public String printInfo() {
        return "Customer: " +
                getFirstName() + " " + getLastName() + " " + getAddress().toString() +
                "totalPayments = " + totalPayments;
    }
}
