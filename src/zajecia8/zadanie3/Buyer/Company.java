package zajecia8.zadanie3.Buyer;

public class Company extends Customer {
    private final String companyName;
    private final String companyNIP;

    public Company(String companyName, String companyNIP) {
        this.companyName = companyName;
        this.companyNIP = companyNIP;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyNIP='" + companyNIP + '\'' +
                '}';
    }
}
