/* Question 6 (Strings):
Write a program that computes your initials from your full name and displays them.
*/
import java.util.*;
class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = sc.nextLine();
        String[] words = name.trim().split(" ");
        StringBuilder initials = new StringBuilder();
        for(String w : words) {
            if(w.length() > 0)
                initials.append(Character.toUpperCase(w.charAt(0)));
        }
        System.out.println("Initials: " + initials.toString());
    }
}
