package zajecia2;

public class Shop {
    public static void main(String[] args) {
        Product chocolate = new Product("Milka","Mondelez",3.00, true);
        Product milk = new Product("Łaciate 3.2%", "Mlekpol",2.50, false);

        System.out.println(chocolate.toString());
        System.out.println( milk.toString());
    }
}
