package modul_3.stringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_10 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите предложение:");
        String str = reader.readLine();
        System.out.println("Наше предложение: "+str);
        System.out.println("Количество предложений: "+result(str));
    }
    private static int result(String str) {
        int k = 0;
        for(int i = 0; i < str.length();i++) {
            if(str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
                k++;
            }
        }
        return k;
    }
}
