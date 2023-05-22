import java.util.Scanner;

public class LAB4_QuestionFour
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
int temp = num;
int reverse = 0;
while (temp != 0) {
    int lastDigit = temp % 10;
    reverse = reverse * 10 + lastDigit;
    temp /= 10;
  }
  
  if (num == reverse) {
    System.out.println("Palindrome successfully detected");
  } else {
    System.out.println("The input number is not a palindrome");
  }
}
}
