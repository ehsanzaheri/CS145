


// Main.java
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];

        // Prompt user to enter the values in the array
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        // Find the location of the largest value
        Location location = ArrayProcessor.locateLargest(array);

        // Print the result
        System.out.println("The location of the largest element is " + location.getMaxValue() +
        " at (" + location.getRow() + ", " + location.getColumn() + ")");
    
    
    }
}
