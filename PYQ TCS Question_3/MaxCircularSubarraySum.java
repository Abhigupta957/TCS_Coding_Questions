
import java.util.Scanner;

public class MaxCircularSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        int maxEnding = arr[0];
        int maxSum = arr[0];

        int minEnding = arr[0];
        int minSum = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(arr[i], minEnding + arr[i]);
            minSum = Math.min(minSum, minEnding);
        }

        if (maxSum < 0) {
            System.out.println(maxSum);
        } else {
            System.out.println(Math.max(maxSum, totalSum - minSum));
        }

    }
}
