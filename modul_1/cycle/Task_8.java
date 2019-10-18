package modul_1.cycle;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        //8.

        int a, b, num, temp;
        ArrayList<Boolean> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(false);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Число a = ");
        a = (int) scanner.nextLong(); //метод nextInt ограничен 10 цифрами
        System.out.println("Число b = ");
        b = (int) scanner.nextLong();

        while (a > 0) {
            num = a % 10;
            a /= 10;
            temp = b;

            while (temp > 0) {
                if (temp % 10 == num) {
                    list.set(num, true);
                    break;
                }
                temp /= 10;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (list.get(i))
                System.out.print(i + " ");

        }
    }
}
