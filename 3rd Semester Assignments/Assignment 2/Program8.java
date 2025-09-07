// 8. Write a program to find out the binary equivalent of any inputted decimal number.

import java.util.Scanner;
class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int bin = 0, rem = 1;
        
        while (n != 0) {
            bin = bin + (n % 2) * rem;
            n /= 2;
            rem *= 10;
        }
        
        System.out.println("Binary equivalent: " + bin);
    }
}
