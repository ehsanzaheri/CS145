


// Location.java
public class Location {
    private int row;        // Row index of the largest value
    private int column;     // Column index of the largest value
    private double maxValue; // The largest value itself

    // Constructor to initialize the values
    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    // Public getters
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }
}
