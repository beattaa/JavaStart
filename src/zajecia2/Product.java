package zajecia2;

public class Product {
    String name;
    String producer;
    double price;
    boolean isAvailable;

    public Product(String name, String producer, double price, boolean isAvailable) {
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "zajecia3.Product{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price + "zł" +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
