// A helper class that provides a bubble sort method for integer arrays

public class BubbleSortHelper {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Loop through array multiple times
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements and swap if needed
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is sorted
            if (!swapped) break;
        }
    }
}