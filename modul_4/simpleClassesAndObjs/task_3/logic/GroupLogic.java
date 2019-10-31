package modul_4.simpleClassesAndObjs.task_3.logic;

import modul_4.simpleClassesAndObjs.task_3.entity.Group;
import modul_4.simpleClassesAndObjs.task_3.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {

    private StudentLogic stLogic;

    public GroupLogic(StudentLogic stLogic) {
        this.stLogic = stLogic;
    }

    public int countOfALevelSt (Group group) {
        int k = 0;
        List<Student> students = group.getStudents();

        for (Student st : students) {
            if(stLogic.isALevelStudent(st)) {
                k++;
            }
        }
        return k;
    }

    public List<Student> takeALevelSt (Group group) {
       List<Student> result = new ArrayList<>();
        List<Student> students = group.getStudents();

        for (Student st : students) {
            if(stLogic.isALevelStudent(st)) {
                result.add(st);
            }
        }
        return result;
    }

}
