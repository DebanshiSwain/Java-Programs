// 13. Write a recursive program to find the GCD of two inputted numbers.

import java.util.Scanner;
class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd(n1, n2));
    }
    
    static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return gcd(n2, n1 % n2);
        }
    }
}
