// 6. Write a program to check whether an inputted number is prime or not.

import java.util.Scanner;
class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }
        
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
        }
        
        System.out.println(n + " is a prime number");
    }
}
