interface Employee {
    double earnings();
    double deductions();
    double bonus();
}
class Manager implements Employee {
    double basic;
    Manager(double basic) {
        this.basic = basic;
    }
    public double earnings() {
        double DA = 0.8 * basic;
        double HRA = 0.15 * basic;
        return basic + DA + HRA;
    }
    public double deductions() {
        return 0.12 * basic;
    }
    public double bonus() {
        return 0.0;
    }
}
class Substaff extends Manager {
    Substaff(double basic) {
        super(basic);
    }
    public double bonus() {
        return 0.5 * basic;
    }
}
public class LAB8_Q3 {
    public static void main(String[] args) {
        double basic = 10000.0; 
        Substaff substaff = new Substaff(basic);
        System.out.println("Earnings: " + substaff.earnings());
        System.out.println("Deductions: " + substaff.deductions());
        System.out.println("Bonus: " + substaff.bonus());
    }
}