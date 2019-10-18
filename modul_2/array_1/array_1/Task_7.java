package modul_2.array_1;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Введите значение n = ");
        int n = scr.nextInt();

        //инициализация и заполнение массива рандомными значениями от -1000 до 1000
        int[] array = new int[2 * n];
        for (int i = 0; i < array.length; i++) {
            int sing = Math.random() < 0.5 ? -1 : 1;
            array[i] = (int) (Math.random() * 1000) * sing;
            System.out.printf("%d ", array[i]);
        }

        int max = Integer.MIN_VALUE;
        int index1 = 0;
        int index2 = array.length - 1;
        for ( ; index1 < index2; index1++, index2--) {
            max = Integer.max(array[index1] + array[index2], max);
        }

        System.out.println("\n" + max);

    }
}
