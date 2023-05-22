import java.util.*;
import java.io.*;

public class LAB11_Q2 {
    static void print(String s)
    {
        System.out.print(s);
    }
    static void println(String s)
    {
        System.out.println(s);
    }
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter fw1 = new FileWriter("first.txt");
            FileWriter fw2 = new FileWriter("second.txt");
            while (true) {
                print("Enter a string (or 'exit' to quit): ");
                String input = scanner.nextLine();
                if (input.equals("exit")) {
                    break;
                }
                if (isPalindrome(input)) {
                    fw1.write(input + "\n");
                } else {
                    fw2.write(input + "\n");
                }
            }
            fw1.close();
            fw2.close();
            File file = new File("second.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                int[] freq = new int[256];
                for (char c : line.toCharArray()) {
                    freq[c]++;
                }
                println("Frequency of each character in '" + line + "'is:");
                for (int i = 0; i < 256; i++) {
                    if (freq[i] > 0) {
                        println((char)i + ": " + freq[i]);
                    }
                }
            }
        }
        catch (IOException e) {
            println("An error occurred: " + e.getMessage());
        }
    }
}