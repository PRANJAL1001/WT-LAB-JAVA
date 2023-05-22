public class LAB9_Q1 {
    public static void main(String[] args)
    {
        int ar[] = { 1, 2, 3, 4, 5 };
        try {
            for (int i = 0; i <= ar.length; i++)
                System.out.print(ar[i]+" ");
        }
        catch (Exception e) {
            System.out.println("\nException caught");
        }
    }
}