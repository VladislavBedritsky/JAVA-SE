package modul_4.simpleClassesAndObjs.task_3.entity;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Student> students;

    public Group() {
        students = new ArrayList<Student>();
    }

    public void add (Student newStudent) {
        students.add(newStudent);
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Group other = (Group) obj;
        return students.equals(other.students);
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (Student st : students) {
            result = 31*result + (st == null ? 0 : st.hashCode());
        }
        return result;
    }

    @Override
    public String toString() {
        return "GroupInfo{ students= " + students + '}';
    }
}
