import java.io.*;
public class LAB11_Q3 {
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
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].length() > 0) {
                        char firstChar = Character.toUpperCase(words[i].charAt(0));
                        String rest = words[i].substring(1);
                        words[i] = firstChar + rest;
                    }
                }
                String capitalizedLine = String.join(" ", words);
                writer.write(capitalizedLine + "\n");
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            println(e.getMessage());
        }
    }
}