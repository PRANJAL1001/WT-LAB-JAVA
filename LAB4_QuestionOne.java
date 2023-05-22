import java.util.*;
class LAB4one
{
    String name;
    int rollno;
    String branch;
    char sec;
    Scanner sc = new Scanner(System.in);

    void inputInfo(){
        System.out.println("\nEnter name :");
        name = sc.nextLine();
        System.out.println("\nEnter roll number : ");
        rollno = sc.nextInt();
        System.out.println("\nEnter branch :");
        sc.nextLine();
        branch = sc.nextLine();
        System.out.println("\nEnter section :");
        sec = sc.next().charAt(0);
    }

    void outputInfo(){
        System.out.println("\nName : " + name + " Roll Number : " + rollno + " Branch : " + branch + " Section :" + sec);
    }
}

class LAB4_QuestionOne
{
    public static void main(String[] args)
    {
        LAB4one s1 = new LAB4one();
        LAB4one s2 = new LAB4one();
        LAB4one s3 = new LAB4one();
        s1.inputInfo();
        s1.outputInfo();
        s3.inputInfo();
        s3.outputInfo();
        s2.inputInfo();
        s2.outputInfo();
    }
}