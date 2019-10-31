package modul_4.simpleClassesAndObjs.task_3.entity;

import java.util.Arrays;

/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {

    private String name;
    private int group;
    private int[] marks;

    public Student(String name, int group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public void setGroup(int group) {
        this.group = group;
    }
    public int getGroup() {
        return group;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return group == other.group &&
                name.equals(other.name) &&
                Arrays.equals(marks, other.marks);
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = 31*result + group;
        result = 31*result +(name == null ? 0 : name.hashCode());
        for (int temp : marks) {
            result = 31*result + temp;
        }
        return result;
    }
    @Override
    public String toString() {
        return "Student {name = " + name +  ", group = " + group + ", marks=" + Arrays.toString(marks) + "}";
    }
}

