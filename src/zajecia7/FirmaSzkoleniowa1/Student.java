package zajecia7.FirmaSzkoleniowa1;

public class Student extends Person {

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", surname='" + getSurname();
    }

}
