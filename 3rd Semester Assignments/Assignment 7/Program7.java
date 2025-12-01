/* Question 7 (Exception Handling):
Write a program that prompts the user to enter a length in feet and inches and outputs the equivalent length in centimetres. If the user enters a negative number or a non-digit number, throw and handle an appropriate exception and prompt the user to enter another set of numbers.
*/
import java.util.*;
class InvalidLen extends Exception {
    InvalidLen(String s) {
        super(s);
    }
}
public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Feet: ");
                double f = sc.nextDouble();
                System.out.print("Inch: ");
                double i = sc.nextDouble();
                if (f < 0 || i < 0)
                    throw new InvalidLen("Negative not allowed.");
                double cm = (f * 12 + i) * 2.54;
                System.out.println("CM = " + cm);
                break;
            } catch (InvalidLen e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Enter numbers only.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
