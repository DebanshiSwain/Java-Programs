/*4. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim()' takes length and breadth of rectangle as parameters and the second method named as 'getArea()' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard. [use ‘this’ keyword]*/
import java.util.Scanner;
class Area {
    double length, breadth;
    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double getArea() {
        return length * breadth;
    }
}
class AreaDriver {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Area a = new Area();
        a.setDim(l, b);
        System.out.println("Area of rectangle: " + a.getArea());
    }
}
