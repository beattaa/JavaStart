package zajecia7.FirmaSzkoleniowa1;

import java.util.ArrayList;

public class TrainingGroup {
    private Teacher teacher;
    private ArrayList<Student> students;

    public TrainingGroup(Teacher teacher, ArrayList<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Training Group: \n" + teacher.toString() +
                ", students are: " + students;
    }
}
