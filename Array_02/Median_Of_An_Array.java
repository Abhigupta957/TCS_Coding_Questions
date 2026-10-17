
import java.util.Arrays;

public class Median_Of_An_Array {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 9};

        Arrays.sort(arr);

        int n = arr.length;
        double median;

        if (n % 2 == 1) {
            median = arr[n / 2];
        } else {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Median: " + median);
    }
}
