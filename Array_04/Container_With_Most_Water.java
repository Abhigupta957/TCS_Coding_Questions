
public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);

            int water = width * minHeight;

            maxWater = Math.max(maxWater, water);

            // Chhoti height wali line ko move karo
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum Water: " + maxWater);
    }
}
