
public class Equal_Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6};

        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];

            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}
