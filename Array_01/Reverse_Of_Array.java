
public class Reverse_Of_Array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4};
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}
    