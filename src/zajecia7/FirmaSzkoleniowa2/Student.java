package zajecia7.FirmaSzkoleniowa2;

import java.util.HashMap;

public class Student extends Person {

    HashMap<String, Integer> marks = new HashMap<>();

    public Student(String name, String surname) {
        super(name, surname);
    }

    public void setMark(TrainingGroup trainingGroup, int mark) {
        marks.put(trainingGroup.getGroupName(), mark);
    }

    public void showMarks() {
        System.out.println(getName() + " " + getSurname() + ": ");
        for (String groupName : marks.keySet()) {
            System.out.println(groupName + " mark: " + marks.get(groupName));
        }
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", surname='" + getSurname();
    }
}
