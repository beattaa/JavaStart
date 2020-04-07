package zajecia3;

public class Test {
    public static void main(String[] args) {
        Producer producer = new Producer("Mlekovita");
        producer.addAddress(new Address("Wawa"));
        Product product1 = new Product("mleko", 2.50);
        product1.producer = producer;
    }
}
