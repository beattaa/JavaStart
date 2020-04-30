package zajecia8.zadanie3;

import zajecia8.zadanie3.Buyer.Company;
import zajecia8.zadanie3.Buyer.Customer;
import zajecia8.zadanie3.Payment.Invoice;
import zajecia8.zadanie3.Payment.Payment;
import zajecia8.zadanie3.Payment.Receipt;

public class Shop {
    public static Payment sellProduct(Product product, Customer customer) {
        if (customer instanceof Company) {
            if (customer.isPremium()) {
                Product cheaperProduct = product.makeDiscount();
                return new Invoice(product, customer, cheaperProduct);
            } else {
                return new Invoice(product, customer);
            }
        } else {
            if (customer.isPremium()) {
                Product cheaperProduct = product.makeDiscount();
                return new Receipt(product, cheaperProduct);
            } else {
                return new Receipt(product);
            }
        }
    }
}
