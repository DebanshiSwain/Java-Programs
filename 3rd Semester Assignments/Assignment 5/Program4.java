/*4. Define an abstract class named “Figure”, having data members dim1 and dim2. Extend this class to create two concrete classes named Rectangle and Triangle. Override the getArea() method in the sub classes. Invoke the getArea() method in the main method of another Driver class through the abstract class reference variable.*/
import java.util.Scanner;
abstract class Figure {
    double dim1, dim2;
    Figure(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }
    abstract double getArea();
}
class Rectangle extends Figure {
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }
    double getArea() {
        return dim1 * dim2;
    }
}
class Triangle extends Figure {
    Triangle(double d1, double d2) {
        super(d1, d2);
    }
    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}
class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle, and base and height of triangle:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Figure f;
        f = new Rectangle(l, b);
        System.out.println("Area of Rectangle: " + f.getArea());
        f = new Triangle(base, height);
        System.out.println("Area of Triangle: " + f.getArea());
    }
}
