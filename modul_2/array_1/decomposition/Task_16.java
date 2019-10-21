package modul_2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int[] array = {67834,95371,34563,45464,39133,23413,35732};
        System.out.println("Наши числа - "+ Arrays.toString(array));
        System.out.println("Сумма(ы) чисел, состоящих из нечетных цифр:"+Arrays.toString(arrayOfSum(array)));
        amount(array);

    }
    private static int amountNumb (int x) {                //размер числа
        int r = 0;
        do {
            x = x / 10;
            r++;
        } while(x != 0);
        return r;
    }
    private static int[] amountOfDigits (int x) {         //цифры в числе
        int[]arr = new int[amountNumb(x)];
        for (int i = amountNumb(x);i > 0;i--) {
            arr[i - 1] = x%10;
            x /= 10;
        }
        return arr;
    }
    private static int sizeOfNewArray (int[] array) {     //размер массива чисел из нечетных цифр
        int k = 0;
        int r = 0;
        for(int tmp:array){

            for(int j = 0;j < amountOfDigits(tmp).length ;j++){
                if (amountOfDigits(tmp)[j] % 2 != 0) {
                    k++;
                }
            }
            if(k == amountOfDigits(tmp).length) {
                r++;
            }
            k = 0;
        }
        return r;
    }
    private static int[] arrayOfSum (int [] array) {           // массив сумм
        int k = 0;
        int i = 0;
        int sum = 0;
        int[]newArr = new int[sizeOfNewArray(array)];
        for(int tmp:array){

            for(int j = 0;j < amountOfDigits(tmp).length ;j++){
                if (amountOfDigits(tmp)[j] % 2 != 0) {
                    k++;
                    sum += amountOfDigits(tmp)[j];
                }
            }
            if(k == amountOfDigits(tmp).length) {
                newArr[i] = sum;
                i++;
            }
            k = 0;
            sum = 0;
        }
        return newArr;
    }
    private static void amount (int [] array) {                  //количество четных чисел в суммах
       int k = 0;
        for(int tmp:arrayOfSum(array)) {

            for(int j = 0;j < amountNumb(tmp) ;j++) {
                if (amountOfDigits(tmp)[j] % 2 == 0) {
                    k++;
                }
            }
            System.out.println("У суммы ["+tmp+"] количество четных цифр = "+k);
            k = 0;
        }
    }


}
