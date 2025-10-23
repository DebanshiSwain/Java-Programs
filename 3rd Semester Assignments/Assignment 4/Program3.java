/*3. Declare a class Complex with member real and imaginary part. Define a method initialise() to input the two complex numbers, show() to display the complex number and add() to add the two complex numbers. Declare another class to illustrate the operations of the Complex class.*/
import java.util.Scanner;
class Complex {
    double real1, imag1, real2, imag2;
    void initialise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary part of first number:");
        real1 = sc.nextDouble();
        imag1 = sc.nextDouble();
        System.out.println("Enter real and imaginary part of second number:");
        real2 = sc.nextDouble();
        imag2 = sc.nextDouble();
    }
    void show() {
        System.out.println("First: " + real1 + "+" + imag1 + "i");
        System.out.println("Second: " + real2 + "+" + imag2 + "i");
    }
    void add() {
        System.out.println("Sum: " + (real1 + real2) + "+" + (imag1 + imag2) + "i");
    }
}
class ComplexDriver {
    public static void main(String[] s) {
        Complex c = new Complex();
        c.initialise();
        c.show();
        c.add();
    }
}
