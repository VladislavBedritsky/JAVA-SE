package modul_4.simpleClassesAndObjs.task_1;

public class RunTest1 {
    public static void main(String[] args) {

        Test1 temp = new Test1();
        temp.print();
        System.out.println("Сумма переменных = "+temp.getSum());
        System.out.println("Наибольшее значение = "+temp.getMax());
    }
}
