package zajecia8.zadanie3.Payment;

import zajecia8.zadanie3.Product;

public class Payment {
    public static Product NONE = new Product("None", 0.00);
    Product product;
    Product productWithDiscount;

    public Payment(Product product) {
        this.product = product;
        this.productWithDiscount = NONE;
    }

    public Product getProductWithDiscount() {
        return productWithDiscount;
    }

    public void setProductWithDiscount(Product productWithDiscount) {
        this.productWithDiscount = productWithDiscount;
    }

    @Override
    public String toString() {
        if (this.productWithDiscount == NONE)
            return "Payment{" +
                    "product=" + product.toString() + '}';
        else return
                "Payment{" +
                        "product=" + product.toString() +
                        ", productWithDiscount=" + productWithDiscount.toString() +
                        '}';
    }
}
