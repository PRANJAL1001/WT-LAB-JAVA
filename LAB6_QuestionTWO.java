import java.util.*;
class MathOperations {

    public int subtract(int a, int b) {
        return a - b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }
}
public class LAB6_QuestionTWO {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.subtract(10, 5)); // Output: 5
        System.out.println(math.subtract(7.5, 2.5)); // Output: 5.0
        System.out.println(math.subtract(20, 5, 3)); // Output: 12
    }
}