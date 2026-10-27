
import java.util.Scanner;

public class FirstAndSecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > first && arr[i] < second) {
                second = arr[i];
            }
        }

        if (second == Integer.MAX_VALUE) {
            System.out.println("Second smallest does not exist");
        } else {
            System.out.println(first);
            System.out.println(second);
        }

    }
}
