
public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 7};
        int[] result = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == result[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[count] = arr[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
