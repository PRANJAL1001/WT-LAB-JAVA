class Base {
    private int x;

    public Base(int x) {
        this.x = x;
        System.out.println("Base constructor called with x = " + x);
    }
}

class Derived extends Base {
    private int y;

    public Derived(int x, int y) {
        super(x);
        this.y = y;
        System.out.println("Derived constructor called with y = " + y);
    }
}

public class LAB7_Q6 {
    public static void main(String[] args) {
        Derived obj = new Derived(10, 20);
    }
}
