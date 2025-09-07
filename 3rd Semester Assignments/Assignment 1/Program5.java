// 5. Write a program to check a number is odd or even.

import java.util.Scanner;
class P5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n % 2 == 0)
        {
            System.out.println(n + " is an even number");
        }
        else
        {
            System.out.println(n + " is an odd number");
        }
    }
}
