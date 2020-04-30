package zajecia8.zadanie3.Payment;

import zajecia8.zadanie3.Buyer.Customer;
import zajecia8.zadanie3.Product;

public class Invoice extends Payment {
    Customer customer;

    public Invoice(Product product, Customer customer) {
        super(product);
        this.customer = customer;
    }

    public Invoice(Product product, Customer customer, Product productWithDiscount) {
        super(product);
        this.customer = customer;
        this.productWithDiscount = productWithDiscount;
    }

    @Override
    public String toString() {
        if (this.productWithDiscount == NONE)
            return "Invoice{" +
                    "product=" + product.toString() + "\n" +
                    "customer = " + customer.toString()
                    + '}';
        else return
                "Invoice{" +
                        "product=" + product.toString() +
                        ", productWithDiscount=" + productWithDiscount.toString() + "\n" +
                        "customer = " + customer.toString()
                        + '}';
    }
}
