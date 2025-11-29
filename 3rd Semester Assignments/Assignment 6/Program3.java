/* Question 3:
Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.
*/
import java.util.*;
abstract class Shape {
    abstract void RectangleArea(double l,double b);
    abstract void SquareArea(double s);
    abstract void CircleArea(double r);
}
class Area extends Shape {
    public void RectangleArea(double l,double b) {
        System.out.println("Rectangle Area=" + (l*b));
    }
    public void SquareArea(double s) {
        System.out.println("Square Area=" + (s*s));
    }
    public void CircleArea(double r) {
        System.out.println("Circle Area=" + (3.14*r*r));
    }
}
class ShapeDriver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Area ob = new Area();
        System.out.println("Enter length and breadth of rectangle:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        ob.RectangleArea(l,b);
        System.out.println("Enter side of square:");
        double s = sc.nextDouble();
        ob.SquareArea(s);
        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();
        ob.CircleArea(r);
    }
}
