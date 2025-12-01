/* Question 2 (Strings):
Write a JAVA program to capitalize first letter of each word in an inputted sentence from keyboard.
*/
import java.util.*;
public class Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words) {
            if(word.length() > 0)
                res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(res.toString().trim());
    }
}
