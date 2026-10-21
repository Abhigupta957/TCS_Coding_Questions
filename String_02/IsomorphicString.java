
import java.util.Scanner;

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        if (s.length() != t.length()) {
            System.out.println(false);
            sc.close();
            return;
        }

        int[] map1 = new int[65536];
        int[] map2 = new int[65536];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map1[ch1] != map2[ch2]) {
                System.out.println(false);
                sc.close();
                return;
            }

            map1[ch1] = i + 1;
            map2[ch2] = i + 1;
        }

        System.out.println(true);
    }
}
