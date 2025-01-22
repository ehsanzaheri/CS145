
// Manager.java
public class Manager {
    public static Object locateLargest(double[][] a) {
        int row = 0;
        int column = 0;
        double maxValue = a[0][0]; // Assume the first element is the largest

        // Loop through the 2D array to find the largest value
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        // Return the largest value as an Object
        return new Object(row, column, maxValue);
    }
}

