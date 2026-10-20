import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println(false);
        } else {
            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            System.out.println(Arrays.equals(a, b));
        }

    }
}