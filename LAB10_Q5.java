public class LAB10_Q5
 {
    public static void main(String[] args) {
        String input = "yams"; // replace this with your input string
        String ascii = translateToASCII(input);
        System.out.println(ascii);
    }

    public static String translateToASCII(String input) {
        StringBuilder ascii = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int asciiValue = (int) c;
            ascii.append(asciiValue).append(" ");
        }
        return ascii.toString().trim();
    }
}