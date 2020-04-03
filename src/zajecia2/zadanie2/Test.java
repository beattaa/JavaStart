package zajecia2.zadanie2;

public class Test {
    public static void main(String[] args) {
        Ingredient[] ingredients = new Ingredient[3];
        ingredients[0] = new Ingredient("milk", 300);
        ingredients[1] = new Ingredient("Malibu", 70);
        ingredients[2] = new Ingredient("pineapple juice", 100);

        Drink pinaColada = new Drink("pinaColada", 20.00, true, ingredients);

        System.out.println(pinaColada.toString());
        System.out.println("Drink volume is: " + pinaColada.getVolume());
    }
}
