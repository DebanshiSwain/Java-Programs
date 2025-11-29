/* Question 8 - Part 1 (Square Class in package org.shapes):
Create a sub-package named shapes under a package org. Create classes representing common geometric shapes like Square, Triangle, Circle. Each class should contain area() and perimeter() methods.
*/
package org.shapes;
public class Square {
    double side;
    public Square(double side) {
        this.side = side;
    }
    public double area() {
        return side*side;
    }
    public double perimeter() {
        return 4*side;
    }
}
/* Question 8 - Part 2 (Triangle Class in package org.shapes) */
package org.shapes;
public class Triangle {
    double base,height,a,b,c;
    public Triangle(double base,double height,double a,double b,double c) {
        this.base = base;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area() {
        return 0.5*base*height;
    }
    public double perimeter() {
        return a+b+c;
    }
}
/* Question 8 - Part 3 (Circle Class in package org.shapes) */
package org.shapes;
public class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return 3.14*radius*radius;
    }
    public double perimeter() {
        return 2*3.14*radius;
    }
}
/* Question 8 - Part 4 (Driver Class using org.shapes) */
import java.util.*;
import org.shapes.*;
class ShapesDriver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square:");
        double s = sc.nextDouble();
        Square sq = new Square(s);
        System.out.println("Area of Square=" + sq.area());
        System.out.println("Perimeter of Square=" + sq.perimeter());
        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        System.out.println("Area of Circle=" + c.area());
        System.out.println("Perimeter of Circle=" + c.perimeter());
        System.out.println("Enter base,height and 3 sides of triangle:");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();
        Triangle t = new Triangle(b,h,a1,a2,a3);
        System.out.println("Area of Triangle=" + t.area());
        System.out.println("Perimeter of Triangle=" + t.perimeter());
    }
}
