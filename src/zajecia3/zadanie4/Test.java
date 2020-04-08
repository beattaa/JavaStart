package zajecia3.zadanie4;

public class Test {
    public static void main(String[] args) {
        Category sweets = new Category("sweets", "Some sugar for better mood");
        Category vegetables = new Category("vegetables", "Not so bad as you think");

        Product chocolate = new Product("Milka", 3.50, "Łaciata", sweets);
        Product iceCreams = new Product("Zielona Budka", 10.99, "Karmelowe", sweets);

        Product carrot = new Product("Carrot", 3.59, "Czysta luteina", vegetables);
        Product orange = new Product("Orange", 4.99, "For juice");

        SpecialOffer specialOfferForChocolate = new SpecialOffer(chocolate, "10% wiecej cukru, 20% taniej", 0.2);

        System.out.println(chocolate.toString());
        System.out.println(iceCreams.toString());
        System.out.println(carrot.toString());
        System.out.println(orange.toString());
    }

}
