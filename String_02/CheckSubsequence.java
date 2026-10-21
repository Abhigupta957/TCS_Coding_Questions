
import java.util.Scanner;

public class CheckSubsequence {

    static boolean isSubSeq(String s1, String s2) {
        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s1.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(isSubSeq(s1, s2));

    }
}
