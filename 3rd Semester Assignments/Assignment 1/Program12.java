// 12. Write a program to test whether a number is positive, negative or equal to zero.

import java.util.Scanner;
class P12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n < 0)
        {
            System.out.println(n + " is a negative number");
        }
        else if (n > 0)
        {
            System.out.println(n + " is a positive number");
        }
        else
        {
            System.out.println(n + " is zero");
        }
    }
}
