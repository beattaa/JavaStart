package zajecia8.zadanie3.Payment;

import zajecia8.zadanie3.Product;

public class Receipt extends Payment {

    public Receipt(Product product) {
        super(product);
    }

    public Receipt(Product product, Product productWithDiscount) {
        super(product);
        this.productWithDiscount = productWithDiscount;
    }

    @Override
    public String toString() {
        if (this.productWithDiscount == NONE)
            return "Receipt{" +
                    "product=" + product.toString() + '}';
        else return
                "Receipt{" +
                        "product=" + product.toString() +
                        ", productWithDiscount=" + productWithDiscount.toString() +
                        '}';
    }
}
