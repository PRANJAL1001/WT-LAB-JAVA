import java.util.*;
class Q2{
    int math;
    int chem;
    int phy;
    int total;
    int total_m_p;
    Q2(int math,int chem,int phy)
    {
        this.math = math;
        this.chem = chem;
        this.phy = phy;
        this.total = this.math+this.chem+this.phy;
        this.total_m_p = this.phy+this.math;
    }
    void check()
    {
        if(math >= 60 && phy>=50 && chem >=40 && (total>=200 || total_m_p>=150))
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of ");
        Q2 student[] = new Q2[3];
        int math,phy,chem;
        for(int i=0;i<3;i++)
        {
            System.out.println("Student " + (i+1));
            System.out.print("Math : ");
            math = sc.nextInt();
            System.out.print("Physics : ");
            phy = sc.nextInt();
            System.out.print("Chemistry : ");
            chem = sc.nextInt();
            student[i] = new Q2(math, phy, chem);
            student[i].check();
        }
    }
}
