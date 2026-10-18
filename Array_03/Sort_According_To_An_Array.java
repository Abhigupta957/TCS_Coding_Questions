
import java.util.Arrays;

public class Sort_According_To_An_Array {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] order = {2, 1, 8, 3};

        int[] result = new int[arr.length];
        boolean[] used = new boolean[arr.length];

        int index = 0;

        // Step 1: Elements ko order array ke according add karo
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == order[i] && !used[j]) {
                    result[index] = arr[j];
                    index++;
                    used[j] = true;
                }
            }
        }

        // Step 2: Remaining elements ko collect karo
        int[] remaining = new int[arr.length - index];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                remaining[k] = arr[i];
                k++;
            }
        }

        // Step 3: Remaining elements ko ascending order mein sort karo
        Arrays.sort(remaining);

        // Step 4: Remaining elements result mein add karo
        for (int i = 0; i < remaining.length; i++) {
            result[index] = remaining[i];
            index++;
        }

        System.out.println(Arrays.toString(result));
    }
}
