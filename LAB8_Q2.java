interface Motor {
    int capacity = 10;
    void run();
    void consume();
}
class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine is running.");
    }
    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }
}
public class LAB8_Q2 {
    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine();
        System.out.println("Capacity of washing machine: " + machine.capacity);
    }
}
