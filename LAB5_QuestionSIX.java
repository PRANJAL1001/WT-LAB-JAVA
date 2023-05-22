public class LAB5_QuestionSIX {
    private static int count = 0;
    public LAB5_QuestionSIX() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static void main(String[] args) {
        LAB5_QuestionSIX obj1 = new LAB5_QuestionSIX();
        LAB5_QuestionSIX obj2 = new LAB5_QuestionSIX();
        LAB5_QuestionSIX obj3 = new LAB5_QuestionSIX();
        System.out.printf("Number of objects created: %d%n", LAB5_QuestionSIX.getCount());
    }
}
