import java.util.Scanner;
public class LAB5_QuestionONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter three numbers: ");
        if (sc.hasNextInt()) {
            num1 = sc.nextInt();
        } else {
            System.out.println("Enter valid integer inputs");
            return;
        }
        if (sc.hasNextInt()) {
            num2 = sc.nextInt();
        } else {
            System.out.println("Enter valid integer inputs");
            return;
        }
        if (sc.hasNextInt()) {
            num3 = sc.nextInt();
        } else {
            System.out.println("Enter valid integer inputs");
            return;
        }
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The largest number among the input integers is: " + max);
    }
}
