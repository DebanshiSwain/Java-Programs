/* Question 5 (Strings):
Write a java program to replace a substring with another string.
*/
import java.util.*;
class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the substring to replace");
        String s1 = sc.nextLine();
        System.out.println("Enter the substring to replace with");
        String s2 = sc.nextLine();
        String res = s.replace(s1, s2);
        System.out.println("Replaced String: " + res);
    }
}
