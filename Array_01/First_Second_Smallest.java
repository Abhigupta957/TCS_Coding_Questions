
public class First_Second_Smallest {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 2, 5};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest distinct element does not exist");
        } else {
            System.out.println("First smallest = " + smallest);
            System.out.println("Second smallest = " + secondSmallest);
        }
    }
}
