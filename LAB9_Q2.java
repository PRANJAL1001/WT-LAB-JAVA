import java.util.Scanner;

public class LAB9_Q2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        try {
            processInput(number);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void processInput(double number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        } else {
            double doubleValue = 2 * number;
            System.out.println("Double value of the entered number: " + doubleValue);
        }
    }
    
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String errorMessage) {
        super(errorMessage);
    }
}
