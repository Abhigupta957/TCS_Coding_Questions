
import java.util.Scanner;

public class EncryptString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);
            int count = 0;

            while (i < str.length() && str.charAt(i) == ch) {
                count++;
                i++;
            }

            result.append(ch);
            result.append(count);
        }

        System.out.println(result);
    }
}
