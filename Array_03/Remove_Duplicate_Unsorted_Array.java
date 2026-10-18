
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_Unsorted_Array {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 1, 2, 3, 1};

        Set<Integer> unique = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            unique.add(arr[i]);
        }

        System.out.println(unique);
    }
}
