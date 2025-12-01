/* Question 1 (Exception Handling):
Write an exception handling java program to read two numbers n1, n2 and calculate and print the result of n1/n2. If n2 is Zero (0) then it will be handled by exception handler and again ask the value of n2. In the exception handler the program should display appropriate message to the user.
*/
import java.util.*;
public class DivExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        while (true) {
            try {
                System.out.print("Enter n1: ");
                n1 = sc.nextInt();
                System.out.print("Enter n2: ");
                n2 = sc.nextInt();
                System.out.println("Result = " + (n1 / n2));
                break;
            } catch (ArithmeticException e) {
                System.out.println("n2 can't be 0. Try again.");
            } catch (InputMismatchException e) {
                System.out.println("Enter numbers only.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
