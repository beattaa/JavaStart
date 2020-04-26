package zajecia7.zadanie2.products;

public class ProductSphere extends Product {
    private final int radius;

    public ProductSphere(String name, double price, int radius) {
        super(name, price);
        this.radius = radius;
    }
}
