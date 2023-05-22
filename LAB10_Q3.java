import java.util.Scanner;

public class LAB10_Q3 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        System.out.println("First string in uppercase: " + string1.toUpperCase());
        System.out.println("First string in lowercase: " + string1.toLowerCase());
        String reverseString1 = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            reverseString1 += string1.charAt(i);
        }
        System.out.println("First string in reverse: " + reverseString1);
        if (string1.equals(string2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
        System.out.print("Enter the index where you want to insert the second string in the first string: ");
        int index = scanner.nextInt();
        String insertedString = string1.substring(0, index) + string2 + string1.substring(index);
        System.out.println("The new string after inserting the second string: " + insertedString);

        scanner.close();
    }

}