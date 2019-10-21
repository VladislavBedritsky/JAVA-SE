package modul_2.decomposition;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {

        System.out.println("Наши числа - "+Arrays.toString(arrayOfNum()));
        System.out.println("Сумма факториалов = "+ amountFactorial());
    }
    private static int[] arrayOfNum () {
        int k = 0;
        for(int i = 1; i <= 9;i++) {
            if (i%2 != 0) {
                k++;
            }
        }
        int[] array = new int[k];
        int p = 0;
        for(int i = 0; i <= 9;i++) {
            if (i % 2 != 0) {
                array[p] = i;
                p++;
            }
        }
      return array;
    }
    private static int factorial(int n) {
       int result = 1;
        if (n == 0 || n == 1) {
            return result;
        }
        return result = n * factorial(n-1);
    }
    private static int amountFactorial () {
        int amount = 0;
        for(int tmp:arrayOfNum()) {
            amount += factorial(tmp);
        }
        return amount;
    }
}
