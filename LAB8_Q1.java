import java.util.Scanner;
abstract class Student {
    int rollNo;
    int regNo;
    public Student(int rollNo, int regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }
    abstract void course(String course);
    abstract void branch(String branch);
}
class Generic extends Student {
    public Generic(int rollNo, int regNo) {
        super(rollNo, regNo);
    }
    void course(String course) {
        System.out.println("Course: " + course);
    }
    void branch(String branch) {
        switch (branch) {
            case "computer science":
                System.out.println("Branch: Computer Science");
                break;
            case "electrical engineering":
                System.out.println("Branch: Electrical Engineering");
                break;
            case "mechanical engineering":
                System.out.println("Branch: Mechanical Engineering");
                break;
            case "chemical engineering":
                System.out.println("Branch: Chemical Engineering");
                break;
            case "civil engineering":
                System.out.println("Branch: Civil Engineering");
                break;
            default:
                System.out.println("Invalid branch name");
                break;
        }
    }
}
public class LAB8_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter branch name: ");
        String branch = scanner.nextLine();
        System.out.print("Enter subject name: ");
        String subject = scanner.nextLine();
        Generic student = new Generic(123, 456);
        student.course(subject);
        student.branch(branch);
    }
}
