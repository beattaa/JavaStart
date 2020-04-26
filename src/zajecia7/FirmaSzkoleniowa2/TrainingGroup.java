package zajecia7.FirmaSzkoleniowa2;

import java.util.ArrayList;

public class TrainingGroup {
    private String groupName;
    private Teacher teacher;
    private ArrayList<Student> students;

    public TrainingGroup(String groupName, Teacher teacher, ArrayList<Student> students) {
        this.groupName = groupName;
        this.teacher = teacher;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
