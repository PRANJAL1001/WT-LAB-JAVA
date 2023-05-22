import java.util.Scanner;

class Plastic2D {
    protected double length;
    protected double width;

    public Plastic2D(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getCost() {
        return getArea() * 40;
    }
}

class Plastic3D extends Plastic2D {
    private double height;

    public Plastic3D(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public double getCost() {
        return getVolume() * 60;
    }
}

public class LAB7_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length, width and height of the plastic (separated by space): ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        Plastic3D plastic = new Plastic3D(length, width, height);

        System.out.printf("Cost of plastic: Rs %.2f%n", plastic.getCost());

        scanner.close();
    }
}
