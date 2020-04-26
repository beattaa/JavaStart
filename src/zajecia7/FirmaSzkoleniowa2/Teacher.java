package zajecia7.FirmaSzkoleniowa2;

public class Teacher extends Person {

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Teacher: " +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname();
    }
}
