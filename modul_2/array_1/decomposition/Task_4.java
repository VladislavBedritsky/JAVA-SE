package modul_2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    private static double maxR;
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Количество точек - ");
        int n =scr.nextInt();
        System.out.println("Наши точки - ");
        int[][] array = ourPoints(n);
        int[] result = findNumbersOfArray(array,n);
        System.out.println("Наибольшее расстояние "+maxR+" между точками под номером "+result[0]+" и "+result[1]);
    }

    private static int[][] ourPoints(int n)  {
        int [][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < 2 ;j++) {
                arr[i][j] = (int) (Math.random()*20-10);
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    private static double countR (int [][] array) {
        return Math.sqrt(Math.pow((array[0][0] - array[1][0]),2) + Math.pow((array[0][1] - array[1][1]),2));
    }

    private static int [] findNumbersOfArray (int [][] array,int n) {
        int [] res = new int[2];
        double r;       //расстояние между точками
        maxR = 0;   // макс.расст.
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int [][] points = {{array[i][0], array[i][1]},
                        {array[j][0], array[j][1]}};
                r = countR(points);
                if (r > maxR) {
                    maxR = r;
                    res[0] = i ;
                    res[1] = j ;
                }
            }
        }
        return res;
    }

}
