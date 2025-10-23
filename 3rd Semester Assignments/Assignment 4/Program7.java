/*7. Define a class ‘Box’ that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities [use this keyword].*/
import java.util.Scanner;
class Box {
    double width, height, depth;
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume() {
        return width * height * depth;
    }
}
class BoxDriver {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width, height, depth:");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double d = sc.nextDouble();
        Box b = new Box(w, h, d);
        System.out.println("Volume of box: " + b.volume());
    }
}
