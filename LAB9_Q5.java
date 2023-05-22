public class LAB9_Q5 {
    private int[] data;
    private int top;
    private int size;

    public LAB9_Q5(int size) {
        data = new int[size];
        top = -1;
        this.size = size;
    }

    public void push(int x) throws StackFullException {
        if (top == size - 1) {
            throw new StackFullException();
        } else {
            data[++top] = x;
        }
    }

    public int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException();
        } else {
            return data[top--];
        }
    }

    public static void main(String[] args) {
        LAB9_Q5 s = new LAB9_Q5(5);
        try {
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(6); 
        } catch (StackFullException e) {
            System.out.println("Stack is full!");
        }
        try {
            int x = s.pop();
            System.out.println(x); 
            x = s.pop();
            System.out.println(x); 
            x = s.pop();
            System.out.println(x);  
            x = s.pop();
            System.out.println(x); 
            x = s.pop();
            System.out.println(x); 
            x = s.pop(); 
        } catch (StackEmptyException e) {
            System.out.println("Stack is empty!");
        }
    }
}
class StackFullException extends Exception {
}
class StackEmptyException extends Exception {
}
