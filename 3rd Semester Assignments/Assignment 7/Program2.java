/* Question 2 (Exception Handling):
Write a java program to read two numbers x and y and calculate x/(x−y). The program should check the value of x−y. Before dividing with x, it should throw an exception if x−y is zero. In the exception handler the program should display appropriate message to the user.
*/
import java.util.*;
class DiffZero extends Exception {
    DiffZero(String s) {
        super(s);
    }
}
public class DiffExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter x: ");
            int x = sc.nextInt();
            System.out.print("Enter y: ");
            int y = sc.nextInt();
            if (x - y == 0)
                throw new DiffZero("x - y is 0, can't divide");
            System.out.println("Ans = " + (x / (x - y)));
        } catch (DiffZero e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Enter numbers only.");
        }
        sc.close();
    }
}
