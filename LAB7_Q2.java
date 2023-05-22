class Plate 
{
    protected double length;
    protected double width;

    public Plate(double length, double width) 
    {
        System.out.println("Constructing a Plate object");
        this.length = length;
        this.width = width;
    }
}

class Box extends Plate {
    protected double height;

    public Box(double length, double width, double height) {
        super(length, width);
        System.out.println("Constructing a Box object");
        this.height = height;
    }
}

class WoodBox extends Box {
    protected double thickness;

    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        System.out.println("Constructing a WoodBox object");
        this.thickness = thickness;
    }
}

public class LAB7_Q2 {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox(20.0, 15.0, 20.0, 7.0);

        System.out.println("Dimensions of the WoodBox:");
        System.out.printf("Length: %.2f%n", wb.length);
        System.out.printf("Width: %.2f%n", wb.width);
        System.out.printf("Height: %.2f%n", wb.height);
        System.out.printf("Thickness: %.2f%n", wb.thickness);
    }
}
