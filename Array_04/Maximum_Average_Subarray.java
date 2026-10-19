
public class Maximum_Average_Subarray {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid window size");
            return;
        }

        int sum = 0;

        // First window ka sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Window ko slide karo
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];

            maxSum = Math.max(maxSum, sum);
        }

        double maxAverage = (double) maxSum / k;

        System.out.println("Maximum Average: " + maxAverage);
    }
}
