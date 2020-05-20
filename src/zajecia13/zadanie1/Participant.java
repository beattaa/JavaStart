package zajecia13.zadanie1;

public class Participant implements Comparable<Participant> {
    private final String name;
    private final String surname;
    private final int result;

    public Participant(String name, String surname, int result) {
        this.name = name;
        this.surname = surname;
        this.result = result;
    }

    @Override
    public String toString() {
        return name + " " + surname + ";" + result;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getResult() {
        return result;
    }

    @Override
    public int compareTo(Participant o) {
        if (this.getResult() != o.getResult()) {
            return this.getResult() - o.getResult();
        } else if (!this.getSurname().equalsIgnoreCase(o.getSurname())) {
            return this.getSurname().compareToIgnoreCase(o.getSurname());
        } else {
            return this.getName().compareToIgnoreCase(o.getName());
        }
    }
}


