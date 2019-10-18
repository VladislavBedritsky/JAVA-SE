package modul_1.cycle;

import java.math.BigInteger;

public class Task_4 {
    public static void main(String[] args) {

        //4.

        BigInteger pro = BigInteger.valueOf(1);

        for (int i = 2; i <= 200; i++) {
            pro = pro.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println("Наше число");
        System.out.println(pro);

    }
}
