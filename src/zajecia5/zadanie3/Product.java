package zajecia5.zadanie3;

public class Product {

    private final String name;
    private final double netPrice;
    private final String category;

    public Product(String name, double netPrice, String category) {
        this.name = name;
        this.netPrice = netPrice;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public String getCategory() {
        return category;
    }
}
