/* Question 3 (Strings):
Write a JAVA program to convert a string into uppercase.
*/
import java.util.*;
class UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String Str = str.toUpperCase();
        System.out.println(Str);
    }
}
