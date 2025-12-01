/* Question 3 (Exception Handling):
Write an exception handling java program to print the index position of an existing integer array. The index value will be entered by user. It will be handled by exception handler if index position is greater than the size of array. In the exception handler the program should display appropriate message to the user.
*/
import java.util.*;
public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        try {
            System.out.print("Enter index: ");
            int i = sc.nextInt();
            System.out.println("Value = " + a[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range.");
        } catch (InputMismatchException e) {
            System.out.println("Enter numbers only.");
        }
        sc.close();
    }
}
