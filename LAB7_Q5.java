class Account {
    protected int acc_no;
    protected double balance;

    public Account(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    private String name;
    private String aadhar_no;

    public Person(int acc_no, double balance, String name, String aadhar_no) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    @Override
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
    }
}

public class LAB7_Q5 {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person(101, 5000.0, "PRANJAL", "8979203425");
        persons[1] = new Person(102, 10000.0, "MANISHA", "3456901234");
        persons[2] = new Person(103, 15000.0, "SMRUTI", "5678123456");
        persons[3] = new Person(104, 20000.0, "SHRABANI","7890123478");
        persons[4] = new Person(105, 25000.0, "RAGHAV", "9012345678");

        for (Person person : persons) {
            person.disp();
            System.out.println();
        }
    }
}
