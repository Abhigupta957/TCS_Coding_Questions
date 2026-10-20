
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result.append(Character.toUpperCase(ch));
            } else if (ch >= 'A' && ch <= 'Z') {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
