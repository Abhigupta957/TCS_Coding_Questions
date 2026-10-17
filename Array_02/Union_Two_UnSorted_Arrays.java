
import java.util.HashSet;
import java.util.Set;

public class Union_Two_UnSorted_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 1, 2};
        int[] arr2 = {3, 2, 5, 4};

        Set<Integer> union = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);
        }

        System.out.println(union);
    }
}
