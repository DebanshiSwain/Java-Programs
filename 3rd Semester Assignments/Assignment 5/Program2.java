/*2. Create a class Figure with instance members dim1 and dim2. Use constructor and area() that returns the area of figure. Create a derived class Rectangle derived from Figure and area() that returns the area of rectangle. Create another derived class Triangle and Square that has area() which returns area of Triangle and Square respectively. Derived class have appropriate constructor. Using method overriding concept test the functionalities of derived class by creating objects and super class memory references in Driver class.*/
import java.util.Scanner;
class Figure {
    double dim1, dim2;
    Figure(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }
    double area() {
        return 0;
    }
}
class Rectangle extends Figure {
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }
    double area() {
        return dim1 * dim2;
    }
}
class Triangle extends Figure {
    Triangle(double d1, double d2) {
        super(d1, d2);
    }
    double area() {
        return 0.5 * dim1 * dim2;
    }
}
class Square extends Figure {
    Square(double d1) {
        super(d1, d1);
    }
    double area() {
        return dim1 * dim2;
    }
}
class Main2 {
    public static void main(String[] args) {
        Figure f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth, side");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double s = sc.nextDouble();
        f = new Rectangle(l, b);
        System.out.println("Area of Rectangle: " + f.area());
        f = new Triangle(l, b);
        System.out.println("Area of Triangle: " + f.area());
        f = new Square(s);
        System.out.println("Area of Square: " + f.area());
    }
}
