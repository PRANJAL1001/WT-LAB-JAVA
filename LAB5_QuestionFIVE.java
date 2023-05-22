import java.util.Scanner;
public class LAB5_QuestionFIVE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter the cell values of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Enter the value at (%d, %d): ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        int leftDiagonalSum = matrix[0][0] + matrix[1][1] + matrix[2][2];
        int rightDiagonalSum = matrix[0][2] + matrix[1][1] + matrix[2][0];
        System.out.printf("The sum of the left diagonal elements is %d%n", leftDiagonalSum);
        System.out.printf("The sum of the right diagonal elements is %d%n", rightDiagonalSum);
    }
}
