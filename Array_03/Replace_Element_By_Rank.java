
import java.util.Arrays;

public class Replace_Element_By_Rank {
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30, 20};

        int n = arr.length;
        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if (sorted[j] < arr[i]) {
                    rank++;
                }
            }

            arr[i] = rank;
        }

        System.out.println(Arrays.toString(arr));
    }
}
