
public class Max_Subarray_Size_K {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int sum = 0;

        // First window ka sum
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int maxSum = sum;

        // Sliding window
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k];
            sum = sum + arr[i];

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Maximum Sum: " + maxSum);
    }
}
