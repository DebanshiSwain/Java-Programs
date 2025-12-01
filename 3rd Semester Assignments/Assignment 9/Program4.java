/* Question 4 (Strings):
Write a Java program to input a string and print the total number of characters present in the string.
*/
import java.util.*;
class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        int c = str.length();
        System.out.println("No: of Characters: " + c);
    }
}
