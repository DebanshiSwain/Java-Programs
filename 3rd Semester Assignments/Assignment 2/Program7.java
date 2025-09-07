// 7. Write a program to check whether an inputted number is palindrome or not.

import java.util.Scanner;
class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int n1 = n, rev = 0;
        
        while (n1 != 0) {
            rev = rev * 10 + n1 % 10;
            n1 /= 10;
        }
        
        if (n == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
