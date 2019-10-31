package modul_4.simpleClassesAndObjs.task_3.logic;

import modul_4.simpleClassesAndObjs.task_3.entity.Student;

public class StudentLogic {

     public boolean isALevelStudent(Student student) {
        int[] marks = student.getMarks();

        for(int temp : marks) {
            if (temp != 9 && temp != 10) {
                return false;
            }
        }
        return true;
    }
}
