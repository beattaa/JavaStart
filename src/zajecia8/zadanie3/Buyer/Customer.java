package zajecia8.zadanie3.Buyer;

import zajecia8.zadanie3.Payment.Payment;
import zajecia8.zadanie3.Product;

public abstract class Customer {
    private boolean isPremium;

    public boolean isPremium() {
        return isPremium;
    }

    public void makePremium() {
        this.isPremium = true;
    }

    public abstract Payment createPayment(Product product);
}
