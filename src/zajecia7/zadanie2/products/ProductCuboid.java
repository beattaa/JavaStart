package zajecia7.zadanie2.products;

public class ProductCuboid extends Product {
    private final int height;
    private final int width;
    private final int length;

    public ProductCuboid(String name, double price, int height, int width, int length) {
        super(name, price);
        this.height = height;
        this.width = width;
        this.length = length;
    }
}
