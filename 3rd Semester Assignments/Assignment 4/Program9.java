/*9. Design a class ‘Point’ with data members as xCo and yCo. The class should have a parameterized constructor to initialize its data members. Define a method distanceBetPoints() which returns the distance between two points.*/
import java.util.Scanner;
class Point {
    double xCo, yCo;
    Point(double xCo, double yCo) {
        this.xCo = xCo;
        this.yCo = yCo;
    }
    double distanceBetPoints(Point p) {
        return Math.sqrt(Math.pow(xCo - p.xCo, 2) + Math.pow(yCo - p.yCo, 2));
    }
}
class PointDriver {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first point coordinates:");
        Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter second point coordinates:");
        Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.println("Distance between points: " + p1.distanceBetPoints(p2));
    }
}
