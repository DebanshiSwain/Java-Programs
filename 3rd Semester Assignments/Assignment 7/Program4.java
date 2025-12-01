/* Question 4 (Exception Handling):
Write a program to illustrate the use of multiple catch blocks associated with a single try block.
*/
import java.util.*;
public class MultiCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("Div = " + (a / b));
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.print("Enter index: ");
            int i = sc.nextInt();
            System.out.println("Val = " + arr[i]);
        } catch (ArithmeticException e) {
            System.out.println("Div by 0.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index.");
        } catch (InputMismatchException e) {
            System.out.println("Enter numbers only.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
