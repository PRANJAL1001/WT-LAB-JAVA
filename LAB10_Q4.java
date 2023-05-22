import java.util.Scanner;

public class LAB10_Q4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String inputString = sc.nextLine();
      String reversedString = new StringBuilder(inputString).reverse().toString();
      if (inputString.equals(reversedString)) {
         System.out.println("The string is a palindrome.");
      } else {
         System.out.println("The string is not a palindrome.");
      }
   }
}
