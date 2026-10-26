
import java.util.Scanner;
import java.util.ArrayList;

public class TwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long total = n * (n + 1) / 2;

        if (total % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");

            ArrayList<Long> set1 = new ArrayList<>();
            ArrayList<Long> set2 = new ArrayList<>();

            long target = total / 2;
            long sum1 = 0;

            for (long i = n; i >= 1; i--) {
                if (sum1 + i <= target) {
                    set1.add(i);
                    sum1 += i;
                } else {
                    set2.add(i);
                }
            }

            System.out.println(set1.size());
            for (long x : set1) {
                System.out.print(x + " ");
            }
            System.out.println();

            System.out.println(set2.size());
            for (long x : set2) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
