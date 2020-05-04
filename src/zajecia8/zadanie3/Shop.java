package zajecia8.zadanie3;

import zajecia8.zadanie3.Buyer.Customer;
import zajecia8.zadanie3.Payment.Payment;


public class Shop {
    public static Payment sellProduct(Product product, Customer customer) {
        return customer.createPayment(product);
    }
}
