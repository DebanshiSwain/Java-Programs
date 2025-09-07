// 10. Write a program to find out the sum of the individual digits of a number.

import java.util.Scanner;
class P10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        
        System.out.println("The sum of the digits is " + sum);
    }
}
