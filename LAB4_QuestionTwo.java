import java.util.*;
class Grade
{
    int marks;
    Scanner sc = new Scanner(System.in);

    void grading(){
        System.out.println("\nEnter the marks in Chemistry : ");
        marks = sc.nextInt();

        if(marks >= 90 )
            System.out.println("Grade A");
        else if (marks >= 80 && marks < 90)
            System.out.println("Grade B");
        else if (marks >= 70 && marks < 80)
            System.out.println("Grade C");
        else if (marks >= 60 && marks < 70)
            System.out.println("Grade D");
        else if (marks >= 50 && marks < 60)
            System.out.println("Grade E");
        else if (marks >= 40 && marks < 50)
            System.out.println("Grade F");
        else 
            System.out.println("Failed");
    }
}

class LAB4_QuestionTwo{
    public static void main(String[] args){
        Grade ob = new Grade();
        ob.grading();
    }
}