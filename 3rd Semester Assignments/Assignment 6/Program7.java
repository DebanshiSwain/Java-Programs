/* Question 7 - Part 1 (MyMath Class in sub-package btech.arithmetic):
Create a sub-package called arithmetic under the package btech. The arithmetic package should contain a class MyMath having methods to deal with different arithmetic operations (addition, subtraction, multiplication, division and mod).
*/
package btech.arithmetic;
public class MyMath {
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a-b;
    }
    public int mul(int a,int b) {
        return a*b;
    }
    public double div(int a,int b) {
        return (double)a/b;
    }
    public int mod(int a,int b) {
        return a%b;
    }
}
/* Question 7 - Part 2 (Driver Class):
Create a class Test containing the main method which will use the methods of sub-package arithmetic.
*/
import java.util.*;
import btech.arithmetic.MyMath;
class TestArithmetic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MyMath ob = new MyMath();
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition=" + ob.add(a,b));
        System.out.println("Subtraction=" + ob.sub(a,b));
        System.out.println("Multiplication=" + ob.mul(a,b));
        System.out.println("Division=" + ob.div(a,b));
        System.out.println("Modulus=" + ob.mod(a,b));
    }
}
