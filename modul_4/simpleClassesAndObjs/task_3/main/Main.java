package modul_4.simpleClassesAndObjs.task_3.main;

import modul_4.simpleClassesAndObjs.task_3.entity.Group;
import modul_4.simpleClassesAndObjs.task_3.entity.Student;
import modul_4.simpleClassesAndObjs.task_3.logic.GroupLogic;
import modul_4.simpleClassesAndObjs.task_3.logic.StudentLogic;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentLogic stLogic = new StudentLogic();
        GroupLogic grLogic = new GroupLogic(stLogic);
        Group gr = new Group();

        gr.add(new Student("Korobeynikov A.V.", 202, new int[]{9, 10, 9, 10, 9}));
        gr.add(new Student("Gavrichenko P.I.", 210, new int[]{6, 7, 7, 8, 7}));
        gr.add(new Student("Babich K.O.", 216, new int[]{8, 7, 6, 7, 9}));
        gr.add(new Student("Dobrush E.P.", 202, new int[]{9, 6, 8, 7, 8}));
        gr.add(new Student("Golenko R.A.", 216, new int[]{9, 9, 9, 10, 9}));
        gr.add(new Student("Soroka A.M.", 202, new int[]{10, 8, 9, 9, 9}));
        gr.add(new Student("Makarevich E.M.", 210, new int[]{10, 9, 10, 9, 9}));
        gr.add(new Student("Zamoyskiy D.N.", 205, new int[]{7, 8, 7, 9, 8}));
        gr.add(new Student("Trubodur I.S.", 205, new int[]{6, 7, 6, 8, 5}));
        gr.add(new Student("Marvel D.C.", 202, new int[]{4, 5, 4, 5, 4}));
        gr.add(new Student("Petrov N.M.", 216, new int[]{6, 7, 9, 7, 8}));

        List<Student> onlyALevelStudent = grLogic.takeALevelSt(gr);
        System.out.println("Количество отличников: "+grLogic.countOfALevelSt(gr));
        print(onlyALevelStudent);
    }
    public static void print (List<Student> onlyALevelStudent) {
        for (Student st : onlyALevelStudent) {
            System.out.println(st.getName() + "; Группа - " + st.getGroup() + ";");
        }
    }
}
