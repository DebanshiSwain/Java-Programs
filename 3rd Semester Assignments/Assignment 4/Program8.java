/*8. Design a class ‘ComplexNum’ to manipulate Complex numbers having data members as real and img. The class should have a parameterized constructor to initialize its data members. It should also have methods displayCompNumber() to display the complex number (in the format 5+3i for example), addCompNumber() to add two Complex numbers. Test these methods by creating main method in another class.*/
import java.util.Scanner;
class ComplexNum {
    double real, img;
    ComplexNum(double real, double img) {
        this.real = real;
        this.img = img;
    }
    void displayCompNumber() {
        System.out.println(real + "+" + img + "i");
    }
    ComplexNum addCompNumber(ComplexNum c) {
        return new ComplexNum(real + c.real, img + c.img);
    }
}
class ComplexNumDriver {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first complex number real and imaginary:");
        ComplexNum c1 = new ComplexNum(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter second complex number real and imaginary:");
        ComplexNum c2 = new ComplexNum(sc.nextDouble(), sc.nextDouble());
        System.out.print("First number:");
        c1.displayCompNumber();
        System.out.print("Second number:");
        c2.displayCompNumber();
        ComplexNum c3 = c1.addCompNumber(c2);
        System.out.print("Sum:");
        c3.displayCompNumber();
    }
}
