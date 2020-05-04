package zajecia8.zadanie3.Buyer;

import zajecia8.zadanie3.Payment.Invoice;
import zajecia8.zadanie3.Payment.Payment;
import zajecia8.zadanie3.Product;

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

    @Override
    public Payment createPayment(Product product) {
        if (this.isPremium()) {
            Product cheaperProduct = product.makeDiscount();
            return new Invoice(product, this, cheaperProduct);
        } else {
            return new Invoice(product, this);
        }
    }
}
