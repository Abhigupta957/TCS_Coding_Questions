
import java.util.*;

public class SortAccordingToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] brr = new int[m];

        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        boolean[] used = new boolean[n];
        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!used[j] && arr[j] == brr[i]) {
                    result[index++] = arr[j];
                    used[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                result[index++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
