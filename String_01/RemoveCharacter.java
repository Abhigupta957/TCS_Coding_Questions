
import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char remove = sc.next().charAt(0);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != remove) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
