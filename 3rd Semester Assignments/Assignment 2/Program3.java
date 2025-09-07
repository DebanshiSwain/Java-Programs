// 3. Write a program to calculate the roots of a quadratic equation.

import java.util.Scanner;
class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three coefficients: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double d = (b * b) - (4 * a * c); // discriminant
        
        if (d < 0) {
            System.out.println("No real roots exist");
        } else if (d == 0) {
            double root = (-b) / (2 * a);
            System.out.println("The roots are real and equal");
            System.out.println("Root: " + root);
        } else {
            double sqrtD = Math.sqrt(d);
            double root1 = (-b + sqrtD) / (2 * a);
            double root2 = (-b - sqrtD) / (2 * a);
            System.out.println("The roots are real and distinct");
            System.out.println("First root: " + root1);
            System.out.println("Second root: " + root2);
        }
    }
}
