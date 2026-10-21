
import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine();
        String pat = sc.nextLine();

        int index = txt.indexOf(pat);

        System.out.println(index);

    }
}
