package modul_2.array_2;

public class Task_11 {
    public static void main(String[] args) {

        int [][] matr = new int [10][20];

        System.out.println("Наша матрица - ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matr [i][j] = (int) ( Math.random() *16 );
                System.out.printf("%-4d",matr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Номера строк(от 0) : ");
        int k = 0;
        int l = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (matr[i][j] == 5) {
                    k++;
                }
            }
            if (k >= 3) {
                System.out.printf("%3d",i);
            }
            k = 0;
        }

    }
}
