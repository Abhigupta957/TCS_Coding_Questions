
import java.util.LinkedList;
import java.util.Queue;

public class First_Negative_Every_Window {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid window size");
            return;
        }

        Queue<Integer> queue = new LinkedList<>();

        // First window ke negative elements ke indices store karo
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                queue.add(i);
            }
        }

        for (int i = k; ; i++) {
            if (queue.isEmpty()) {
                System.out.print("0 ");
            } else {
                System.out.print(arr[queue.peek()] + " ");
            }

            if (i == arr.length) {
                break;
            }

            // Window se bahar ja chuke negative element ko remove karo
            while (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.poll();
            }

            // Naye negative element ka index add karo
            if (arr[i] < 0) {
                queue.add(i);
            }
        }
    }
}
