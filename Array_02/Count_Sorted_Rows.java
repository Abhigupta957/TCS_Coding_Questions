
public class Count_Sorted_Rows {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 2, 6},
            {7, 8, 9},
            {5, 5, 5}
        };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean sorted = true;

            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j] > arr[i][j + 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                count++;
            }
        }

        System.out.println("Sorted rows: " + count);
    }
}
