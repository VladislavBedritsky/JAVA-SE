package modul_4.simpleClassesAndObjs.task_1;

    /*
    1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
     */

public class Test1 {

    private int a = 4;
    private int b = 7;

    public void print () {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }

    public int getMax() {
        return Math.max(a, b);
    }
}
