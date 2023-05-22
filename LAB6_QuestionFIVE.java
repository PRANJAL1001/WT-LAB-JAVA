import java.util.Scanner;

public class LAB6_QuestionFIVE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of students: ");
        n = input.nextInt();

        int[] roll = new int[n];
        String[] name = new String[n];
        double[] cgpa = new double[n];

        // input details of each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");
            System.out.print("Roll number: ");
            roll[i] = input.nextInt();
            System.out.print("Name: ");
            name[i] = input.next();
            System.out.print("CGPA: ");
            cgpa[i] = input.nextDouble();
        }

        // display details of all students
        System.out.println("\nDetails of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + ": Roll=" + roll[i] + ", Name=" + name[i] + ", CGPA=" + cgpa[i]);
        }

        // identify student with lowest cgpa
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (cgpa[i] < cgpa[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("\nStudent with lowest CGPA:");
        System.out.println("Roll=" + roll[minIndex] + ", Name=" + name[minIndex] + ", CGPA=" + cgpa[minIndex]);
    }
}
