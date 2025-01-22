



// Object.java
public class Object {
    private int row;
    private int column;
    private double maxValue;

    // Constructor
    public Object(int row, int column, double maxValue) {
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
