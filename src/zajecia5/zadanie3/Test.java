package zajecia5.zadanie3;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product("Body rozm.56", 8.00, "Artykuły dziecięce");
        Product p2 = new Product("Tajemniczy ogród", 19.00, "Książki");
        Product p3 = new Product("Buty", 100.00, "Obuwie");
        grossPrice(p1);
        grossPrice(p2);
        grossPrice(p3);
    }

    public static void grossPrice(Product product) {
        switch (product.getCategory()) {
            case "Artykuły dziecięce":
                System.out.println("Cena brutto to: " + 1.00 * product.getNetPrice());
                break;
            case "Książki":
                System.out.println("Cena brutto to: " + 1.07 * product.getNetPrice());
                break;
            default:
                System.out.println("Cena brutto to: " + 1.23 * product.getNetPrice());
        }
    }
}
