package zajecia10.zadanie1;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        checkPersonParameters(firstName, lastName, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void checkPersonParameters(String firstName, String lastName, int age) throws NameUndefinedException, IncorrectAgeException {
        if (firstName == null || firstName.length() < 2)
            throw new NameUndefinedException();
        if (lastName == null || lastName.length() < 2)
            throw new NameUndefinedException();
        if (age < 1)
            throw new IncorrectAgeException();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
