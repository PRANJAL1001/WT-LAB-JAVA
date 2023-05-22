import java.util.Scanner;

public class LAB6_QuestionSEVEN {
    private int[] nums;

    public void read(int n) {
        nums = new int[n];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
    }

    public void swap() {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = nums[minIndex];
        nums[minIndex] = nums[maxIndex];
        nums[maxIndex] = temp;
    }

    public void display() {
        System.out.print("The new array is: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        LAB6_QuestionSEVEN num = new LAB6_QuestionSEVEN();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = input.nextInt();
        num.read(n);
        num.swap();
        num.display();
    }
}
