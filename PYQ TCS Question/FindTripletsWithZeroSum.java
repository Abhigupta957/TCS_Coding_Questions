
import java.util.Arrays;
import java.util.Scanner;

public class FindTripletsWithZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        boolean found = false;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    found = true;
                    break;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

            if (found) {
                break;
            }
        }

        System.out.println(found ? "Yes" : "No");

    }
}
