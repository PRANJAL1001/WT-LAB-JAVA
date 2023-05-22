import java.util.Scanner;

public class LAB5_QuestionFOUR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter %d elements of the array:%n", size);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] frequency = new int[size];
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = -1;
                }
            }
            if (frequency[i] != -1) {
                frequency[i] = count;
            }
        }
        System.out.println("Element\tFrequency");
        for (int i = 0; i < size; i++) {
            if (frequency[i] != -1) {
                System.out.printf("%d\t%d%n", arr[i], frequency[i]);
            }
        }
    }
}
