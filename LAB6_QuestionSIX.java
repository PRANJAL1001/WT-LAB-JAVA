import java.util.Scanner;

public class LAB6_QuestionSIX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double area;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate area of circle");
            System.out.println("2. Calculate area of square");
            System.out.println("3. Calculate area of triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double radius = input.nextDouble();
                    area = Math.PI * radius * radius;
                    System.out.println("Area of circle: " + area);
                    break;
                case 2:
                    System.out.print("Enter side of square: ");
                    double side = input.nextDouble();
                    area = side * side;
                    System.out.println("Area of square: " + area);
                    break;
                case 3:
                    System.out.print("Enter base of triangle: ");
                    double base = input.nextDouble();
                    System.out.print("Enter height of triangle: ");
                    double height = input.nextDouble();
                    area = 0.5 * base * height;
                    System.out.println("Area of triangle: " + area);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            System.out.println();
        } while (choice != 4);
    }
}
