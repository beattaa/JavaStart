package zajecia8.zadanie3.Buyer;

public class Individual extends Customer {
    private final String name;
    private final String surname;

    public Individual(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
