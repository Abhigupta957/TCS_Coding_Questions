
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char maxChar = s.charAt(0);
        int maxFreq = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxChar = ch;
            }
        }

        System.out.println(maxChar);

    }
}
