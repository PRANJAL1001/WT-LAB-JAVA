
import java.util.Scanner;
public class LAB5_QuestionTWO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextInt()) {  
                int num = scanner.nextInt();
                numbers[i] = num;
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            } else {
                scanner.next();
                i--;
            }
        }

        System.out.printf("There are %d even numbers:%n", evenCount);
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.printf("There are %d odd numbers:%n", oddCount);
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}

