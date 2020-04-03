package zajecia2.zadanie2;

public class Ingredient {
    private String name;
    private double amount;

    public Ingredient(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "(name = " + name + " amount = " + amount + "ml)\n";
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
