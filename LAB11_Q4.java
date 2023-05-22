import java.io.*;
import java.util.*;

public class LAB11_Q4 {
    static void print(String s)
    {
        System.out.print(s);
    }
    static void println(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        print("Enter the source file name: ");
        String sourceFileName = scanner.nextLine();
        print("Enter the destination file name: ");
        String destinationFileName = scanner.nextLine();
        try (FileReader reader = new FileReader(sourceFileName);
             FileWriter writer = new FileWriter(destinationFileName)) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            println("File copied successfully.");
        } catch (IOException e) {
            println(e.getMessage());
        }
    }
}