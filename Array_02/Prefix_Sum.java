
import java.util.Arrays;

public class Prefix_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3};
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println(Arrays.toString(prefix));
    }
}
