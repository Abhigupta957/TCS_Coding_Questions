
import java.util.Scanner;

public class MaximumDifferenceZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < s.length(); i++) {
            int value;

            if (s.charAt(i) == '0') {
                value = 1;
            } else {
                value = -1;
            }

            currentSum = Math.max(value, currentSum + value);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum == 0 ? -1 : maxSum);

    }
}
