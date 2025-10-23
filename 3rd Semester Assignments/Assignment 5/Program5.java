/*5. Create a class Point2D with the data member x and y coordinate. Use default and parameterised constructor to set the coordinate values and display() to show the coordinates. Create a subclass called Point3D which is derived from the superclass Point2D with data members z coordinate and has constructor to initialize the input and show() method to display the coordinates. Test the methods of both the classes by creating objects in the main method of driver class.*/
import java.util.Scanner;
class Point2D {
    int x, y;
    Point2D() {
        x = 0;
        y = 0;
    }
    Point2D(int a, int b) {
        x = a;
        y = b;
    }
    void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}
class Point3D extends Point2D {
    int z;
    Point3D(int a, int b, int c) {
        super(a, b);
        z = c;
    }
    void show() {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}
class PointMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y for 2D point: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point2D p2 = new Point2D(x, y);
        p2.display();
        System.out.print("Enter x, y and z for 3D point: ");
        x = sc.nextInt();
        y = sc.nextInt();
        int z = sc.nextInt();
        Point3D p3 = new Point3D(x, y, z);
        p3.show();
    }
}
