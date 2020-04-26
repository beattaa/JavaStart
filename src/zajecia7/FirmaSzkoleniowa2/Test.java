package zajecia7.FirmaSzkoleniowa2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Katarzyna", "Jabłońska");
        Student student1 = new Student("Stanisław", "Kowalski");
        Student student2 = new Student("Aleksandra", "Wiśniewska");
        ArrayList<Student> students = new ArrayList();
        students.add(student1);
        students.add(student2);
        TrainingGroup trainingGroupEnglish = new TrainingGroup("English classes", teacher, students);
        TrainingGroup trainingGroupMath = new TrainingGroup("Math lessons", teacher, students);
//        System.out.println(trainingGroupEnglish);
        student1.setMark(trainingGroupEnglish, 5);
        student1.setMark(trainingGroupMath, 3);
        student1.showMarks();
    }
}
