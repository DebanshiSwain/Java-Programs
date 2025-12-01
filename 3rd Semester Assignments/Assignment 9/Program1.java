/* Question 1 (Strings):
Write a JAVA program to read a string from the keyboard and print its reverse. Also check whether the string is palindrome or not.
*/
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println("Reverse: " + rev);
        if(s.equalsIgnoreCase(rev))
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not Palindrome");
    }
}
