
import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        while (true) {
            System.out.print(n + " ");

            if (n == 1) {
                break;
            }

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }

        System.out.println();
    }
}
