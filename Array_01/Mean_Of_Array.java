
public class Mean_Of_Array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double mean = (double) sum / arr.length;

        System.out.println(mean);
    }
}
