package zajecia8.zadanie3.Buyer;

import zajecia8.zadanie3.Payment.Payment;
import zajecia8.zadanie3.Payment.Receipt;
import zajecia8.zadanie3.Product;

public class Individual extends Customer {
    private final String name;
    private final String surname;

    public Individual(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public Payment createPayment(Product product) {
        if (this.isPremium()) {
            Product cheaperProduct = product.makeDiscount();
            return new Receipt(product, cheaperProduct);
        } else {
            return new Receipt(product);
        }
    }
}
