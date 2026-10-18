
public class Maximum_Product_Subarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};

        int maxProduct = arr[0];
        int maxEnding = arr[0];
        int minEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            if (num < 0) {
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }

            maxEnding = Math.max(num, maxEnding * num);
            minEnding = Math.min(num, minEnding * num);

            maxProduct = Math.max(maxProduct, maxEnding);
        }

        System.out.println("Maximum Product: " + maxProduct);
    }
}
