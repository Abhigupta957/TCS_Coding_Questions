
import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char answer = '\0';

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                answer = s.charAt(i);
                break;
            }
        }

        if (answer == '\0') {
            System.out.println("No non-repeating character");
        } else {
            System.out.println(answer);
        }

    }
}
