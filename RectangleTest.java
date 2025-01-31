


import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the rectangle's coordinates:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("y3: ");
        double y3 = scanner.nextDouble();
        System.out.print("x4: ");
        double x4 = scanner.nextDouble();
        System.out.print("y4: ");
        double y4 = scanner.nextDouble();

        try {
            Rectangle rectangle = new Rectangle(x1, y1, x2, y2, x3, y3, x4, y4);

            System.out.printf("Length: %.2f%n", rectangle.getLength());
            System.out.printf("Width: %.2f%n", rectangle.getWidth());
            System.out.printf("Perimeter: %.2f%n", rectangle.getPerimeter());
            System.out.printf("Area: %.2f%n", rectangle.getArea());
            System.out.println("Is square: " + rectangle.isSquare());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
