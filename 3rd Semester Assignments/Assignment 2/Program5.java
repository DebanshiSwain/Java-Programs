// 5. Write a program to find out the factorial of any inputted number.

import java.util.Scanner;
class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int f = 1;
        
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        
        System.out.println("Factorial = " + f);
    }
}
