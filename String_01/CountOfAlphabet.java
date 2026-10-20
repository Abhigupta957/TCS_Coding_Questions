
import java.util.Scanner;

public class CountOfAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z')) {
                count++;
            }
        }

        System.out.println("Count of alphabets: " + count);

    }
}
