import java.util.Scanner;
import java.util.Arrays;

// Program to take user input, sort the array using bubble sort, and display results

public class BubbleSortRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create array and get input
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort using bubble sort
        BubbleSortHelper.bubbleSort(arr);

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        scanner.close();
    }
}