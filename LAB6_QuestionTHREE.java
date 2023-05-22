import java.util.Scanner;

public class LAB6_QuestionTHREE
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What shape do you want to calculate the area for?");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int shapeChoice = scanner.nextInt();

        double area = 0.0;

        switch (shapeChoice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = area(radius);
                System.out.println("The area of the circle is: " + area);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = area(base, height);
                System.out.println("The area of the triangle is: " + area);
                break;
            case 3:
                System.out.print("Enter the length of the square: ");
                double length = scanner.nextDouble();
                area = area(length);
                System.out.println("The area of the square is: " + area);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static double area(int length) {
        return length * length;
    }
}
