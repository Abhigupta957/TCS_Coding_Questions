
import java.util.Scanner;

public class MissingAndRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] count = new int[n + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int missing = -1;
        int repeating = -1;

        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                repeating = i;
            }
        }

        System.out.println("Missing: " + missing);
        System.out.println("Repeating: " + repeating);

    }
}
