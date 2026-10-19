
import java.util.HashMap;
import java.util.Map;

public class Count_Distinct_Every_Window {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid window size");
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();

        // First window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print(map.size() + " ");

        // Remaining windows
        for (int i = k; i < arr.length; i++) {
            int outgoing = arr[i - k];

            // Remove the outgoing element
            if (map.get(outgoing) == 1) {
                map.remove(outgoing);
            } else {
                map.put(outgoing, map.get(outgoing) - 1);
            }

            // Add the incoming element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            System.out.print(map.size() + " ");
        }
    }
}
