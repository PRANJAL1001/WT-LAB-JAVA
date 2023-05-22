import java.util.Scanner;
class Interest {
    protected double principal;
    protected double rate;
    protected double time;
    public Interest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
    public void display() {
        System.out.println("Interest calculation is not implemented");
    }
}
class SimpleInterest extends Interest {
    public SimpleInterest(double principal, double rate, double time) {
        super(principal, rate, time);
    }
    public void display() {
        double interest = (principal * rate * time) / 100;
        double amount = principal + interest;
        System.out.printf("Simple Interest%nPrincipal: Rs %.2f%nRate: %.2f%% per annum%nTime: %.2f years%nInterest: Rs %.2f%nAmount: Rs %.2f%n", principal, rate, time, interest, amount);
    }
}
class CompoundInterest extends Interest {
    public CompoundInterest(double principal, double rate, double time) {
        super(principal, rate, time);
    }
    public void display() {
        double amount = principal * Math.pow(1 + (rate / 100), time);
        double interest = amount - principal;
        System.out.printf("Compound Interest%nPrincipal: Rs %.2f%nRate: %.2f%% per annum%nTime: %.2f years%nInterest: Rs %.2f%nAmount: Rs %.2f%n", principal, rate, time, interest, amount);
    }
}
public class LAB7_Q3
 {      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: Rs ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest (in percentage): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
        System.out.println("Enter 1 for Simple Interest, 2 for Compound Interest:");
        int choice = scanner.nextInt();
        Interest interest;
        if (choice == 1) {
            interest = new SimpleInterest(principal, rate, time);
        } else {
            interest = new CompoundInterest(principal, rate, time);
        }
        interest.display();
        scanner.close();
    }
}
