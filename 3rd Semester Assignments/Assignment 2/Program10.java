// 10. Write a program to find out the largest between two numbers using a conditional operator.

import java.util.Scanner;
class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        System.out.println((n1 > n2) ? (n1 + " is larger") : (n2 + " is larger"));
    }
}
