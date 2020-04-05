package zajecia2.zadanie2;

import java.util.Arrays;

public class Drink {
    String name;
    double price;
    boolean isWithAlcohol;
    Ingredient[] ingredients;

    public Drink(String name, double price, boolean isWithAlcohol, Ingredient[] ingredients) {
        this.name = name;
        this.price = price;
        this.isWithAlcohol = isWithAlcohol;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Drink: \n" +
                "name='" + name + '\'' +
                ", price=" + price + "PLN" +
                ", isWithAlcohol=" + isWithAlcohol + ",\n" +
                "ingredients=\n" + Arrays.toString(ingredients);
    }

    public double getVolume() {
        double volume = 0;
        for (Ingredient ingredient : ingredients) {
            volume += ingredient.getAmount();
        }
        return volume;
    }
}
