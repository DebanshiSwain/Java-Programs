/* Question 2:
Define an interface Calculator which has the basic methods add(), sub(), mul() and div(). Define a concrete class named as DemoCalculator that implements the interface. Define the driver class, which create object reference of the interface Calculator and perform all basic operation of the calculator.
*/
import java.util.*;
interface Calculator {
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);
}
class DemoCalculator implements Calculator {
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a-b;
    }
    public int mul(int a,int b) {
        return a*b;
    }
    public int div(int a,int b) {
        return a/b;
    }
}
class CalculatorDriver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Calculator ob = new DemoCalculator();
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum=" + ob.add(a,b));
        System.out.println("Difference=" + ob.sub(a,b));
        System.out.println("Product=" + ob.mul(a,b));
        System.out.println("Quotient=" + ob.div(a,b));
    }
}
