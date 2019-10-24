package modul_3.stringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_9 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку:");
        String str = reader.readLine();
        System.out.println("Наша строка: "+str);
        System.out.println("Количество строчных букв: "+result_1(str));
        System.out.println("Количество строчных букв:"+result_2(str));
    }
    private static int result_1 (String str) {
        int k = 0;
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
               k++;
            }
        }
       return k;
    }
    private static int result_2 (String str) {
        int k = 0;
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                k++;
            }
        }
        return k;
    }
}
