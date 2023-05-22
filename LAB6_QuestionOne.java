import java.util.Scanner;
class Box {
    double length;
    double width;
    double height;
    public double volume() {
        return length * width * height;
    }
}
public class LAB6_QuestionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the box: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the box: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of the box: ");
        double height = sc.nextDouble();
        Box box = new Box();
        box.length = length;10
        
        box.width = width;
        box.height = height;
        System.out.println("The volume of the box is: " + box.volume());
    }
}
