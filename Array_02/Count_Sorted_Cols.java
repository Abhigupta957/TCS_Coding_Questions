
public class Count_Sorted_Cols {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 4, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;
        int count = 0;

        for (int j = 0; j < cols; j++) {
            boolean sorted = true;

            for (int i = 0; i < rows - 1; i++) {
                if (arr[i][j] > arr[i + 1][j]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                count++;
            }
        }

        System.out.println("Sorted columns: " + count);
    }
}
