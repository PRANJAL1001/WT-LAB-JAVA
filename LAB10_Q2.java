import java.util.Scanner;

public class LAB10_Q2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        try {
            if (num < 10 || num > 50) {
                throw new Exception("Out of range!");
            }
            int square = num * num;
            System.out.println("The square of " + num + " is " + square);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}