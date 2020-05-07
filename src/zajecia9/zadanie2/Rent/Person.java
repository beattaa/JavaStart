package zajecia9.zadanie2.Rent;

public class Person {
    private final String name;
    private final String surname;
    private final String id;

    public Person(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
