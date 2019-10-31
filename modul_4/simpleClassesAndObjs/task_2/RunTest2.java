package modul_4.simpleClassesAndObjs.task_2;

public class RunTest2 {
    public static void main(String[] args) {

        Test2 temp_1 = new Test2(20,4);
        Test2 temp_2 = new Test2();
        System.out.println("a = "+temp_1.getA());
        System.out.println("b = "+temp_1.getB());

        temp_2.setA(10);
        temp_2.setB(15);
        System.out.println("a = "+temp_2.getA());
        System.out.println("b = "+temp_2.getB());

        temp_1.setA(10);
        temp_1.setB(15);
        System.out.println("a = "+temp_1.getA());
        System.out.println("b = "+temp_1.getB());

        System.out.println(temp_1.equals(temp_2));
    }
}
