
import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long maxEnding = arr[0];
        long minEnding = arr[0];
        long maxProduct = arr[0];

        for (int i = 1; i < n; i++) {
            long x = arr[i];

            if (x < 0) {
                long temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }

            maxEnding = Math.max(x, maxEnding * x);
            minEnding = Math.min(x, minEnding * x);

            maxProduct = Math.max(maxProduct, maxEnding);
        }

        System.out.println(maxProduct);

    }
}
