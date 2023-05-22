import java.util.Scanner;

class Shape {
    protected double area;

    public void showArea() {
        System.out.printf("Area: %.2f sq. units%n", area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public void showArea() {
        System.out.printf("Circle with radius %.2f:%n", radius);
        super.showArea();
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth;
    }

    public void showArea() {
        System.out.printf("Rectangle with length %.2f and breadth %.2f:%n", length, breadth);
        super.showArea();
    }
}

public class LAB7_Q4
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.showArea();

        System.out.print("Enter the length and breadth of the rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.showArea();

        scanner.close();
    }
}
