package modul_3.arrayOfString;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        String[] camelCase = {"camelCase","snakeCase","forExample","doSomethingSpecialForHer"};
        System.out.println(Arrays.toString(camelCase));
        String[] snake_case = snakeCase(camelCase);
        System.out.println(Arrays.toString(snake_case));
    }
    private static String[] snakeCase(String[] camelCase) {
        String[] sCase = new String[camelCase.length];
        for (int i = 0;i < sCase.length;i++) {
            StringBuilder sBlr = new StringBuilder();
            for (int j = 0;j < camelCase[i].length();j++) {
                char letter = camelCase[i].toCharArray()[j];
                if(Character.isLowerCase(letter)) {
                    sBlr.append(letter);
                } else {
                    sBlr.append("_");
                    sBlr.append(Character.toLowerCase(letter));
                }
            }
            sCase[i] = sBlr.toString();
        }
       return sCase;
    }
}
