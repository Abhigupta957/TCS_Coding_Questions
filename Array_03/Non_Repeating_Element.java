
public class Non_Repeating_Element {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 1, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("Non-repeating element: " + arr[i]);
                break;
            }
        }
    }
}
