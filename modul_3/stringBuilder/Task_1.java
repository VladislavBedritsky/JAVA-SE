package modul_3.stringBuilder;

public class Task_1 {
    public static void main(String[] args) {

        String str = "   What        an    amazing   world    !   ";
        System.out.println(str);
        System.out.println(result(str));
    }

    private static int result (String str) {
        int k = 0;
        int maxK =0;
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) == ' ') {
               k++;
            } else {
                if(maxK < k) {
                    maxK = k;
                }
                k = 0;
            }
        }
        return maxK;
    }
}
