import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;12
    
    public void setDimensions(double l, double b) {
        length = l;
        breadth = b;
    }
    
    public double getArea() {
        return length * breadth;
    }
    
    public double getPerimeter() {
        return 2 * (length + breadth);
    }
    
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

public class LAB6_QuestionFOUR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Rectangle rect = new Rectangle();
        
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        
        rect.setDimensions(length, breadth);
        rect.display();
    }
}
