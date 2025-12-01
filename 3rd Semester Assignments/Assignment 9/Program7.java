/* Question 7 (Strings):
Write a program that receives two strings and checks whether they are equal or not.
*/
import java.util.*;
class Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string");
        String s1 = sc.nextLine();
        System.out.println("Enter the 2nd string");
        String s2 = sc.nextLine();
        if(s1.equals(s2))
            System.out.println("Equal Strings");
        else
            System.out.println("Unequal Strings");
    }
}
