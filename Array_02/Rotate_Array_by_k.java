
import java.util.Arrays;

public class Rotate_Array_by_k {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;

        int n = arr.length;
        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
