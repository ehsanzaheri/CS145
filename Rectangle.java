



public class Rectangle {
    private double x1, y1, x2, y2, x3, y3, x4, y4;

    // Constructor
    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        setCoordinates(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    // Method to set coordinates and validate input
    public void setCoordinates(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if (isValidRectangle(x1, y1, x2, y2, x3, y3, x4, y4)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
            this.x4 = x4;
            this.y4 = y4;
        } else {
            throw new IllegalArgumentException("Invalid coordinates for a rectangle in the first quadrant.");
        }
    }

    // Validation method
    private boolean isValidRectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        return x1 >= 0 && x2 >= 0 && x3 >= 0 && x4 >= 0 && y1 >= 0 && y2 >= 0 && y3 >= 0 && y4 >= 0 &&
               x1 <= 20 && x2 <= 20 && x3 <= 20 && x4 <= 20 && y1 <= 20 && y2 <= 20 && y3 <= 20 && y4 <= 20 &&
               x1 == x2 && x3 == x4 && y1 == y4 && y2 == y3; // Checks for valid rectangle
    }

    // Calculate length
    public double getLength() {
        return Math.max(Math.abs(y2 - y1), Math.abs(x3 - x1));
    }

    // Calculate width
    public double getWidth() {
        return Math.min(Math.abs(y2 - y1), Math.abs(x3 - x1));
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    // Calculate area
    public double getArea() {
        return getLength() * getWidth();
    }

    // Check if it's a square
    public boolean isSquare() {
        return getLength() == getWidth();
    }
}
