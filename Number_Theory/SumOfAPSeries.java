
import java.util.Scanner;

public class SumOfAPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();

        long sum = n * (2 * a + (n - 1) * d) / 2;

        System.out.println(sum);

    }
}
