package zajecia7.FirmaSzkoleniowa1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Anna", "Jabłońska");
        Student student1 = new Student("Jan", "Kowalski");
        Student student2 = new Student("Joanna", "Wiśniewska");
        ArrayList<Student> students = new ArrayList();
        students.add(student1);
        students.add(student2);

        TrainingGroup trainingGroup = new TrainingGroup(teacher, students);
        System.out.println(trainingGroup);
    }
}
