import java.util.Scanner;

public class MethOverload {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        try {
            meth(num);
            meth(Integer.toString(num));
        } catch (InvalidInputNumberException e) {
            String message = "";
            for (int i = 0; i < e.getMessage().length(); i++) {
                if (i % 2 == 0) {
                    message += Character.toLowerCase(e.getMessage().charAt(i));
                } else {
                    message += Character.toUpperCase(e.getMessage().charAt(i));
                }
            }
            System.out.println("Caught InvalidInputNumberException: " + message);
        }
    }

    public static void meth(int num) throws InvalidInputNumberException {
        if (num <= 0) {
            throw new InvalidInputNumberException("invalid input number");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Select an option:\n1. Calculate factorial sum\n2. Generate Fibonacci series\n3. Generate Geometric Progression\n");
        int option = input.nextInt();
        switch (option) {
            case 1:
                int sum = 0;
                while (num > 0) {
                    int digit = num % 10;
                    sum += factorial(digit);
                    num /= 10;
                }
                System.out.println("Factorial sum: " + sum);
                break;
            case 2:
                int[] fib = new int[num + 1];
                fib[0] = num;
                fib[1] = num + 1;
                for (int i = 2; i <= num; i++) {
                    fib[i] = fib[i - 1] + fib[i - 2];
                }
                System.out.print("Fibonacci series: ");
                for (int i = 0; i <= num; i++) {
                    System.out.print(fib[i] + " ");
                }
                System.out.println();
                break;
            case 3:
                int term = num;
                System.out.print("Geometric Progression: ");
                System.out.print(term + " ");
                for (int i = 1; i < num; i++) {
                    term *= 3;
                    System.out.print(term + " ");
                }
                System.out.println();
                break;
            default:
                System.out.println("Invalid option selected");
        }
    }

    public static void meth(String str) throws InvalidInputNumberException {
        int num = Integer.parseInt(str);
        if (num <= 0) {
            throw new InvalidInputNumberException("invalid input number");
        }
        if (isPalindrome(str)) {
            System.out.println("Palindrome spotted: " + str);
        }
        if (isPrime(num)) {
            System.out.println("Prime number spotted: " + num);
        }
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class InvalidInputNumberException extends Exception {
    public InvalidInputNumberException(String message) {
        super(message);
    }
}

++_



