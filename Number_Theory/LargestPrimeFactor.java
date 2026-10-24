
import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long largest = -1;

        while (n % 2 == 0) {
            largest = 2;
            n = n / 2;
        }

        for (long i = 3; i <= n / i; i += 2) {
            while (n % i == 0) {
                largest = i;
                n = n / i;
            }
        }

        if (n > 1) {
            largest = n;
        }

        System.out.println(largest);

    }
}
